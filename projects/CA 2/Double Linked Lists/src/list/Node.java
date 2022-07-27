package list;

import project.Project;

public class Node {

	public Project project;	
	public Node prev, next;
	
	public Node(Project project) {
		this.project = project;
		prev = null;
		next = null;
	}
	
	public Node(Project project, Node prev) {
		this.project = project;
		this.prev = prev;
		next = null;
	}
	
}
