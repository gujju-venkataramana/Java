class Reservation
{
    private int availableSeats = 10;
    synchronized void reserve(String person, int requested)
    {
        System.out.println(person + " entered.");
        System.out.println("Available seats: " + availableSeats + " Requested seats: " + requested);
        if (requested <= availableSeats)
        {
            System.out.println("Seat Available. Reserve now :-)");
            availableSeats -= requested;
            System.out.println(requested + " seats reserved.");
        }
        else System.out.println("Requested seats not available :-)");
        System.out.println(person + " leaving.");
        System.out.println("----------------------------------------------");
    }
}
class Person extends Thread
{
    private Reservation reservation;
    private int seats;
    Person(Reservation r, String name, int seats)
    {
        super(name);
        reservation = r;
        this.seats = seats;
    }
    public void run()
    {
        reservation.reserve(getName(), seats);
    }
}
public class SeatReservationDemo
{
    public static void main(String[] args)
    {
        Reservation r = new Reservation();
        Person p1 = new Person(r, "Person-1", 5);
        Person p2 = new Person(r, "Person-2", 2);
        Person p3 = new Person(r, "Person-3", 4);
        p1.start();
        p2.start();
        p3.start();
        try
        {
            p1.join();
            p2.join();
            p3.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread interrupted");
            Thread.currentThread().interrupt();
        }
    }
}
