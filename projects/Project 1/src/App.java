import java.util.Scanner;

public class App {
    
    public static void menu( ){
        System.out.println("### menu ###");
        System.out.println("1 - add new item");
        System.out.println("2 - display all projects");
        System.out.println("3 - Search and display by duration value");
        System.out.println("4 - Average value of duration");
        System.out.println("5 - display the item with last and highest duration");
        System.out.println("6 - Exit the menu");
        System.out.print("Choose your option: ");
    }

    public static void main(String[] args) {
        
        final int MAX_NUM_PROJECTS = 10;

        // variável para ler os dados do terminal
        Scanner input = new Scanner(System.in); 
        
        //array
        Project[] array  = new Project[MAX_NUM_PROJECTS];

        int option;
        int currentIndex = 0;

        System.out.println("##### Welcome to Project flow System! #####");
        System.out.println("Maximum number of projects: " + MAX_NUM_PROJECTS);
        System.out.println("Project description : Name / Duration / Number of People ");

        // estrutura de reptição do-while
        do {
            //show menu
            menu(); 

            // read an option
            option = input.nextInt();
            input.nextLine();


            String name;
            int duration, people;
            double average = 0;
            Project highest = null; 

            if( option == 1 ){

                System.out.println("-------------------------");
                // if i reach the limit
                if(currentIndex == MAX_NUM_PROJECTS){
                    System.out.println("You cannot add another item!");
                }else {                
                    // else add another project    
                    System.out.println("Adding new item!");

                    // reading the project name
                    System.out.print("Project name: ");
                    name = input.nextLine();

                    // trying to read project duration
                    boolean firstTime = true;
                    do {
                        if(!firstTime) {
                            System.out.println("Insert a valid duration between 2 and 12 months");
                        } else firstTime = false;

                        System.out.print("Project duration: ");
                        duration = input.nextInt();
                    }while(duration < 2 || duration > 12);

                    // read the number of people
                    System.out.print("Number of people in Project: ");
                    people = input.nextInt();

                    // attribute project to array
                    array[currentIndex] = new Project(name, duration, people);

                    // currentIndex = currentIndex + 1
                    // increment input position
                    currentIndex++; 
                }
                System.out.println("-------------------------");

            } else if( option == 2 ){

                System.out.println("Displaying all projects: ");
                System.out.println("-------------------------");

                // if array is empty
                if(currentIndex == 0 ) {
                    System.out.println("You have no projects to display");
                    System.out.println("-------------------------");
                }

                // else iterate and show all projects
                for(int i=0; i < currentIndex ; i++){

                    // formating output
                    System.out.print("Project #" + (i+1) + " || ");

                    // using toString
                    System.out.println(array[i]);
                    System.out.println("-------------------------");
                }

            } else if(option == 3){

                System.out.println("Searching by duration!");

                // reading the duration
                System.out.print("Type a duration: ");
                duration = input.nextInt();

                // create a counter to count how many projects match
                int counter = 0;

                System.out.println("-------------------------");
                
                // if array is empty
                if(currentIndex == 0 ){
                    System.out.println("You have no projects to display");
                    System.out.println("-------------------------");
                } else {
                    System.out.println("Founded projects: ");
                }
                    
                // if not empty show projects that match
                for(int i=0; i < currentIndex ; i++){
                    if(array[i].getDuration() == duration ){
                        System.out.print("Project #" + (i+1) + " || ");
                        System.out.println(array[i]);
                        System.out.println("-------------------------");

                        // count printed projects
                        counter++;
                    }
                }

                // if any project has been printed, none of them match
                if( counter == 0 ){
                    System.out.println("Cannot find projects with this duration!");
                    System.out.println("-------------------------");
                }

            } else if( option == 4 ) {
                
                System.out.println("-------------------------");

                // if array is empty
                if(currentIndex == 0 ){
                    System.out.println("Not enough data to calculate");
                }else{

                    // sum in average the total duration of the projects
                    for(int i=0; i < currentIndex ; i++){
                        // x = x + 1 || x += 1
                        average += array[i].getDuration(); 
                    }
    
                    // dividing average by number of projects in array
                    average /= (double)currentIndex;

                    // print average with 3 decimals
                    System.out.printf("The average duration of the projects is %.3f\n", average);
                }
                System.out.println("-------------------------");

            }else if(option == 5){

                System.out.println("-------------------------");

                // if array is empty
                if(currentIndex == 0 ){
                    System.out.println("Not enough data to calculate");
                }else{
                    // suppose the fisrt position is the highest
                    highest = array[0];

                    // search on next positions if any of them is greater or equal than highest
                    for(int i=1; i<currentIndex; i++){
                        // if its true, update the highest project
                        if(array[i].getDuration() >= highest.getDuration()){
                            highest = array[i];
                        }
                    }

                    // show the highest project
                    System.out.println(highest);
                }

                System.out.println("-------------------------");

            } else if (option == 6 ) {
                // if option is equal to 6
                // just continue
                continue;
            }else {
                // if any option match
                // "choose a valid option"
                System.out.println("Choose a valid option");
            }

            // while option different to 6
        } while( option != 6 );

    }
}
