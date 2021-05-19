package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.enums.OrderStatus;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;







public class Program {

	public static void main(String[] args) throws ParseException   {
		
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner (System.in);
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	    
	    System.out.println("Enter Cliente Data:");
	    
	    System.out.print("Name: ");
	    String name = sc.nextLine();
	    
	    System.out.print("Email: ");
	    String email = sc.nextLine();
	    
	    System.out.print("Birth date (DD/MM/YYYY): ");
	    Date birthDate = sdf.parse(sc.next());
	    
	    
	    
	    System.out.println("-------------------------------");
	    
	    System.out.print ("Status: ");
	    sc.nextLine();
	    String status = sc.nextLine();
	    System.out.println("-------------------------------");
	    System.out.print("How many items to this order? ");
	    int n = sc.nextInt();
	    
	    Order dados = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, birthDate));
	    
	    for (int i = 0; i < n; i++) {
	    	System.out.println();
	    	System.out.println("Enter #" + (i + 1) + " item data:");
	    	
	    	System.out.print("Product name: ");
	    	sc.nextLine();
	    	String name1 = sc.nextLine();
	    	
	    	System.out.print("Product price: ");
	    	double price = sc.nextDouble();
	    	
	    	System.out.print("Product quantity: ");
	    	Integer quantity = sc.nextInt();
	    	
	    	
	    	
	    	OrderItem items = new OrderItem(quantity, price, new Product(name1, price));
	    	
	        dados.addItem(items);  
	    }
	    
	    
	    System.out.println("-------------------------------");
	    
	    
	    System.out.println(dados);
	    

	    
	    sc.close();
	    
	}
}