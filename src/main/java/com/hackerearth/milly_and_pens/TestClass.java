package com.hackerearth.milly_and_pens;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {

	public static void main(String args[]) throws Exception {

		// FileReader in = new FileReader("C:/Users/gowtham/Desktop/input.txt");
		// BufferedReader br = new BufferedReader(in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String line01 = br.readLine();
			String line02 = br.readLine();
			String line03 = br.readLine();

			line01 = line01.trim();
			String[] parts = line01.split(" ");

			int n = Integer.parseInt(parts[0]);
			int p = Integer.parseInt(parts[1]);
			int m = Integer.parseInt(parts[2]);

			boolean output = true;
			
			boolean[] check = new boolean[n];

			checkInput(line02,check);
			checkInput(line03,check);

			for (int j = 0; j < check.length; j++) {
				if (!check[j]) {
					System.out.println("They can't");
					output = false;
					break;
				}
			}

			if (output) {
				System.out.println("They can");
			}
		}
	}

	private static void checkInput(String numbers,boolean[] check) {
		String[] parts = numbers.split(" ");
		for (int n = 0; n < parts.length; n++) {
			int abc = Integer.parseInt(parts[n]);
			check[abc - 1] = true;
		}

	}
}