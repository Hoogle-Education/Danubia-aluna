package application;

public class App {
		
	public static void main(String[] args) {
		
		int[] array = {3, 32, 5, 354, 139, 2345, 113};
		
		System.out.print("iterative results: ");
		showIterativeMultipleOf3(array);
		
		System.out.print("recursive results: ");
		showRecursiveMultipleOf3(array, 0);
		
	}

	public static void showIterativeMultipleOf3(int[] array) {
		for(int i=0; i<array.length; i++) {
			if(array[i]%3 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}
	
	public static void showRecursiveMultipleOf3(int[] array, int pos) {
		
		// caso base
		if(pos == array.length) {
			System.out.println();
			return;
		}
		
		// ação
		if(array[pos]%3 == 0) {
			System.out.print(array[pos] + " ");
		}
		
		// recursão
		showRecursiveMultipleOf3(array, pos+1);
	}
	
}
