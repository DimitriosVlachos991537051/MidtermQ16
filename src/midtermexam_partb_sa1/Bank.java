/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_partb_sa1;

/**
 *
 * @author Megha
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // construct two BankAccount objects
        BankAccount cust1 = new BankAccount();
        cust1.CustName = "Micheal Connor";
        cust1.balance = 1000000.00;
      

        BankAccount cust2 = new BankAccount();
        cust2.CustName = "Nelson bill";
        cust2.balance = 2.00;
       
        
        // make several deposits in an account 
        cust2.deposit(1000.00);
    
        
        // make several withdrawals from an account (some valid, some invalid)
         cust1.withdraw(1.50);
       
        // test our toString method
        System.out.println(cust1);
        System.out.println(cust2);}
    
}
