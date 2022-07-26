package application;

import java.util.Scanner;

import entities.PlateChecker;

public class PlateCheckerApp {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("How many validations do you want? : ");
    int size = sc.nextInt();
    String entry = null;

    PlateChecker[] check = new PlateChecker[size];


    for(int i=0; i<size; i++){    
      System.out.print("Insert a new plate to validate: ");
      entry = sc.nextLine();

      check[i] = new PlateChecker(entry);
    }

    System.out.println("-----------------------");

    for(int i=0; i<size; i++){
      System.out.println("Plate #" + (i+1) + " validation returns: " + check[i].getPlate());   
    }
    
  }

}
