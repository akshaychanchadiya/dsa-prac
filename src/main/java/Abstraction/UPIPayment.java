package Abstraction;

public class UPIPayment implements Payment{

    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying ₹" + amount + " via UPI (" + upiId + ")");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " to UPI (" + upiId + ")");
    }
}
