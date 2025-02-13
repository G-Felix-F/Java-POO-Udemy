package capitulo11.data.hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraInstanciacao {

	public static void main(String[] args) {

		System.out.println("Instanciação: \n(agora) -> Data-Hora\n");

		LocalDate d01 = LocalDate.now();
		System.out.println("Data Atual: " + d01);

		System.out.println("--------------//-------------");

		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Data-Hora Atual: " + d02);

		System.out.println("--------------//-------------");

		Instant d03 = Instant.now();
		System.out.println("Data-Hora Global (Fuso-horário de Londres): " + d03 + "\n");

		System.out.println("Instanciação: \nTexto ISO 8601 -> Data-Hora\n");

		LocalDate d04 = LocalDate.parse("2025-02-01"); 
		System.out.println("Data Formatada: " + d04);
		
		System.out.println("--------------//-------------");
		
		LocalDateTime d05 = LocalDateTime.parse("2025-02-01T15:30:00");
		System.out.println("Data-Hora Formatada: " + d05);
		
		System.out.println("--------------//-------------");
		
		Instant d06 = Instant.parse("2025-02-01T15:30:00Z");
		System.out.println("Data-Hora com Fuso Formatada: " + d06);
		
		d06 = Instant.parse("2025-02-01T15:30:00-03:00");
		System.out.println("Data-Hora com Fuso Formatada: " + d06);
		
		System.out.println("--------------//-------------");
		
		LocalDate d07 = LocalDate.parse("01/02/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Data Personalizada: " + d07);
		
		LocalDateTime d08 = LocalDateTime.parse("01/02/2025 15:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println("Data-Hora Personalizada: " + d08);
		
		System.out.println("--------------//-------------");
		
		LocalDate d09 = LocalDate.of(2025, 02, 01);
		System.out.println("Data (outra Função): " + d09);
		
		System.out.println("--------------//-------------");
		
		LocalDateTime d10 = LocalDateTime.of(2025, 02, 01, 15, 30);
		System.out.println("Data-Hora (outra Função): " + d10);
		
		System.out.println("--------------//-------------");

	}
}