package Abstraction;

public class NetBankingPayment implements Payment{

    private String bankName;

    public NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying ₹" + amount + " via NetBanking (" + bankName + ")");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " through NetBanking (" + bankName + ")");
    }
}
