/**
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.edit.provider;


import java.util.Collection;


/**
 * This is the interface needed to populate 
 * the top level items in a TreeViewer, 
 * the items of a ListViewer, 
 * or the rows of a TableViewer. 
 */
public interface IStructuredItemContentProvider
{
  /**
   * This does the same thing as IStructuredContentProvider.getElements.
   */
  public Collection<?> getElements(Object object);
}
