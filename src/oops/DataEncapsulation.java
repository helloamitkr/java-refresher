package oops;

public class DataEncapsulation {
    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    private int bankBalance;

     public static void main(String[] args) {
        DataEncapsulation dataEncapsulation = new DataEncapsulation();
        dataEncapsulation.setBankBalance(1000);
        int newBankBalance = dataEncapsulation.getBankBalance();
        System.out.println(newBankBalance);
    }
}
