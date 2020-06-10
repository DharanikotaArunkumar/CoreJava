package companyname.demomultithreading;

// Problem without synchronized
public class Demo_MultiThreading_014 {

	public static void main(String[] args) {
		
		BookMyShow ob =new BookMyShow();
		
		Thread user1 = new BookingAgent(ob);
		Thread user2 = new BookingAgent(ob);
		
		user1.setName("User1");
		user2.setName("User2");
		
		user1.start();
		user2.start();
	}

}

class BookingAgent extends Thread {
	BookMyShow bookMyShowObj;
	BookingAgent( BookMyShow obj){
		bookMyShowObj=obj;
		
	}

	public void run() {
		
		bookMyShowObj.bookTicket();
	}
}

class BookMyShow {

	static int ticketsAvaliable = 1000;

	public  boolean bookTicket() {

		boolean isTicketBooked = false;

		for (int i = 0; i < 100; i++) {

			if (ticketsAvaliable >= i) {

				System.out.println("---------------Thread Name : " + Thread.currentThread().getName()
						+ " Started Booking Tickets ---------");
				ticketsAvaliable = ticketsAvaliable - 1;
				System.out.println("Tickets allocated to " + Thread.currentThread().getName() + " " + ticketsAvaliable);
				System.out.println("Tickets booked Payment And Printing");

				System.out.println("Tickets Booked to " + Thread.currentThread().getName() + " " + ticketsAvaliable);
				System.out.println("----------Thread Name : " + Thread.currentThread().getName()
						+ " Ended Ticket Booking Tickets -------");

				isTicketBooked = true;
			}
		}

		return isTicketBooked;

	}
}
