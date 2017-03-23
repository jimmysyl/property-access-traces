/*******************************************************************************
 * Copyright (c) 2011 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.flock.model.checker;

import org.eclipse.epsilon.flock.context.MigrationStrategyCheckingContext;

public class ClassifierTypedConstructChecker {

	private final String originalType;
	private final MigrationStrategyCheckingContext context;
	
	public ClassifierTypedConstructChecker(String originalType, MigrationStrategyCheckingContext context) {
		this.originalType = originalType;
		this.context      = context;
	}

	public void check() {
		if (!context.isTypeInOriginalMetamodel(originalType)) {
			context.addWarning("Rule defined for migrating instances of " + originalType + ", " +
			                   "but no type " + originalType + " was found in the original metamodel.");
		}
	}
}
