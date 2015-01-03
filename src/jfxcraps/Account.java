/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jfxcraps;

/**
 *
 * @author jcalvert
 */
public class Account implements java.io.Serializable{
    private String Name;
    private String Password;
    private int Bankroll;
    
    public Account(String n, String p, int i){
        Name = n;
        Password = p;
        Bankroll = i;
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
}
