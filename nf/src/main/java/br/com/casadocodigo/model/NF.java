package br.com.casadocodigo.model;

public class NF {
	
	private String cliente;
	private String book;
   	private double amount;
	
   	public NF(String cliente, String book, double amount) {
		super();
		this.cliente = cliente;
		this.book = book;
		this.amount = amount;
	}
   
   	public boolean hasValidAmount() {
   		return amount > 0;
   	}
   
}
