package Multithreading;

class BankAccount {
    private int balance = 1000;

//    public void withdraw(int amount) {
//        if (balance >= amount) {
//            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
//            balance -= amount;
//            System.out.println("Remaining balance: " + balance);
//        } else {
//            System.out.println(Thread.currentThread().getName() + " - Insufficient funds");
//        }
//    }
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient funds");
        }
    }}

public class BankTranscationWithoutSynchronizedExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "User-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "User-2");

        t1.start();
        t2.start();
    }
}
class SafeBankAccount1 {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient funds");
        }
    }
}