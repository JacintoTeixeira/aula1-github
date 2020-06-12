package Pratica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class A99 {

	public static void main(String[] args) throws ParseException {
		
		//Classe Date e SimpleDateFormat
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //Para retirar o ajuste da dato local
		
		Date x1 = new Date(); //Data de agora
		Date x2 = new Date(System.currentTimeMillis()); //Data de agora, passei parametro que tem o nr de milisegundos até agora.
		Date x3 = new Date(0L); /* O java armazena o numero de milisegundos desde a data 1/1/1970,
									no caso, como passamos 0 milisegundos ele devolve essa mesma data,
									com o ajuste da hora da maquina (Portugal)*/
		Date x4 = new Date(1000*60*60*5L); //Data 5 horas depois, 1000 milisegundos(1seg) * 60(seg)  * 60 (min) * 5(horas);
		
		
		Date y1 = sdf1.parse("25/06/2018"); // Aqui guarda no formato convencional
		Date y2 = sdf2.parse("25/06/2018 15:42:07"); // Aqui guarda no formato convencional
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Aqui guarda no formato convencional
		
		
		System.out.println("------------------------------------------------");
		System.out.println("y1: " + sdf2.format(y1)); // Aqui imprime especificado no sdf2 com ajuste de data local
		System.out.println("y2: " + sdf2.format(y2)); 
		System.out.println("y3: " + sdf2.format(y3)); 
		System.out.println("x1: " + sdf2.format(x1)); 
		System.out.println("x2: " + sdf2.format(x2)); 
		System.out.println("x3: " + sdf2.format(x3)); 
		System.out.println("x4: " + sdf2.format(x4)); 
		System.out.println(System.currentTimeMillis());
		
		System.out.println("------------------------------------------------");
		System.out.println("y1: " + sdf3.format(y1)); // Aqui imprime especificado no sdf3 (Sem ajuste de hora local)
		System.out.println("y2: " + sdf3.format(y2)); 
		System.out.println("y3: " + sdf3.format(y3)); 
		System.out.println("x1: " + sdf3.format(x1)); 
		System.out.println("x2: " + sdf3.format(x2)); 
		System.out.println("x3: " + sdf3.format(x3)); 
		System.out.println("x4: " + sdf3.format(x4)); 
		System.out.println(System.currentTimeMillis());
		
		System.out.println("------------------------------------------------");
		System.out.println("y1: " + y1); // Aqui imprime no formato padrao
		System.out.println("y2: " + y2); 
		System.out.println("y3: " + y3); 
		System.out.println("x1: " + x1); 
		System.out.println("x2: " + x2); 
		System.out.println("x3: " + x3); 
		System.out.println("x4: " + x4); 
		System.out.println(System.currentTimeMillis());
		
	}

}
