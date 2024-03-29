package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");			//formatos para printar
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Usei abaixo.
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //Convertendo  sdf3 para printar UTC.
		
		Date y1 = sdf1.parse("25/06/2018");				
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //formato ISO 8601 padr�o UTC (recomendado)
		
		Date x1 = new Date(); //data com hor�rio atual
		Date x2 = new Date(System.currentTimeMillis()); //data com hor�rio atual
		
		Date x3 = new Date(1000L * 60L * 60L * 5L); // Calculo para encontrar a data em milisegundos, data especifica --> 5 horas da manh� em 1 de jan de 1970
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("y1: "+ sdf2.format(y1)); //exemplo formatado
		System.out.println("y2: " + y2); // exemplo sem formatar
		
		System.out.println("x1: " + sdf2.format(x1)); // data e hora atual formatada
		System.out.println("x2: " + sdf2.format(x2)); // data e hora atual formatada usando System.currentTimeMillis
	
		System.out.println("x3: " + sdf2.format(x3)); //encontrando hora especifica em 1 de jan de 1970
		
		System.out.println("y3: " + sdf2.format(y3)); // formato ISO 8601
		//POR PADR�O AS MAQUINAS BUSCAM A HORA LOCAL, ENT�O IMPRIME COM O ATRASO DE -3 BRT(EM COMPARA��O A UTC)
	
		
		System.out.println("-----------------------------------------------");
		System.out.println("y1: "+ sdf3.format(y1)); //exemplo formatado
		System.out.println("y2: " + y2); // exemplo sem formatar
		
		System.out.println("x1: " + sdf3.format(x1)); // data e hora atual formatada
		System.out.println("x2: " + sdf3.format(x2)); // data e hora atual formatada usando System.currentTimeMillis
	
		System.out.println("x3: " + sdf3.format(x3)); //encontrando hora especifica em 1 de jan de 1970
		
		System.out.println("y3: " + sdf3.format(y3)); // formato ISO 8601
		
	}

}
