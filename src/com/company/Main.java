package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N, p   ;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		double P=0 , D=0 ,raz;
		N=scanner.nextInt();
		p=scanner.nextInt();
		double A[]=new double[N];
		for (int i=0;i<N;i++)
		{
			A[i]=scanner.nextInt();
		}
		for (int i = 0 ;i<N;i++)
		{
			P=+((A[i]/100)*p);
		}
		for (int i = 0 ;i<N;i++)
		{
			D=+Math.ceil(A[i]%p);
		}
		if(P>D) {
			raz = P - D;
			System.out.println(decimalFormat.format(raz));
		}
		if(D>P) {
			raz = D - P;
			System.out.println(decimalFormat.format(raz).replace(',', '.'));
		}

	}
}
