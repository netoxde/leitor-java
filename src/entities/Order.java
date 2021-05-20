package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entites.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:MM:ss");
	
	private List <OrderItem> items = new ArrayList <>();
	private Client cliente;
	
	public Order() {
		}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem (OrderItem item) {
		items.add(item);
	}
	
	public void removeItem (OrderItem item) {
		items.remove(item);
	}
	
	
	public double total() {
		double sum = 0.0;
		
		for (OrderItem x : items) {
			sum += x.subTotal();
			
		}
		return sum;
		
	}
	
	public String toString() {
	
		StringBuilder sb = new StringBuilder();
	        
		    sb.append("Order moment: ");
		    sb.append(sdf.format(moment) + "\n");
		    sb.append("Order status: ");
		    sb.append(getStatus() + "\n");
		   
		for (OrderItem x : items) {
			sb.append(x.getProduto().getName() + ", $");
			sb.append(String.format("%.2f", x.getPrice()) + ", Quantity: ");
			sb.append(x.getQuantity() + ", Subtotal: ");
			sb.append(String.format("%.2f", x.subTotal()) + "\n");
			
		}
		sb.append("------------------------------ \n");
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		
		return sb.toString();
	}

		
	}
	