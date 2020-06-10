package com.learnjava.topic23.multithreading;

//Synchronized method

public class Demo_MultiThreading_16 {

	public static void main(String[] args) {

		BookMyShow2 ob = new BookMyShow2();

		Thread user1 = new BookingAgent2(ob);
		Thread user2 = new BookingAgent2(ob);
		user1.setName("User1");
		user2.setName("User2");
		user1.start();
		user2.start();
	}

}

class BookingAgent2 extends Thread {
	BookMyShow2 bookMyShowObj;

	BookingAgent2(BookMyShow2 obj) {
		bookMyShowObj = obj;

	}

	public void run() {

		bookMyShowObj.bookTicket();
	}
}

class BookMyShow2 {

	static int ticketsAvaliable = 2000;

	public synchronized boolean bookTicket() {

		boolean isTicketBooked = false;

		

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

		return isTicketBooked;

	}
}
