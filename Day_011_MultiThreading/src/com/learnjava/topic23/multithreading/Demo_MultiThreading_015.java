package companyname.demomultithreading;

//Synchronized block

public class Demo_MultiThreading_15 {

	public static void main(String[] args) {

		BookMyShow1 ob = new BookMyShow1();

		Thread user1 = new BookingAgent1(ob);
		Thread user2 = new BookingAgent1(ob);
		user1.setName("User1");
		user2.setName("User2");
		user1.start();
		user2.start();
	}

}

class BookingAgent1 extends Thread {
	BookMyShow1 bookMyShowObj;

	BookingAgent1(BookMyShow1 obj) {
		bookMyShowObj = obj;

	}

	public void run() {

		bookMyShowObj.bookTicket();
	}
}

class BookMyShow1 {

	static int ticketsAvaliable = 1000;

	public boolean bookTicket() {

		boolean isTicketBooked = false;

		synchronized (this) {

			for (int i = 0; i < 100; i++) {

				if (ticketsAvaliable >= i) {

					System.out.println("---------------Thread Name : " + Thread.currentThread().getName()
							+ " Started Booking Tickets ---------");
					ticketsAvaliable = ticketsAvaliable - 1;
					System.out.println(
							"Tickets allocated to " + Thread.currentThread().getName() + " " + ticketsAvaliable);
					System.out.println("Tickets booked Payment And Printing");

					System.out
							.println("Tickets Booked to " + Thread.currentThread().getName() + " " + ticketsAvaliable);
					System.out.println("----------Thread Name : " + Thread.currentThread().getName()
							+ " Ended Ticket Booking Tickets -------");

					isTicketBooked = true;
				}
			}
		}

		return isTicketBooked;

	}
}
