package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		Integer studants = sc.nextInt();
		Integer[] rooms = new Integer[studants];
		String rentedRooms = "Busy rooms:";

		for (int i = 0; i < rooms.length; i++) {
			System.out.println(String.format("Rent #%d", (i + 1)));
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			Integer room = sc.nextInt();

			for (int j = 0; j < rooms.length; j++) {
				if (rooms[j] == room) {
					System.out.println(String.format("The room #%d is already rented!", (j + 1)));
				}
			}
			
			rooms[i] = room;

			String rentedLine = String.format("%n%d: %s, %s", room, name, email);

			rentedRooms += rentedLine;
		}

		System.out.println(rentedRooms);

		sc.close();
	}
}