package list;

import project.Project;

public class DoubleLinkedList {

	private Node first, last;

	public DoubleLinkedList() {
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void add(Project project) {
		if (isEmpty()) {
			first = new Node(project);
			last = first;
		} else {
			Node aux = new Node(project, last);
			last.next = aux;
			last = last.next;
		}
	}

	public String currentProjects() {
		String output = "---------------------------------\n";
		Node aux = first;

		while (aux != null) {
			output += aux.project.toString();
			output += "\n---------------------------------\n";
			aux = aux.next;
		}

		return output;
	}
	
	public double getAverage() {
		double total = 0.0, size = 0.0;
		Node aux = first;
		
		while(aux != null) {
			size++;
			total += aux.project.getDuration();
			aux = aux.next;
		}
		
		return (total / size);		
	}
	
	public void remove(String projectCode) {
		
		Node aux = first, toRemove = null;
		
		while(aux != null) {
			if( aux.project.getCode().equals(projectCode) ) {
				toRemove = aux;
				break;
			}
			
			aux = aux.next;
		}
		
		if(toRemove == null) {
			System.out.println("This project code cannot be founded");
			return;
		}
		
		
		if(toRemove == first) {
			first = first.next;
			first.prev = null;
		} else {
			aux = first;

			while(aux.next != toRemove) {
				aux = aux.next;
			}
			
			if(toRemove == last) {
				aux.next = null;
				last = aux;
			} else { 
				aux.next = aux.next.next;
				aux.next.prev = aux;
			}
		}
		
	}

}
