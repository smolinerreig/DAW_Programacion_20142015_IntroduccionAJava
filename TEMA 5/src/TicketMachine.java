import java.util.*;

public class TicketMachine {
	
	private int price;
	private int balance;
	private int total;
	private Scanner kb=new Scanner(System.in);
	
	public TicketMachine(int ticketCost){
		 
		price=ticketCost;
		
	}
	
	public int getPrice(){
		
		return price;
		
	}
	
	
	
	public int getBalance(){
		
		return balance;
		
	}
	
	public void insertMoney(int amount){
	
		if(amount>0){
			balance=balance+amount;
		}
	}
	
	public void printTicket(){
		
		if (balance>=price){
			System.out.println("---Reciba su tiquet---");
			total=total+price;
		}else{
			System.out.println("Cantidad de dinero insuficiente: faltan "+(price-balance)+" céntimos.");}
		
	}
	
	public int refundBalance(){
		
		return balance-price;
		
	}
	
	

}
