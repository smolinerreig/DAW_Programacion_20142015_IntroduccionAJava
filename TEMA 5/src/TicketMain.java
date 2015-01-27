import java.util.*;

public class TicketMain {

	public static void main (String args[]){
		
		Scanner kb=new Scanner (System.in);
		int coins;
		TicketMachine machine = new TicketMachine(80);
		
		System.out.println("Inserte monedinas. Precio del ticket: "+machine.getPrice());
		while(machine.getBalance()<machine.getPrice()){
			coins=kb.nextInt();
			machine.insertMoney(coins);
			machine.getBalance();
			machine.printTicket();
		}
		System.out.println("No se olvide de retirar su cambio: "+machine.refundBalance());
				
	}

}
