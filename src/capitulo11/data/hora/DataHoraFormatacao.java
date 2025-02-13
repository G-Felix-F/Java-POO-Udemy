package capitulo11.data.hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraFormatacao {

	final static LocalDate d01 = LocalDate.parse("2025-02-01");
	final static LocalDateTime d02 = LocalDateTime.parse("2025-02-01T15:30:00");
	final static Instant d03 = Instant.parse("2025-02-01T15:30:00Z");
	
	final static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	final static DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	final static DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
	
	final static DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
	final static DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
	
	public static void main(String[] args) {
		
		System.out.println("Formatação: \n");

		System.out.println("Data: " + d01.format(fmt1));
		
/* Sim, todos as datas abaixo funcionam da mesma forma
		System.out.println("Data: " + fmt1.format(d01));
		System.out.println("Data: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Data: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(d01));
*/
		System.out.println("--------------//-------------");
		
		System.out.println("Data-Hora: " + d02.format(fmt1));
		System.out.println("Data-Hora: " + d02.format(fmt2));
		System.out.println("Data-Hora: " + d02.format(fmt4));
		
		
		System.out.println("--------------//-------------");
		
		System.out.println("Data-Hora Global: " + fmt3.format(d03));
		System.out.println("Data-Hora Global: " + fmt5.format(d03));
		
	}
}