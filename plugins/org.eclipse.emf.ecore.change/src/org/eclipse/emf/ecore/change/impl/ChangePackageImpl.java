/**
 * <copyright>
 *
 * Copyright (c) 2003-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ChangePackageImpl.java,v 1.6 2004/08/12 14:50:50 emerks Exp $
 */
package org.eclipse.emf.ecore.change.impl;


import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.ChangeFactory;
import org.eclipse.emf.ecore.change.ChangeKind;
import org.eclipse.emf.ecore.change.ChangePackage;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.ListChange;
import org.eclipse.emf.ecore.change.ResourceChange;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangePackageImpl extends EPackageImpl implements ChangePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass changeDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eObjectToChangesMapEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureChangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listChangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceChangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum changeKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.emf.ecore.change.ChangePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ChangePackageImpl()
  {
    super(eNS_URI, ChangeFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ChangePackage init()
  {
    if (isInited) return (ChangePackage)EPackage.Registry.INSTANCE.getEPackage(ChangePackage.eNS_URI);

    // Obtain or create and register package
    ChangePackageImpl theChangePackage = (ChangePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ChangePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ChangePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackageImpl.init();

    // Create package meta-data objects
    theChangePackage.createPackageContents();

    // Initialize created meta-data
    theChangePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theChangePackage.freeze();

    return theChangePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChangeDescription()
  {
    return changeDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChangeDescription_ObjectChanges()
  {
    return (EReference)changeDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChangeDescription_ObjectsToDetach()
  {
    return (EReference)changeDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChangeDescription_ObjectsToAttach()
  {
    return (EReference)changeDescriptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChangeDescription_ResourceChanges()
  {
    return (EReference)changeDescriptionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEObjectToChangesMapEntry()
  {
    return eObjectToChangesMapEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEObjectToChangesMapEntry_Key()
  {
    return (EReference)eObjectToChangesMapEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEObjectToChangesMapEntry_Value()
  {
    return (EReference)eObjectToChangesMapEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureChange()
  {
    return featureChangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureChange_FeatureName()
  {
    return (EAttribute)featureChangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureChange_DataValue()
  {
    return (EAttribute)featureChangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureChange_Set()
  {
    return (EAttribute)featureChangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureChange_Value()
  {
    return (EAttribute)featureChangeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureChange_Feature()
  {
    return (EReference)featureChangeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureChange_ReferenceValue()
  {
    return (EReference)featureChangeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureChange_ListChanges()
  {
    return (EReference)featureChangeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListChange()
  {
    return listChangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListChange_Kind()
  {
    return (EAttribute)listChangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListChange_DataValues()
  {
    return (EAttribute)listChangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListChange_Index()
  {
    return (EAttribute)listChangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListChange_MoveToIndex()
  {
    return (EAttribute)listChangeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListChange_Values()
  {
    return (EAttribute)listChangeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListChange_ReferenceValues()
  {
    return (EReference)listChangeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListChange_Feature()
  {
    return (EReference)listChangeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceChange()
  {
    return resourceChangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceChange_ResourceURI()
  {
    return (EAttribute)resourceChangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceChange_Resource()
  {
    return (EAttribute)resourceChangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceChange_Value()
  {
    return (EAttribute)resourceChangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceChange_ListChanges()
  {
    return (EReference)resourceChangeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getChangeKind()
  {
    return changeKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeFactory getChangeFactory()
  {
    return (ChangeFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    changeDescriptionEClass = createEClass(CHANGE_DESCRIPTION);
    createEReference(changeDescriptionEClass, CHANGE_DESCRIPTION__OBJECT_CHANGES);
    createEReference(changeDescriptionEClass, CHANGE_DESCRIPTION__OBJECTS_TO_DETACH);
    createEReference(changeDescriptionEClass, CHANGE_DESCRIPTION__OBJECTS_TO_ATTACH);
    createEReference(changeDescriptionEClass, CHANGE_DESCRIPTION__RESOURCE_CHANGES);

    eObjectToChangesMapEntryEClass = createEClass(EOBJECT_TO_CHANGES_MAP_ENTRY);
    createEReference(eObjectToChangesMapEntryEClass, EOBJECT_TO_CHANGES_MAP_ENTRY__KEY);
    createEReference(eObjectToChangesMapEntryEClass, EOBJECT_TO_CHANGES_MAP_ENTRY__VALUE);

    featureChangeEClass = createEClass(FEATURE_CHANGE);
    createEAttribute(featureChangeEClass, FEATURE_CHANGE__FEATURE_NAME);
    createEAttribute(featureChangeEClass, FEATURE_CHANGE__DATA_VALUE);
    createEAttribute(featureChangeEClass, FEATURE_CHANGE__SET);
    createEAttribute(featureChangeEClass, FEATURE_CHANGE__VALUE);
    createEReference(featureChangeEClass, FEATURE_CHANGE__FEATURE);
    createEReference(featureChangeEClass, FEATURE_CHANGE__REFERENCE_VALUE);
    createEReference(featureChangeEClass, FEATURE_CHANGE__LIST_CHANGES);

    listChangeEClass = createEClass(LIST_CHANGE);
    createEAttribute(listChangeEClass, LIST_CHANGE__KIND);
    createEAttribute(listChangeEClass, LIST_CHANGE__DATA_VALUES);
    createEAttribute(listChangeEClass, LIST_CHANGE__INDEX);
    createEAttribute(listChangeEClass, LIST_CHANGE__MOVE_TO_INDEX);
    createEAttribute(listChangeEClass, LIST_CHANGE__VALUES);
    createEReference(listChangeEClass, LIST_CHANGE__REFERENCE_VALUES);
    createEReference(listChangeEClass, LIST_CHANGE__FEATURE);

    resourceChangeEClass = createEClass(RESOURCE_CHANGE);
    createEAttribute(resourceChangeEClass, RESOURCE_CHANGE__RESOURCE_URI);
    createEAttribute(resourceChangeEClass, RESOURCE_CHANGE__RESOURCE);
    createEAttribute(resourceChangeEClass, RESOURCE_CHANGE__VALUE);
    createEReference(resourceChangeEClass, RESOURCE_CHANGE__LIST_CHANGES);

    // Create enums
    changeKindEEnum = createEEnum(CHANGE_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackageImpl theEcorePackage = (EcorePackageImpl)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(changeDescriptionEClass, ChangeDescription.class, "ChangeDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChangeDescription_ObjectChanges(), this.getEObjectToChangesMapEntry(), null, "objectChanges", null, 0, -1, ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChangeDescription_ObjectsToDetach(), theEcorePackage.getEObject(), null, "objectsToDetach", null, 0, -1, ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChangeDescription_ObjectsToAttach(), theEcorePackage.getEObject(), null, "objectsToAttach", null, 0, -1, ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChangeDescription_ResourceChanges(), this.getResourceChange(), null, "resourceChanges", null, 0, -1, ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(changeDescriptionEClass, null, "apply");

    addEOperation(changeDescriptionEClass, null, "applyAndReverse");

    initEClass(eObjectToChangesMapEntryEClass, Map.Entry.class, "EObjectToChangesMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEObjectToChangesMapEntry_Key(), theEcorePackage.getEObject(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEObjectToChangesMapEntry_Value(), this.getFeatureChange(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureChangeEClass, FeatureChange.class, "FeatureChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeatureChange_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, FeatureChange.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureChange_DataValue(), ecorePackage.getEString(), "dataValue", null, 0, 1, FeatureChange.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureChange_Set(), ecorePackage.getEBoolean(), "set", "true", 0, 1, FeatureChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureChange_Value(), theEcorePackage.getEJavaObject(), "value", null, 0, 1, FeatureChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureChange_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, FeatureChange.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureChange_ReferenceValue(), theEcorePackage.getEObject(), null, "referenceValue", null, 0, 1, FeatureChange.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureChange_ListChanges(), this.getListChange(), null, "listChanges", null, 0, -1, FeatureChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = addEOperation(featureChangeEClass, null, "apply");
    addEParameter(op, theEcorePackage.getEObject(), "originalObject");

    op = addEOperation(featureChangeEClass, null, "applyAndReverse");
    addEParameter(op, theEcorePackage.getEObject(), "originalObject");

    initEClass(listChangeEClass, ListChange.class, "ListChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListChange_Kind(), this.getChangeKind(), "kind", null, 0, 1, ListChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getListChange_DataValues(), ecorePackage.getEString(), "dataValues", null, 0, -1, ListChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getListChange_Index(), ecorePackage.getEInt(), "index", "-1", 0, 1, ListChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getListChange_MoveToIndex(), ecorePackage.getEInt(), "moveToIndex", null, 0, 1, ListChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getListChange_Values(), theEcorePackage.getEJavaObject(), "values", null, 0, -1, ListChange.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListChange_ReferenceValues(), theEcorePackage.getEObject(), null, "referenceValues", null, 0, -1, ListChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListChange_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, ListChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = addEOperation(listChangeEClass, null, "apply");
    addEParameter(op, theEcorePackage.getEEList(), "originalList");

    op = addEOperation(listChangeEClass, null, "applyAndReverse");
    addEParameter(op, theEcorePackage.getEEList(), "originalList");

    initEClass(resourceChangeEClass, ResourceChange.class, "ResourceChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceChange_ResourceURI(), ecorePackage.getEString(), "resourceURI", null, 0, 1, ResourceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceChange_Resource(), theEcorePackage.getEResource(), "resource", null, 0, 1, ResourceChange.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceChange_Value(), theEcorePackage.getEEList(), "value", null, 0, 1, ResourceChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceChange_ListChanges(), this.getListChange(), null, "listChanges", null, 0, -1, ResourceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(resourceChangeEClass, null, "apply");

    addEOperation(resourceChangeEClass, null, "applyAndReverse");

    // Initialize enums and add enum literals
    initEEnum(changeKindEEnum, ChangeKind.class, "ChangeKind");
    addEEnumLiteral(changeKindEEnum, ChangeKind.ADD_LITERAL);
    addEEnumLiteral(changeKindEEnum, ChangeKind.REMOVE_LITERAL);
    addEEnumLiteral(changeKindEEnum, ChangeKind.MOVE_LITERAL);

    // Create resource
    createResource(eNS_URI);
  }

} //ChangePackageImpl
