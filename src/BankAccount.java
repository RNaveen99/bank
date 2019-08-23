/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c3
 */
public class BankAccount {
    private int accountNumber;
    private String name;
    private float balance;

    public BankAccount(int accountNumber, String name, float balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    
    public float deposit(float amount) {
        this.balance += amount;
        return this.balance;
    }
    
    public float withdraw(float amount) throws BankingException {
        if (this.balance < amount) {
            throw new BankingException("Balance Insufficient");
        }
        this.balance -= amount;
        return this.balance;
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getName() {
        return name;
    }
    
    public float getBalance() {
        return this.balance;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
