package model.statement;

import java.util.List;

public class MultiAssignment  {
	private List<Assignment> assignments;
	public MultiAssignment(List<Assignment> assignments){
		this.assignments = assignments;
	}
	public List<Assignment> getAssignments(){
		return this.assignments;
	}
}
