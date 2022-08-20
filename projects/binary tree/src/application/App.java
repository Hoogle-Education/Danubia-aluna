package application;

import entities.Airport;
import utilities.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {

        BinaryTree<Airport> tree = new BinaryTree<>();
        
        System.out.println("tree has been created...");
        System.out.println("testing if it is empty: " + tree.isEmpty());

        tree.add(new Airport("Airport1", "England", 5));
        tree.add(new Airport("Airport2", "Brazil", 3));
        tree.add(new Airport("Airport3", "Ireland", 2));
        tree.add(new Airport("Airport4", "Canada", 4));
        tree.add(new Airport("Airport5", "USA", 6));
        tree.add(new Airport("Airport6", "Russia", 8));
        tree.add(new Airport("Airport7", "Chile", 7));

        System.out.println("... after add some elements");
        System.out.println("testing if it is empty: " + tree.isEmpty());
        System.out.println("TOTAL AIRPORTS REGISTERED: " + tree.count() + " airports.");

        System.out.println("-----------------------------");
        
        System.out.println("THE BEST AIRPORT REGISTERED: ");
        System.out.println(tree.highest());

        System.out.println("-----------------------------");
        
        System.out.println("THE WORST AIRPORT REGISTERED: ");
        System.out.println(tree.lowest());
        
        System.out.println("-----------------------------");

    }
}
