package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount();

        myAccount.setAccountHolder("Gulya Kadyrova");
        myAccount.setAccountNumber(5316732767l);
        myAccount.setBalance(89865678765.78);
        myAccount.setType("Saving");

        System.out.println(myAccount);
    }
}
