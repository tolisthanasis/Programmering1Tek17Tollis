package variableridentifierare;

import java.util.Scanner;

public class Uppgift8 {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;

		int tiotal1 = Math.floorDiv(a, 10) * 10;
		int tiotal2 = Math.floorDiv(b, 10) * 10;
		System.out.println(tiotal1 / 10 + " Tiotal");
		System.out.println(tiotal2 / 10 + " Tiotal");
		int ental1 = a - tiotal1;
		int ental2 = b - tiotal2;
		System.out.println(ental1 + " Ental");
		System.out.println(ental2 + " Ental");

		tiotal1 = tiotal1 / 10;
		tiotal2 = tiotal2 / 10;
		
		int pos1 = 0;
		int pos2 = 0;
		int pos3 = 0;

		if (ental1 + ental2 == 0) {
			pos1 = 0;
		} else if (ental1 + ental2 == 1) {
			pos1 = 1;
		} else if (ental1 + ental2 == 2) {
			pos1 = 0;
			pos2 = 1;
		}
		
		
		
		System.out.println(tiotal1 + tiotal2 + pos2);
		if (tiotal1 + tiotal2 + pos2 == 0) {
			pos2 = 0;
		} else if (tiotal1 + tiotal2 + pos2 == 1) {
			pos2 = 1;
		} else if (tiotal1 + tiotal2 + pos2 == 2) {
			pos2 = 0;
			pos3 = 1;
		} else if (tiotal1 + tiotal2 + pos2 == 3) {
			pos2 = 1;
			pos3 = 1;
		}
		
		
		System.out.println("" + pos3 + pos2 + pos1);
	}
}