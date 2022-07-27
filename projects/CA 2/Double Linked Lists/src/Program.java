import list.DoubleLinkedList;
import project.Project;
import project.enums.Status;

public class Program {

	public static void main(String[] args) {


		DoubleLinkedList list = new DoubleLinkedList();
		
		list.add(new Project("X123", "Jhon", "Description 1", 100, Status.OFFTRACK));
		list.add(new Project("X124", "Jhon", "Description 2", 200, Status.OFFTRACK));
		list.add(new Project("X125", "Jhon", "Description 3", 300, Status.OFFTRACK));
		list.add(new Project("X126", "Jhon", "Description 4", 400, Status.ONTRACK));
		list.add(new Project("X127", "Jhon", "Description 5", 500, Status.OFFTRACK));
		list.add(new Project("X128", "Jhon", "Description 6", 600, Status.ONTRACK));
		list.add(new Project("X129", "Jhon", "Description 7", 700, Status.OFFTRACK));

		System.out.println("# showing all projects #");
		System.out.println(list.currentProjects());
		
		System.out.println("# removing project X125 #\n");
		list.remove("X125");
		
		System.out.println("# showing all projects after remove X125#");
		System.out.println(list.currentProjects());
		
		System.out.println("Average duration = " + list.getAverage());
		System.out.println("The list is empty ? " + list.isEmpty());
		
	}

}
