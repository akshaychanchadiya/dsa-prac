package Abstraction;

public class CreditCardPayment implements Payment{

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying ₹" + amount + " using Credit Card (" + cardNumber + ")");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " to Credit Card (" + cardNumber + ")");
    }
}
