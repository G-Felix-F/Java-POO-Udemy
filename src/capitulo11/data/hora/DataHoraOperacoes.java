package capitulo11.data.hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraOperacoes {

	final static LocalDate d01 = LocalDate.parse("2025-02-01");
	final static LocalDateTime d02 = LocalDateTime.parse("2025-02-01T15:30:00");
	final static Instant d03 = Instant.parse("2025-02-01T01:30:00Z");
	
	public static void main(String[] args) {

		System.out.println("Converter Data-Hora Global -> Local");
		
		System.out.println("Data Local: ");
		System.out.println(LocalDate.ofInstant(d03, ZoneId.systemDefault()));
		System.out.println("--------------//-------------");
		
		System.out.println("Data de Portugal: ");
		System.out.println(LocalDate.ofInstant(d03, ZoneId.of("Portugal")));
		System.out.println("--------------//-------------");

		System.out.println("Data-Hora Local: ");
		System.out.println(LocalDateTime.ofInstant(d03, ZoneId.systemDefault()));
		System.out.println("--------------//-------------");
		
		System.out.println("Data-Hora de Portugal: ");
		System.out.println(LocalDateTime.ofInstant(d03, ZoneId.of("Portugal")));
		System.out.println("--------------//-------------");
		
		System.out.println("Dia/Mês/Ano: ");
		System.out.println(d01.getDayOfMonth() + "/" + d01.getMonthValue() + "/" + d01.getYear());
		System.out.println("--------------//-------------");
		
		System.out.println("Hora e Minuto: ");
		System.out.println(d02.getHour() + ":" + d02.getMinute());
		System.out.println("--------------//-------------");
	}
}
