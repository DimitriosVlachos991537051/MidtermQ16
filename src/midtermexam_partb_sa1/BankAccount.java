/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_partb_sa1;

/**This class defines a new type of objects called BankAccount.
* Each BankAccount object represents information about one user's bank account
* information, such as their name and balance of money.
* A BankAccount has methods to deposit and withdraw money; these methods make
* sure that the account's balance does not become negative.
* An account also counts the total number of transactions performed on it.
 *
 * @author Megha
 */
public class BankAccount {
    // fields
    String CustName;
    double balance;
    int transactions;   // count of total transactions (deposits and withdrawals)
    
    // Returns a String representation of the current bank account,
    // so that it can be printed by client code.
    public String toString() {
        return CustName + ": $" + balance;
    }
    
    // Deposits (adds) the given amount to this account's balance.
    // The deposit will not be performed if the amount is negative.
    public void deposit(double amount) {
        if (amount >= 0.00) {
            balance = balance + amount;
            transactions++;
        }
    }
    
    // Withdraws (subtracts) the given amount from this account's balance.
    // The withdrawal will not be performed if the amount is negative or if
    // the account does not have enough money to withdraw that amount.
    public void withdraw(double amount) {
        if (amount >= 0.00 && amount <= balance) {
            balance = balance - amount;
            transactions++;
        }
    }
    
}
