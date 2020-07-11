package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Apication {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println();
		System.out.println("end of program!");
		
		}
	public static void method1() {
		System.out.println("*** metodo 1 ***");
		method2();
		System.out.println("*** metodo 1 encerrado ***");
	}
	
	public static void method2() {
		System.out.println("*** metodo 2 ***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vet = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vet[position]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("position error!");
				e.printStackTrace();
				sc.next();
			}
			catch(InputMismatchException e) {
				System.out.println("imput error!");
			}
		System.out.println("*** metodo 2 encerrado ***");
		sc.close();
	}
}
