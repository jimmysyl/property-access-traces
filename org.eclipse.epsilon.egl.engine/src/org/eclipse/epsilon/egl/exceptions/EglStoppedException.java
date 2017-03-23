/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.egl.exceptions;

import org.eclipse.epsilon.common.parse.AST;

public class EglStoppedException extends EglRuntimeException {

	// Generated by Eclipse
	private static final long serialVersionUID = -475729257704865019L;

	public EglStoppedException(AST ast) {
		super("out.stop() was called.", ast);
	}
}
