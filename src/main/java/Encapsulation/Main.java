package Encapsulation;

public class Main {

    public static void main(String[] args) {

        BankAccount ac1 = new BankAccount("789456123","Akshay",30000);

        ac1.deposit(5000);
        System.out.println(ac1.getBalance());
        ac1.withdraw(10000);
        System.out.println(ac1.getBalance());
    }
}
