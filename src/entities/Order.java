package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entites.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:MM:ss");

	private Date moment;
	private OrderStatus status;
	
	
	private Client cliente;
	private Product produto;
	private OrderItem order;
	
	
	private List<OrderItem> items = new ArrayList<>();
	
	
	public Order() {
		}


	public Order(Date moment, OrderStatus status, Client cliente) {
		
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
		
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
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem (OrderItem item) {
		items.remove(item);
	}
	

	public Product getProduto() {
		return produto;
	}


	public void setProduto(Product produto) {
		this.produto = produto;
	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: ");
		sb.append(sdf.format(this.moment) + "\n");
		sb.append("Order status: ");
		sb.append(this.status + "\n");
		sb.append("Client: ");
		sb.append(getCliente());
		sb.append("\n");
		sb.append("Order items: \n");
		for (OrderItem x : items) {
			sb.append(x.getProduto().getName());
			sb.append(", $");
			sb.append(String.format("%.2f", x.getProduto().getPrice()));
			sb.append(", Quantity: ");
			sb.append(x.getQuantity());
			sb.append(", Subtotal: $");
			sb.append(String.format("%.2f", x.subTotal()) + "\n");
			
		
		}
		
		return sb.toString();
		
	}
	
}