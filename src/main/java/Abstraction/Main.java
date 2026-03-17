package Abstraction;

public class Main {

    public void main(String[] args) {
        Payment p1 = new UPIPayment("akshay@upi");
        Payment p2 = new CreditCardPayment("1234-5678-9012");
        Payment p3 = new NetBankingPayment("HDFC Bank");

        p1.pay(500);
        p1.refund(500);

        p2.pay(1200);
        p2.refund(1200);

        p3.pay(2000);
        p3.refund(2000);
    }
}
