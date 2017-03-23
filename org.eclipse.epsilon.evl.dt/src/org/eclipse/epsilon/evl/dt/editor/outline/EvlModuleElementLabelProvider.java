/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.evl.dt.editor.outline;

import org.eclipse.epsilon.eol.EolLabeledBlock;
import org.eclipse.epsilon.eol.dt.editor.outline.EolModuleElementLabelProvider;
import org.eclipse.epsilon.evl.EvlConstraint;
import org.eclipse.epsilon.evl.EvlConstraintContext;
import org.eclipse.epsilon.evl.dt.EvlPlugin;
import org.eclipse.swt.graphics.Image;

public class EvlModuleElementLabelProvider extends EolModuleElementLabelProvider{

	@Override
	public Image getImage(Object element) {
		if (element instanceof EolLabeledBlock){
			return EvlPlugin.getDefault().createImage("icons/" + ((EolLabeledBlock) element).getLabel() +".gif");
		}
		else if (element instanceof EvlConstraintContext) {
			return EvlPlugin.getDefault().createImage("icons/context.gif");
		} 
		else if (element instanceof EvlConstraint) {
			if (((EvlConstraint) element).isCritique()) {
				return EvlPlugin.getDefault().createImage("icons/critique.gif");
			}
			else {
				return EvlPlugin.getDefault().createImage("icons/error.gif");
			}
		} 
		else {
			return super.getImage(element);
		}
	}

}
