package wyykt.gloria.half.c1_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int fValue = in.nextInt();
		in.close();
		
		int cValue = (int) ((fValue - 32) / (9f / 5f));
		
		System.out.println(cValue);

	}

}
