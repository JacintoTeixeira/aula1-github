package Pratica;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class A100 {
	

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		
		System.out.println(sdf.format(d));
		
		//Para manipuplar datas temos de usar a Classe Calendar
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); //O mes começa sempre em ZERO no java de modo que temos sempre de acrescentar 1
		
		//cal.add(Calendar.HOUR_OF_DAY, 4); //ACrescentar 4Horas
		//d = cal.getTime(); //Atualizar a variavel d com as 4 horas
		//System.out.println(sdf.format(d));
		
		System.out.println("Minutes " + minutes);
		System.out.println("Month " + month);
		

	}

}
