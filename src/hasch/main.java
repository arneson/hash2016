package hasch;

import java.util.Scanner;

public class main {
	public static void main(String[] args){
		Scanner s = new Scanner(args[0]);
		String currentRow;
		while(s.hasNext()){
			currentRow = s.nextLine();
			String[] items = currentRow.split(" ");
			Universe.grid = new int[Integer.parseInt(items[0])][Integer.parseInt(items[1])];
			Universe.DEADLINE = Integer.parseInt(items[3]);
			Universe.MAX_LOAD = Integer.parseInt(items[4]);
			Universe.NUMBER_OF_DRONES = Integer.parseInt(items[2]);
		}
		int maxProduct = 0;

	}
}


