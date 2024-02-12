package Tehtavat2;

class TicketingSystem {
    private int availableSeats;
    private int reservedSeats;

    public TicketingSystem(int availableSeats) {
        this.availableSeats = availableSeats;
        this.reservedSeats = 0;
    }

    public synchronized boolean reserve(int amount) {
        if (availableSeats > (reservedSeats + amount)) {
            reservedSeats += amount;
            return true;

        } else {
            return false;
        }
    }
}

class Customer implements Runnable {
    private static int i = 0;
    private TicketingSystem ticketingSystem;
    private int amountOfTickets;
    private int customerId;

    Customer(TicketingSystem ticketingSystem) {
        this.ticketingSystem = ticketingSystem;
        this.amountOfTickets = (int) (Math.random() * 3) + 1;
        this.customerId = ++i;
    }
    @Override
    public void run() {
        boolean reserve = ticketingSystem.reserve(amountOfTickets);
        if (reserve) {
            System.out.println("Customer " + customerId + " reserved " + amountOfTickets + " tickets.");
        } else {
            System.out.println("Cusromer " + customerId + " couldn't reserve " + amountOfTickets + " tickets.");
        }
    }
}


public class Task1 {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem(30);

        for (int i = 0; i < 40; i++) {
            Thread customer = new Thread(new Customer(ticketingSystem));
            customer.start();

            try {
                customer.join();
            } catch (InterruptedException e) {
            }
        }
    }
}
