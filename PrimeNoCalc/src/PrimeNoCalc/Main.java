package PrimeNoCalc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("please insert number.");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int InpuNum = 0;
		boolean IsValid = false;
		while (!IsValid) {
			try {
				String Value = reader.readLine();
				InpuNum = Integer.parseInt(Value);
				IsValid = true;
			} catch (Exception e) {
				System.out.println("Invalid input.");

			}
		}

		if (PrimeCal(InpuNum)) {
			System.out.println(InpuNum + " Is prime");
			return;
		}
		System.out.println(InpuNum + " Isn't prime");
	}

	public static boolean PrimeCal(int inpuNum) {

		int N = inpuNum;
		boolean prime = true;
		int I = 2;
		while (I <= N / 2) {
			if (N % I == 0) {
				prime = false;
				break;

			}
			if (prime) {
				return true;
			}
		}

		I++;

		return false;

	}
}
