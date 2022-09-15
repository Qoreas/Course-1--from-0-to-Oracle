package HomeWork.Lessons_1_per_9.L5;

public class BankAccount2 {
    int id;
    String name;
    double balance;

    double balanceUp(double count) {
        balance += count;
        return balance;
    }

    double balanceDown(double count) {
        balance -= count;
        return balance;
    }

}

class BankAccount2_test {
    public static void main(String[] args) {
        BankAccount2 My_Account = new BankAccount2();
        My_Account.id = 1;
        My_Account.name = "Arthur";
        My_Account.balance = 14.22;

        BankAccount2 Your_Account = new BankAccount2();
        Your_Account.id = 2;
        Your_Account.name = "Arthur";
        Your_Account.balance = 994.50;

        BankAccount2 His_Account = new BankAccount2();
        His_Account.id = 3;
        His_Account.name = "Dasha";
        His_Account.balance = 39999;

        System.out.println(His_Account.balanceUp(3000));
        System.out.println(His_Account.balanceDown(10000));
    }
}