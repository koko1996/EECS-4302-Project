package model.statement.assignment;

import model.statement.Assignment;

/**
 * An abstract class for Expression
 */
public abstract class Expression extends Assignment {
	/**
	 * This needs to be implemented for us to be able to make deep copies.
	 *
	 * @return
	 */
	public abstract Expression clone();
}
