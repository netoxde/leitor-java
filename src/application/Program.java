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

	public static void main(String[] args) throws ParseException {
		
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner (System.in);
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	  
	    System.out.println("Enter cliente data: ");
	    
	    System.out.print("Name: ");
	    String name = sc.nextLine();
	    
	    System.out.print("Email: ");
	    String email = sc.nextLine();
	    
	    System.out.print("Birth data (DD/MM/YYYY): ");
	    Date birthDate = sdf.parse(sc.next());
	    
	    Client cliente = new Client(name, email, birthDate);
	    
	    System.out.println("------------------------------");
	    System.out.print("Status: ");
	    sc.nextLine();
	    String status = sc.nextLine();
	    System.out.println("------------------------------");
	    
	    Order dados = new Order(new Date(), OrderStatus.valueOf(status));
	    
	    System.out.println();
	    System.out.print("How many items to this order? ");
	    int n = sc.nextInt();
	    
	    for(int i = 0; i < n; i++) {
	    	
	    	System.out.println();
	    	System.out.println("Enter #" + (i + 1) + " item data:");
	    	
	    	System.out.print("Product name: ");
	    	sc.nextLine();
	    	String productName = sc.nextLine();
	    	
	    	System.out.print("Product price: ");
	    	Double productPrice = sc.nextDouble();
	    	
	    	System.out.print("Product quantity: ");
	    	Integer productQuantity = sc.nextInt();
	    	
	    	OrderItem produto = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
	    	
	    	dados.addItem(produto);
	    	
	    }
	    System.out.println();
	    System.out.println("------------------------------ ");
	    System.out.println("ORDER SUMMARY: ");
	    System.out.println(cliente);
	    System.out.println(dados);
	    
	    sc.close();
	    
	    
	
	    
	}
}