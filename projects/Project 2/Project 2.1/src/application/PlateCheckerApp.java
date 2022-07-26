package application;

import java.util.Scanner;

import entities.PlateChecker;

public class PlateCheckerApp {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String entry = null;

    do {

      System.out.println("Do you want to validate a plate? (yes/no) : ");
      entry = sc.nextLine();

      // if is not "yes"
      if(!entry.equals("yes")) break;

      System.out.print("Insert a plate to validate: ");
      entry = sc.nextLine();

      // recieve the entry
      PlateChecker plate = new PlateChecker(entry);

      // return the validation
      System.out.println("Plate validate is: " + plate.getPlate());

    } while(true);

  }

}
