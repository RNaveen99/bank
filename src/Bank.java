
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c3
 */
public class Bank {
    private static ArrayList<BankAccount> bankAccountList;

    public static void loadBankAccountList(){
        bankAccountList = new ArrayList<>();
    }
    
    public static ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    void addAccount(BankAccount tempAccount) {
        bankAccountList.add(tempAccount);
    }
    
    float getTotalBalance() {
        float totalBalance = 0;
        int n = bankAccountList.size();
        for (int i = 0; i < n; i++) {
            totalBalance += bankAccountList.get(i).getBalance();
        }
        return totalBalance;
    }
    
    float getMinBalanceAccountNumber() throws BankingException{
        int n = bankAccountList.size();
        if (n == 0) {
            throw new BankingException("No accounts in bank");
        }
        BankAccount min = bankAccountList.get(0);
        for (int i = 1; i < n; i++) {
            if (bankAccountList.get(i).getBalance() < min.getBalance()) {
                min = bankAccountList.get(i);
            }
        }
        return min.getAccountNumber();
    }
    
    float getMaxBalanceAccountNumber() throws BankingException {
        int n = bankAccountList.size();
        if (n == 0) {
            throw new BankingException("No accounts in bank");
        }
        BankAccount max = bankAccountList.get(0);
        for (int i = 1; i < n; i++) {
            if (bankAccountList.get(i).getBalance() > max.getBalance()) {
                max = bankAccountList.get(i);
            }
        }
        return max.getAccountNumber();
    }
    
    public static BankAccount findAccount(int accountNumber) throws BankingException {
        int n = bankAccountList.size();
        for (int i = 0; i < n; i++) {
            if (bankAccountList.get(i).getAccountNumber() == accountNumber) {
                return bankAccountList.get(i);
            }
        }
        throw new BankingException("No such Account");
    }
    
    int numberOfAccountsWithSpecificAmount(float amount) {
        int n = bankAccountList.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (bankAccountList.get(i).getAccountNumber() > amount) {
                count++;
            }
        }
        return count;
    }
}
