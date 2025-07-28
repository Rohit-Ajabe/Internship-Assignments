class Account {
    private double balance;

    public void setBalance(double bal) {
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000.50);
        System.out.println("Balance: " + acc.getBalance());
    }
}
