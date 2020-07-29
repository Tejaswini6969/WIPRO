package com.wipro.encapsulation;

public class Book {
	private String name;
	private double price;
	private int qtyInStock;
	private Author auth;
	public Author getAuth() {
		return auth;
	}
	Book(String name,double price,int qtyInStock,Author auth)
	{
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
		this.auth=auth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public static void main(String args[])
	{
		Author auth=new Author("Davidson","davidbooks@gmail.com",'m');
		Book b=new Book("Think Bigger",345.50,10,auth);
		b.setPrice(789.45);
		b.setQtyInStock(20);
		System.out.println("Book Name:"+b.getName());
		System.out.println("Book Price:"+b.getPrice());
		System.out.println("Book In stock:"+b.getQtyInStock());
		System.out.println("The name of the author is :"+b.getAuth().getName());
		System.out.println("The name of the author is :"+b.getAuth().getEmail());
		System.out.println("The name of the author is :"+b.getAuth().getGender());
	}
}
class Author
{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
