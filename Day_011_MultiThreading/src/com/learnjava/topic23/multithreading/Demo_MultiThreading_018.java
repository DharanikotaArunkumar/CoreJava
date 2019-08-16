package companyname.demomultithreading;

public class Demo_MultiThreading_18 {

	public static void main(String[] args) {
		Object venue = new Object();
		Object movie = new Object();
		Thread t1 = new BookTicket(venue, movie);
		Thread t2 = new CancelTicket(venue, movie);
		t1.start();
		t2.start();

	}

}

class BookTicket extends Thread {
	Object venue, movie;

	BookTicket(Object venue, Object movie) {
		this.venue = venue;
		this.movie = movie;
	}

	public void run() {

	
			synchronized (venue) {

				System.out.println("Book Ticket locked Venue");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Waiting for movie to be locked");
				synchronized (movie) {
					System.out.println("Book Ticket locked movie");
				}
			}
	

		}

	}

	class CancelTicket extends Thread {

		Object venue, movie;

		CancelTicket(Object venue, Object movie) {
			this.venue = venue;
			this.movie = movie;
		}

		public void run() {

			synchronized (movie) {
				System.out.println("cancel Ticket locked movie");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Waiting for venue to be locked");
				synchronized (venue) {
					System.out.println("cancel Ticket locked movie");
				}

			}
		}
	}
