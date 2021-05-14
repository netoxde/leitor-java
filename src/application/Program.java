package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
	SimpleDateFormat data1 = new SimpleDateFormat ("dd/MM/yyyy");
	
	
		Date d1 = (Date) data1.parse("29/08/2028");
		
		
		
		System.out.println(data1.format(d1));

        
	    
	 	sc.close();
			
		}
}

		
		
		
		
		
		
		
		
		
		
		
		

	

