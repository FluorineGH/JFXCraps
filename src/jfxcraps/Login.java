
package jfxcraps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Classes.BaseAccount;

public class Login {
    
    ArrayList<BaseAccount> accounts;
    File dirCheck, banx;
    BaseAccount player;
    
    public Login(){
        accounts = new ArrayList<>();
        scoreCheck();
        readAccount();        
    }
    
    public void scoreCheck(){    
        dirCheck = new File("K:\\Table Games\\Chipper\\java");
        if(dirCheck.exists()) banx = new File("K:\\Table Games\\Chipper\\java","banx");
        else {
            System.out.println("DIRECTORY DOES NOT EXIST! Using current DIR.");
            banx = new File(System.getProperty("user.dir"),"banx");
        }
    }
   
     public void readAccount(){
        player = null;        
        try{
            FileInputStream fileIn = new FileInputStream(banx);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accounts = (ArrayList) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException e){
            System.err.println("IO Error: File not found. No scores for you!");
            //e.printStackTrace();
            return;
        }catch(ClassNotFoundException cnf){
            cnf.printStackTrace();
            System.err.println("Class Not Found Error: not sure what this is...");
            return;
        }
        for(int i = 0;i<accounts.size();i++){
            player = (BaseAccount)accounts.get(i);
            System.out.println("Deserialized Arraylist: " + i);
            System.out.println("Name: " + player.getName());
            System.out.println("Password: " + player.getPassword());
            System.out.println("Bankroll: " + player.getBankroll());
            System.out.println("Balance: " + player.getBalance());
        }               
    }
    
    public void writeAccount(){
        try{
            FileOutputStream fileOut = new FileOutputStream(banx);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);          
            out.writeObject(accounts);
            out.close();
            fileOut.close();
            System.out.println("Serialized arraylist data is saved in banx");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public boolean newAccount(String n, String p){
        for(int i = 0;i<accounts.size();i++){
            player = (BaseAccount)accounts.get(i);
            if(n.equals(player.getName())){
                return false;
            }
        }
        accounts.add(new BaseAccount(n,p,100,0));
        System.out.println("accounts size: " + accounts.size());
        writeAccount();
        return true;
    }

    public void login(String n, String p){
        for(int i = 0;i<accounts.size();i++){
            player = (BaseAccount) accounts.get(i);
            if(n.equals(player.getName())){
                if(p.equals(player.getPassword())){
                    System.out.println("Welcome " + player.getName() + "!");
                    FXMLCrapsController.Accountname = player.getName();
                    FXMLCrapsController.Bankroll = player.getBankroll();
                    FXMLCrapsController.Balance = player.getBalance();
                    FXMLCrapsController.acc = true;
                    return;
                }
                System.out.println("New Login: Pass does not match");
            }
        }              
    }
    
    public void updateBank(){
        for(int i = 0;i<accounts.size();i++){
            player = (BaseAccount) accounts.get(i);
            if(FXMLCrapsController.Accountname.equals(player.getName())){
                player.setBankroll(FXMLCrapsController.BANK);
                player.setBalance(FXMLCrapsController.Balance);
            }
        }
    }
}
