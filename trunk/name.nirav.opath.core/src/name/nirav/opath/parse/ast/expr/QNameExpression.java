/*******************************************************************************
 * Copyright (c) 2009 Nirav Thaker.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package name.nirav.opath.parse.ast.expr;

import name.nirav.opath.Variable;



/**
 * @author Nirav Thaker
 *
 */
public class QNameExpression extends Expression {

	public QNameExpression(Object value) {
		super(value);
	}
	@Override
	public void accept(ExpressionVisitor visitor) {
		visitor.visit(this);
	}
	@Override
	public Object evaluate(Variable context) {
		if(context.getName().equals(getValue()))
			return context.getValue().getValue();
		return new Object();
	}

}
