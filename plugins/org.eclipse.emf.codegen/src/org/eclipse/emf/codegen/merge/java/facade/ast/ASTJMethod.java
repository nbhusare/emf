/**
 * Copyright (c) 2006-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.codegen.merge.java.facade.ast;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ChildListPropertyDescriptor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.emf.codegen.merge.java.facade.JMethod;


/**
 * Wraps {@link MethodDeclaration} object.
 * 
 * @since 2.2.0
 */
public class ASTJMethod extends ASTJMember<MethodDeclaration> implements JMethod
{
  protected String returnType = UNITIALIZED_STRING;
  protected String[] typeParameters = EMPTY_STRING_ARRAY;
  protected String[] parameterNames = EMPTY_STRING_ARRAY;
  protected String[] parameters = EMPTY_STRING_ARRAY;
  
  /**
   * Array of cached exceptions. Current exceptions is a combination of
   * this array and {@link #addedExceptions}.
   */
  protected String[] exceptions = EMPTY_STRING_ARRAY;
  
  /**
   * List of added exceptions by calling {@link #addException(String)}.
   * This list does not include existing exceptions, nor exceptions set by {@link #setExceptions(String[])}
   */
  protected List<String> addedExceptions = null;  
  
  protected String body = UNITIALIZED_STRING;
  
  /**
   * @param methodDeclaration
   */
  public ASTJMethod(MethodDeclaration methodDeclaration)
  {
    super(methodDeclaration);
  }
  
  @Override
  public void dispose()
  {
    returnType = null;
    typeParameters = null;
    parameterNames = null;
    parameters = null;
    exceptions = null;
    body = null;
    if (addedExceptions != null)
    {
      addedExceptions.clear();
      addedExceptions = null;
    }
    
    super.dispose();
  }

  public boolean isConstructor()
  {
    // always returns original value
    return getASTNode().isConstructor();
  }

  public String getName()
  {
    if (name == UNITIALIZED_STRING)
    {
      name = (isConstructor() ? null : ASTFacadeHelper.toString(getASTNode().getName()));
    }
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
    setNodeProperty(getASTNode(), name, MethodDeclaration.NAME_PROPERTY, ASTNode.SIMPLE_NAME);
  }    
  
  public String getReturnType()
  {
    if (returnType == UNITIALIZED_STRING)
    {
      returnType = getFacadeHelper().toString(getASTNode().getReturnType2());
      if (returnType != null)
      {
        // append extra dimensions since they are not stored in Type object
        for (int i = 0; i < getASTNode().getExtraDimensions(); i++)
        {
          returnType += "[]";
        }
      }
    }
    return returnType;
  }

  private static final ChildListPropertyDescriptor EXTRA_DIMENSIONS2_PROPERTY;
  private static final int DIMENSION;

  static
  {
    ChildListPropertyDescriptor extraDimensions2Property = null;
    int dimension = 0;
    try
    {
      extraDimensions2Property = (ChildListPropertyDescriptor)MethodDeclaration.class.getField("EXTRA_DIMENSIONS2_PROPERTY").get(null);
      dimension = (Integer)ASTNode.class.getField("DIMENSION").get(null);
    }
    catch (Exception exception)
    {
      // Ignore
    }
    EXTRA_DIMENSIONS2_PROPERTY = extraDimensions2Property;
    DIMENSION = dimension;
  }

  @SuppressWarnings("deprecation")
  private void clearExtraDimensions()
  {
    if (getASTNode().getAST().apiLevel() <= 4)
    {
      setNodeProperty(getASTNode(), 0, MethodDeclaration.EXTRA_DIMENSIONS_PROPERTY);
    }
    else
    {
      setListNodeProperty(getASTNode(), EMPTY_STRING_ARRAY, EXTRA_DIMENSIONS2_PROPERTY, DIMENSION);
    }
  }

  public void setReturnType(String type)
  {
    this.returnType = type;
    clearExtraDimensions();
    setTrackedNodeProperty(getASTNode(), type, MethodDeclaration.RETURN_TYPE2_PROPERTY, ASTNode.SIMPLE_TYPE);
  }

  @SuppressWarnings("unchecked")
  public String[] getTypeParameters()
  {
    if (typeParameters == EMPTY_STRING_ARRAY)
    {
      typeParameters = convertASTNodeListToStringArray(getASTNode().typeParameters());
    }
    return typeParameters;
  }

  public void setTypeParameters(String[] typeParameters)
  {
    this.typeParameters = typeParameters;
    setListNodeProperty(getASTNode(), typeParameters, MethodDeclaration.TYPE_PARAMETERS_PROPERTY, ASTNode.TYPE_PARAMETER);
  }

  /**
   * Returns parameter names.
   * <p>
   * Note that if parameters have been changed by {@link #setParameters(String[])} method,
   * this method will <b>not</b> parse parameters, and will <b>not</b> return the new parameter names.
   * This method will return either parameter names set by {@link #setParameterNames(String[])} method
   * or original parameter names.
   * 
   * @see org.eclipse.emf.codegen.merge.java.facade.JMethod#getParameterNames()
   */
  public String[] getParameterNames()
  {
    if (parameterNames == EMPTY_STRING_ARRAY)
    {
      @SuppressWarnings("unchecked")
      List<SingleVariableDeclaration> parameters = getASTNode().parameters();
      
      parameterNames = new String[parameters.size()];
      int j = 0;
      for (SingleVariableDeclaration parameter : parameters)
      {
        parameterNames[j++] = ASTFacadeHelper.toString(parameter.getName());
      }
    }
    return parameterNames;
  }

  /**
   * Returns type erasure of all the types of formal parameters of the original method declaration.
   * <p>
   * This method is used to create a method signature, and match methods by signature.
   * <p>
   * Note that this implementation does not expand types into fully qualified names, nor
   * does it replace type parameters defined for a class or a method.
   * 
   * @see ASTFacadeHelper#getTypeErasure(org.eclipse.jdt.core.dom.Type)
   * @see org.eclipse.emf.codegen.merge.java.facade.JMethod#getParameterTypes()
   */
  public String[] getParameterTypes()
  {
    @SuppressWarnings("unchecked")
    List<SingleVariableDeclaration> parameters = getASTNode().parameters();
    
    String[] ret = new String[parameters.size()];
    int j = 0;
    for (SingleVariableDeclaration parameter : parameters)
    {
      String type = ASTFacadeHelper.getTypeErasure(parameter.getType());
      // append extra dimensions if any
      for (int i = 0; i < parameter.getExtraDimensions(); i++)
      {
        type += "[]";
      }
      
      // append [] if it is variable arity parameter (@see JLS3 8.4.1, http://java.sun.com/docs/books/jls/third_edition/html/classes.html#300870)
      if (parameter.isVarargs())
      {
        type += "[]";
      }
      ret[j++] = type;
    }
    return ret;
  }

  /**
   * Returns all the types of formal parameters of the original method declaration.
   * Note that this implementation does not expand types into fully qualified names, nor
   * does it replace type parameters defined for a class or a method.
   * 
   * @see org.eclipse.emf.codegen.merge.java.facade.JMethod#getFullParameterTypes()
   */
  public String[] getFullParameterTypes()
  {
    @SuppressWarnings("unchecked")
    List<SingleVariableDeclaration> parameters = getASTNode().parameters();
    
    String[] ret = new String[parameters.size()];
    int j = 0;
    for (SingleVariableDeclaration parameter : parameters)
    {
      String type = getFacadeHelper().toString(parameter.getType());
      // append extra dimensions if any
      for (int i = 0; i < parameter.getExtraDimensions(); i++)
      {
        type += "[]";
      }
      
      // append [] if it is variable arity parameter (@see JLS3 8.4.1, http://java.sun.com/docs/books/jls/third_edition/html/classes.html#300870)
      if (parameter.isVarargs())
      {
        type += "[]";
      }
      ret[j++] = type;
    }
    return ret;
  }

  /**
   * Sets parameter names. New parameter names will not be returned by {@link #getParameters()},
   * but will be returned by {@link #getParameterNames()}.
   * 
   * @see #getParameterNames()
   * @see #getParameters()
   * @see org.eclipse.emf.codegen.merge.java.facade.JMethod#setParameterNames(java.lang.String[])
   */
  public void setParameterNames(String[] names)
  {
    @SuppressWarnings("unchecked")
    List<SingleVariableDeclaration> parameters = getASTNode().parameters();

    if (parameters.size() != names.length)
    {
      throw new IllegalArgumentException("Length of names must match number of existing parameters.");
    }

    this.parameterNames = names;
    int i = 0;
    for (SingleVariableDeclaration parameter : parameters)
    {
      setNodeProperty(parameter, names[i++], SingleVariableDeclaration.NAME_PROPERTY, ASTNode.SIMPLE_NAME);
    }
  }

  private static final Method THROWN_EXCEPTION_TYPES_METHOD;

  static
  {
    Method thrownExceptionTypesMethod = null;
    try
    {
      thrownExceptionTypesMethod = MethodDeclaration.class.getMethod("thrownExceptionTypes");
    }
    catch (Exception exception)
    {
      // Ignore.
    }

    THROWN_EXCEPTION_TYPES_METHOD = thrownExceptionTypesMethod;
  }

  @SuppressWarnings({ "deprecation", "unchecked" })
  private <T> List<T> thrownExceptions()
  {
    MethodDeclaration astNode = getASTNode();
    if (astNode.getAST().apiLevel() <= 4)
    {
      List<T> exceptionsList = astNode.thrownExceptions();
      return exceptionsList;
    }
    else
    {
      try
      {
        List<T> exceptionsList = (List<T>)THROWN_EXCEPTION_TYPES_METHOD.invoke(astNode);
        return exceptionsList;
      }
      catch (Exception exception)
      {
        throw new RuntimeException(exception);
      }
    }
  }

  public String[] getExceptions()
  {
    if (exceptions == EMPTY_STRING_ARRAY)
    {
      if (getASTNode().getAST().apiLevel() <= 4)
      {
        List<Name> exceptionsList = thrownExceptions();
        exceptions = new String [exceptionsList.size()];
        int j = 0;
        for (Name exception : exceptionsList)
        {
          exceptions[j++] = ASTFacadeHelper.toString(exception);
        }
      }
      else
      {
        List<SimpleType> thrownExceptionTypes = thrownExceptions();
        exceptions = new String [thrownExceptionTypes.size()];
        int j = 0;
        for (SimpleType exception : thrownExceptionTypes)
        {
          exceptions[j++] = ASTFacadeHelper.toString(exception);
        }
      }
    }
    exceptions = combineArrayAndList(exceptions, addedExceptions);
    return exceptions;
  }

  private static final ChildListPropertyDescriptor THROWN_EXCEPTION_TYPES_PROPERTY;

  static
  {
    ChildListPropertyDescriptor thrownExceptionTypesProperty = null;
    try
    {
      thrownExceptionTypesProperty = (ChildListPropertyDescriptor)MethodDeclaration.class.getField("THROWN_EXCEPTION_TYPES_PROPERTY").get(null);
    }
    catch (Exception exception)
    {
      // Ignore.
    }
    THROWN_EXCEPTION_TYPES_PROPERTY = thrownExceptionTypesProperty;
  }

  @SuppressWarnings("deprecation")
  public void setExceptions(String[] exceptionTypes)
  {
    this.exceptions = exceptionTypes;
    this.addedExceptions = null;
    if (getASTNode().getAST().apiLevel() <= 4)
    {
      setListNodeProperty(getASTNode(), exceptionTypes, MethodDeclaration.THROWN_EXCEPTIONS_PROPERTY, ASTNode.SIMPLE_NAME);
    }
    else
    {
      setListNodeProperty(getASTNode(), exceptionTypes, THROWN_EXCEPTION_TYPES_PROPERTY, ASTNode.SIMPLE_TYPE);
    }
  }

  @SuppressWarnings("deprecation")
  public void addException(String exceptionType)
  {
    if (addedExceptions == null)
    {
      addedExceptions = new ArrayList<String>();
    }
    addedExceptions.add(exceptionType);
    if (getASTNode().getAST().apiLevel() <= 4)
    {
      addValueToListProperty(getASTNode(), exceptionType, MethodDeclaration.THROWN_EXCEPTIONS_PROPERTY, ASTNode.SIMPLE_NAME);
    }
    else
    {
      addValueToListProperty(getASTNode(), exceptionType, THROWN_EXCEPTION_TYPES_PROPERTY, ASTNode.SIMPLE_TYPE);
    }
  }

  public String getBody()
  {
    if (body == UNITIALIZED_STRING)
    {
      body = getFacadeHelper().toString(getASTNode().getBody());
    }
    return body;
  }

  public void setBody(String body)
  {
    this.body = body;
    setTrackedNodeProperty(getASTNode(), body, MethodDeclaration.BODY_PROPERTY, ASTNode.BLOCK);
  }
  
  @Override
  protected String computeQualifiedName()
  {
    return computeQualifiedName(this);
  }
  
  /**
   * Returned parameters will not include new names set by {@link #setParameterNames(String[])}.
   * 
   * @see org.eclipse.emf.codegen.merge.java.facade.JMethod#getParameters()
   */
  @SuppressWarnings("unchecked")
  public String[] getParameters()
  {
    if (parameters == EMPTY_STRING_ARRAY)
    {
      parameters = convertASTNodeListToStringArray(getASTNode().parameters());
    }
    return parameters;
  }

  public void setParameters(String[] parameters)
  {
    this.parameters = parameters;
    setListNodeProperty(getASTNode(), parameters, MethodDeclaration.PARAMETERS_PROPERTY, ASTNode.SINGLE_VARIABLE_DECLARATION);
  }  
}
