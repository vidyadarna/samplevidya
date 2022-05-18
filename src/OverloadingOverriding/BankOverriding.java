package OverloadingOverriding;




public class BankOverriding {
    public static void main(String[] args) {
        Bank ic = new Icici();
        ic.getAccountBalance();


        SBI sbi = new SBI();
        sbi . getAccountBalance();



    }
}
