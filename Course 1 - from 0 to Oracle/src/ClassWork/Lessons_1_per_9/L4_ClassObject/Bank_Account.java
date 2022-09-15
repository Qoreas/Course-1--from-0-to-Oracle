package ClassWork.Lessons_1_per_9.L4_ClassObject;

public class Bank_Account {
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

class Bank_Account_Test {
    public static void main(String[] args) {
        Bank_Account My_Account = new Bank_Account();
        My_Account.id = 1;
        My_Account.name = "Arthur";
        My_Account.balance = 14.22;

        Bank_Account Your_Account = new Bank_Account();
        Your_Account.id = 2;
        Your_Account.name = "Arthur";
        Your_Account.balance = 994.50;

        Bank_Account His_Account = new Bank_Account();
        His_Account.id = 3;
        His_Account.name = "Dasha";
        His_Account.balance = 39999;

        System.out.println(His_Account.balanceDown(10000));
        System.out.println(His_Account.balanceUp(40000));
    }
}


