import java.util.Scanner;

public class App {

    
    public static void menu( ){
        System.out.println("### menu ###");
        System.out.println("1 - add new item");
        System.out.println("2 - display all items");
        System.out.println("3 - Search and display by duration value");
        System.out.println("4 - Average value of duration");
        System.out.println("5 - display the item with last and highest duration");
        System.out.println("6 - Exit the menu");
        System.out.print("Choose your option: ");
    }

    public static void main(String[] args) {
        
        final int MAX_NUM_ITEMS = 10;
        Scanner input = new Scanner(System.in);        
        Item[] array  = new Item[MAX_NUM_ITEMS];
        int option;
        int currentIndex = 0;

        System.out.println("##### Welcome to Item flow System! #####");
        System.out.println("Maximum number of items: " + MAX_NUM_ITEMS);
        System.out.println("Item description : Name / Duration / Amount ");

        do {
            menu(); 
            option = input.nextInt();
            input.nextLine();
            String name;
            int duration, amount;    

            if( option == 1 ){

                System.out.println("-------------------------");
                if(currentIndex == MAX_NUM_ITEMS){
                    System.out.println("You cannot add another item!");
                }else {                    
                    System.out.println("Adding new item!");
                    System.out.print("Item name: ");
                    name = input.nextLine();
                    System.out.print("Item duration: ");
                    duration = input.nextInt();
                    System.out.print("Item amount: ");
                    amount = input.nextInt();

                    array[currentIndex] = new Item(name, duration, amount);
                    currentIndex++; // currentIndex = currentIndex + 1
                }
                System.out.println("-------------------------");

            } else if( option == 2 ){

                System.out.println("Displaying all items: ");
                System.out.println("-------------------------");

                if(currentIndex == 0 ) {
                    System.out.println("You have no items to display");
                    System.out.println("-------------------------");
                }

                for(int i=0; i < currentIndex ; i++){
                    System.out.print("Item #" + (i+1) + " || ");
                    System.out.println(array[i]);
                    System.out.println("-------------------------");
                }

            } else if(option == 3){

                System.out.println("Searching by duration!");
                System.out.print("Type a duration: ");
                duration = input.nextInt();
                
                System.out.println("-------------------------");
                
                if(currentIndex == 0 ){
                    System.out.println("You have no items to display");
                    System.out.println("-------------------------");
                } else {
                    System.out.println("Founded items: ");
                }

                for(int i=0; i < currentIndex ; i++){
                    if(array[i].duration == duration ){
                        System.out.print("Item #" + (i+1) + " || ");
                        System.out.println(array[i]);
                        System.out.println("-------------------------");
                    }
                }
            }

        } while( option != 6 );

    }
}
