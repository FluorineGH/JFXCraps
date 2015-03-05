/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author jcalvert
 */
public class BaseAccount implements java.io.Serializable{
    private String Name;
    private String Password;
    private int Bankroll;
    private int Balance;
    
    public BaseAccount(String n, String p, int i, int b){
        Name = n;
        Password = p;
        Bankroll = i;
        Balance = b;
    }
  
    public String getName(){
      return Name;
    }

    public String getPassword(){
      return Password;
    }
    
    public int getBankroll(){
      return Bankroll;
    }
    
    public void setBankroll(int b){
      Bankroll = b;
    }
    
    public int getBalance(){
      return Balance;
    }
    
    public void setBalance(int i){
      Balance = i;
    }
    
    public void borrow(){
      Balance -= 100;
    }
    
    public void repay(){
      Balance += 100;
    }
}
