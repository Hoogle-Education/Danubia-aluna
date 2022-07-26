package application;

import java.util.Scanner;

import entities.SecurityCode;

public class SecurityCodeApp {
  
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);

    System.out.print("Insert the number of codes that you want: ");
    int n = sc.nextInt();

    SecurityCode codes = new SecurityCode();

    for(String code : codes.generateCodes(n)){
      // show each code generated
      System.out.println(code);
    }

  }

}
