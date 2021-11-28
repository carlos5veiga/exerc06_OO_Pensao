package application;

import java.util.Scanner;

import entities.Estudantes;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Estudantes[] aluguel = new Estudantes[10];
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();

		for (int i=1; i<=rooms; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i +":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			System.out.println();
			aluguel[roomNumber] = new Estudantes(name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for (int i=0; i<10; i++) {
			if (aluguel[i] != null) {
				System.out.println(i + ": " + aluguel[i].getName() + ", " + aluguel[i].getEmail());
			}
		}
		
		System.out.println("Testando o bom dia no github");
		
		sc.close();
	}

}
