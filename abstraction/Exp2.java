abstract class Payment {
    final void paymentStart() {   // cannot be overridden
        System.out.println("Payment Started");
    }
    abstract void pay();
}
class UPIPayment extends Payment {
    void pay() {
        System.out.println("Paid using UPI");
    }
}
class CardPayment extends Payment {
    void pay() {
        System.out.println("Paid using Card");
    }
}
public class Exp2 {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        p1.paymentStart();
        p1.pay();
        Payment p2 = new CardPayment();
        p2.paymentStart();
        p2.pay();
    }
}