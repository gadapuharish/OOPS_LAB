class Reservation{
    protected String name;
    protected String RoomType;
    protected int FloorNumber;
    protected double price;
    public Reservation(String name, String RoomType, int FloorNumber){
        this.name = name;
        this.RoomType = RoomType;
        this.FloorNumber = FloorNumber;
    }
}
class WalkIn extends Reservation{
    public WalkIn(String name, String RoomType, int FloorNumber){
        super(name, RoomType, FloorNumber);
        this.name = "Walk-in";
        this.RoomType = "Standard";
        this.FloorNumber = 0;
        this.price = 2000.0;
    }
}
class Advance extends Reservation{
    public Advance(String name, String RoomType, int FloorNumber){
        super(name, RoomType, FloorNumber);
        if (this.RoomType.equals("Deluxe")) {
            this.price = 2000.0;
        } else {
            this.price = 1500.0;
        }
    }
}
class Reference extends Advance {
    public Reference(Advance og, String newName) {
        super(newName, og.RoomType, og.FloorNumber);
        this.price = og.price;
    }
}
public class RoyalStay {
    public static void main(String[] args) {
        WalkIn walkIn = new WalkIn("Alice Johnson", "Standard", 0);
        System.out.println("Walk-in Reservation:");
        System.out.println("Name: " + walkIn.name);
        System.out.println("Room Type: " + walkIn.RoomType);
        System.out.println("Floor Number: " + walkIn.FloorNumber);
        System.out.println("Price: " + walkIn.price);

        Advance advance = new Advance("John Doe", "Deluxe", 5);
        System.out.println("\nAdvance Reservation:");
        System.out.println("Name: " + advance.name);
        System.out.println("Room Type: " + advance.RoomType);
        System.out.println("Floor Number: " + advance.FloorNumber);
        System.out.println("Price: " + advance.price);

        Reference reference = new Reference(advance, "Jane Smith");
        System.out.println("\nReference Reservation:");
        System.out.println("Name: " + reference.name);
        System.out.println("Room Type: " + reference.RoomType);
        System.out.println("Floor Number: " + reference.FloorNumber);
        System.out.println("Price: " + reference.price);
    }
    
}
