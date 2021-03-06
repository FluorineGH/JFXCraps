
package jfxcraps;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import Classes.BaseAccount;

public class FXMLCrapsController {

    @FXML private Button RollButton;

    //@FXML private Label VersionLabel;
    @FXML private Label OddsBetLabel;
    @FXML private Label EightBetLabel;
    @FXML private Label FieldBetLabel;
    @FXML private Label SixBetLabel;
    @FXML private Label Die2Label;
    @FXML private Label PointLabel;    
    @FXML private Label DPBetLabel;
    @FXML private Label TenBetLabel;
    @FXML private Label DCBetLabel;    
    @FXML private Label PassBetLabel;
    @FXML private Label TotalBetLabel;
    @FXML private Label DPLayBetLabel;
    @FXML private Label BankLabel;
    @FXML private Label FourBetLabel;
    @FXML private Label NineBetLabel;
    @FXML private Label ComeBetLabel;
    @FXML private Label FiveBetLabel;
    @FXML private Label Die1Label;
    @FXML private Label AccountLabel;
    @FXML private Label WarningLabel;
    @FXML private Label StatusLabel;
    
    @FXML private Label No4BetLabel;
    @FXML private Label No10BetLabel;
    @FXML private Label BalanceLabel;
    @FXML private Label AnyCrapsBetLabel;
    @FXML private Label Any7BetLabel;
    @FXML private Label TwoBetLabel;
    @FXML private Label ThreeBetLabel;
    @FXML private Label ElevenBetLabel;
    @FXML private Label TwelveBetLabel;
    @FXML private Label Hard6BetLabel;
    @FXML private Label Hard8BetLabel;
    @FXML private Label Hard4BetLabel;
    @FXML private Label Hard10BetLabel;
    
    @FXML private ImageView DiePic1;
    @FXML private ImageView DiePic2;
    @FXML private ImageView PuckPic;

    @FXML private MenuButton PassMB;
    @FXML private MenuButton OddsMB;
    @FXML private MenuButton FieldMB;
    @FXML private MenuButton ComeMB;
    @FXML private MenuButton FourMB;
    @FXML private MenuButton FiveMB;
    @FXML private MenuButton SixMB;
    @FXML private MenuButton EightMB;
    @FXML private MenuButton NineMB;
    @FXML private MenuButton TenMB;
    @FXML private MenuButton DPMB;
    @FXML private MenuButton DPLayMB;
        
    @FXML private MenuButton C4MB;
    @FXML private MenuButton C5MB;
    @FXML private MenuButton C6MB;
    @FXML private MenuButton C8MB;
    @FXML private MenuButton C9MB;
    @FXML private MenuButton C10MB;
    @FXML private MenuButton C4OddsMB;
    @FXML private MenuButton C5OddsMB;
    @FXML private MenuButton C6OddsMB;
    @FXML private MenuButton C8OddsMB;
    @FXML private MenuButton C9OddsMB;
    @FXML private MenuButton C10OddsMB;
    
    @FXML private MenuButton DCMB;
    @FXML private MenuButton DC4MB;
    @FXML private MenuButton DC5MB;
    @FXML private MenuButton DC6MB;
    @FXML private MenuButton DC8MB;
    @FXML private MenuButton DC9MB;
    @FXML private MenuButton DC10MB;
    @FXML private MenuButton DC4LayMB;
    @FXML private MenuButton DC5LayMB;
    @FXML private MenuButton DC6LayMB;
    @FXML private MenuButton DC8LayMB;
    @FXML private MenuButton DC9LayMB;
    @FXML private MenuButton DC10LayMB;
    
    @FXML private MenuButton No4BetMB;
    @FXML private MenuButton No10BetMB;
    @FXML private MenuButton AnyCrapsBetMB;
    @FXML private MenuButton Any7BetMB;
    @FXML private MenuButton TwoBetMB;
    @FXML private MenuButton ThreeBetMB;
    @FXML private MenuButton ElevenBetMB;
    @FXML private MenuButton TwelveBetMB;
    @FXML private MenuButton Hard6BetMB;
    @FXML private MenuButton Hard8BetMB;
    @FXML private MenuButton Hard4BetMB;
    @FXML private MenuButton Hard10BetMB;
    
    // Login Stuff
    @FXML private TextField nameField;
    @FXML private PasswordField passField;
    @FXML private Button LoginButton;
    @FXML private Button CreateButton;
    @FXML private Button GuestButton;
    @FXML private Pane LoginPane;   
    
/*    @FXML private Button DPLayBetButton;
    @FXML private Button TenBetButton;
    @FXML private Button FieldBetButton;   
    @FXML private Button FourBetButton;
    @FXML private Button FiveBetButton;       
    @FXML private Button ComeBetButton;
    @FXML private Button PassBetButton;
    @FXML private Button SixBetButton;
    @FXML private Button DCBetButton;  
    @FXML private Button NineBetButton;
    @FXML private Button EightBetButton;
    @FXML private Button DPBetButton;
    @FXML private Button OddsBetButton;
    @FXML private Button No4BetButton;
    @FXML private Button No10BetButton;
    @FXML private Button BorrowButton;
    @FXML private Button RepayButton;
    @FXML private Button AnyCrapsBetButton;
    @FXML private Button Any7BetButton;
    @FXML private Button TwoBetButton;
    @FXML private Button ThreeBetButton;
    @FXML private Button ElevenBetButton;
    @FXML private Button TwelveBetButton;
    @FXML private Button Hard6BetButton;
    @FXML private Button Hard8BetButton;
    @FXML private Button Hard4BetButton;
    @FXML private Button Hard10BetButton;
*/   
    
    @FXML private Button NewGameButton;
    @FXML private Button QuitButton;   

    
    static int PassBet,OddsBet,FieldBet,ComeBet,FourBet,FiveBet,SixBet,EightBet,
            NineBet,TenBet,DPBet,DPLayBet;
    
    static int DCBet,DCLayBet,C4Bet,C5Bet,C6Bet,C8Bet,C9Bet,C10Bet,C4OddsBet,
            C5OddsBet,C6OddsBet,C8OddsBet,C9OddsBet,C10OddsBet;
    
    static int DC4Bet,DC5Bet,DC6Bet,DC8Bet,DC9Bet,DC10Bet,DC4LayBet,
            DC5LayBet,DC6LayBet,DC8LayBet,DC9LayBet,DC10LayBet;
    
    static int No4Bet,No10Bet,AnyCrapsBet,Any7Bet,TwoBet,ThreeBet,ElevenBet,
            TwelveBet,Hard6Bet,Hard8Bet,Hard4Bet,Hard10Bet;
    
    static boolean Hard6OFF,Hard8OFF,Hard4OFF,Hard10OFF;
    
    static int DontPay,Die1,Die2,ROLL,POINT,BANK,TOTAL;   
    
    boolean point = false;   
        
    Image ONE,TWO,THREE,FOUR,FIVE,SIX,ON,OFF;
    
    // Bank Accounts stuff
    Login log;
    String Name,Password;
    static String Accountname;
    static int Bankroll;
    static int Balance;
    static boolean acc = false;
    BaseAccount player;
        
    public FXMLCrapsController(){     
        BANK = 100;
        Accountname = "Guest";
        Bankroll = BANK;
        Balance = 0;
        ONE     = new Image(FXMLCrapsController.class.getResourceAsStream("1.png"));
        TWO     = new Image(FXMLCrapsController.class.getResourceAsStream("2.png"));
        THREE   = new Image(FXMLCrapsController.class.getResourceAsStream("3.png"));
        FOUR    = new Image(FXMLCrapsController.class.getResourceAsStream("4.png"));
        FIVE    = new Image(FXMLCrapsController.class.getResourceAsStream("5.png"));
        SIX     = new Image(FXMLCrapsController.class.getResourceAsStream("6.png"));
        ON      = new Image(FXMLCrapsController.class.getResourceAsStream("on.png"));
        OFF     = new Image(FXMLCrapsController.class.getResourceAsStream("off.png"));
        log = new Login();
//        VersionLabel.setText(JFXCraps.VERSION);
        Hard6OFF = true;
        Hard8OFF = true;
        Hard4OFF = true;
        Hard10OFF = true;
   }
    
    Random r = new Random();
    
    @FXML void Login(ActionEvent event) {
        WarningLabel.setText("");        
        Name = nameField.getText();
        Password = passField.getText();
        log.login(Name,Password);
        if(acc == true){           
            BANK = Bankroll;
            BankLabel.setText(Integer.toString(BANK));
            AccountLabel.setText(Accountname);
            BalanceLabel.setText(Integer.toString(Balance));
            NewGameButton.setOpacity(0);
            banish();
        }else{
            passField.clear();
            WarningLabel.setText("Account not found!" + "\n" +"Check name or password and try again, Create a new account, or click Play as Guest");           
        }
    }
    
    private void banish(){
        LoginButton.setDefaultButton(false);
        RollButton.setDefaultButton(true);
        LoginPane.setDisable(true);
        nameField.setOpacity(0);
        passField.setOpacity(0);
        LoginButton.setOpacity(0);
        CreateButton.setOpacity(0);
        GuestButton.setOpacity(0);
        LoginPane.setOpacity(0);
        WarningLabel.setOpacity(0);
    }
    
     @FXML void CreateAccountAction(ActionEvent event) {
         if(nameField.getText().equals("")) return;
         Name = nameField.getText();
         Password = passField.getText();
         boolean ok = log.newAccount(Name,Password);
         if(ok == true)WarningLabel.setText("Account Created: " + Name);
         else WarningLabel.setText("Account " + Name + " already exists.");
     }
    
    @FXML void Guest(ActionEvent event) {
        banish();
    }
    
    @FXML void BorrowButtonAction(ActionEvent event) {
        if(BANK > 99 && Balance < -99) return;
        Balance -= 100;
        BANK += 100;
        BalanceLabel.setTextFill(Color.RED);
        BankLabel.setTextFill(Color.GREEN);
        updateCash();
        if(Balance > 0) StatusLabel.setText("Withdrew $100.");
        else StatusLabel.setText("Borrowed $100.");
    }
    
    @FXML void RepayButtonAction(ActionEvent event) {
        if(BANK < 100) return;
        Balance += 100;
        BANK -= 100;
        BankLabel.setTextFill(Color.RED);
        BalanceLabel.setTextFill(Color.GREEN);
        updateCash();
        StatusLabel.setText("Repaid $100.");
    }
    
    @FXML void QuitButtonAction(ActionEvent event) {
        if(!Accountname.equals("Guest")){
            BANK += TOTAL;
            log.updateBank();
            log.writeAccount();
            System.out.println("New bank record: " + BANK);
            System.out.println("Bank balance: " + Balance);
        }
        System.exit(0);
    }
    
    @FXML void NewGameButtonAction(ActionEvent event) {
        if(!Accountname.equals("Guest")) return;
        PassBet = 0;
        OddsBet = 0;
        FieldBet = 0;
        ComeBet = 0;
        FourBet = 0;
        FiveBet = 0;
        SixBet = 0;
        EightBet = 0;
        NineBet = 0;
        TenBet = 0;
        DPBet = 0;
        DPLayBet = 0;
        DCBet = 0;
        DCLayBet = 0;
        C4Bet = 0;
        C5Bet = 0;
        C6Bet = 0;
        C8Bet = 0;
        C9Bet = 0;
        C10Bet = 0;
        C4OddsBet = 0;
        C5OddsBet = 0;
        C6OddsBet = 0;
        C8OddsBet = 0;
        C9OddsBet = 0;
        C10OddsBet = 0;
        DC4Bet = 0;
        DC5Bet = 0;
        DC6Bet = 0;
        DC8Bet = 0;
        DC9Bet = 0;
        DC10Bet = 0;
        DC4LayBet = 0;
        DC5LayBet = 0;
        DC6LayBet = 0;
        DC8LayBet = 0;
        DC9LayBet = 0;
        DC10LayBet = 0;
        No4Bet = 0;
        No10Bet = 0;
        AnyCrapsBet = 0;
        Any7Bet = 0;
        TwoBet = 0;
        ThreeBet = 0;
        ElevenBet = 0;
        TwelveBet = 0;
        Hard6Bet = 0;
        Hard8Bet = 0;
        Hard4Bet = 0;
        Hard10Bet = 0;
        DontPay = 0;
        Die1 = 0;
        Die2 = 0;
        ROLL = 0;
        POINT = 0;
        BANK = 100;
        TOTAL = 0;   
        point = false;
        
        PassBetLabel.setTextFill(Color.BLACK);
        OddsBetLabel.setTextFill(Color.BLACK);
        ComeBetLabel.setTextFill(Color.BLACK);
        FieldBetLabel.setTextFill(Color.BLACK);
        FourBetLabel.setTextFill(Color.BLACK);
        FiveBetLabel.setTextFill(Color.BLACK);
        SixBetLabel.setTextFill(Color.BLACK);
        EightBetLabel.setTextFill(Color.BLACK);
        NineBetLabel.setTextFill(Color.BLACK);
        TenBetLabel.setTextFill(Color.BLACK);
        DPBetLabel.setTextFill(Color.BLACK);
        DPLayBetLabel.setTextFill(Color.BLACK);
        DCBetLabel.setTextFill(Color.BLACK);
        No4BetLabel.setTextFill(Color.BLACK);
        No10BetLabel.setTextFill(Color.BLACK);
        AnyCrapsBetLabel.setTextFill(Color.BLACK);
        Any7BetLabel.setTextFill(Color.BLACK);
        TwoBetLabel.setTextFill(Color.BLACK);
        ThreeBetLabel.setTextFill(Color.BLACK);
        ElevenBetLabel.setTextFill(Color.BLACK);
        TwelveBetLabel.setTextFill(Color.BLACK);
        Hard6BetLabel.setTextFill(Color.BLACK);
        Hard8BetLabel.setTextFill(Color.BLACK);
        Hard4BetLabel.setTextFill(Color.BLACK);
        Hard10BetLabel.setTextFill(Color.BLACK);       
        
        updateCash();
        
        Die1Label.setText("");
        Die2Label.setText("");
        PointLabel.setText("NONE");
        DiePic1.setOpacity(0);
        DiePic2.setOpacity(0);
        PuckPic.setX(0);
        PuckPic.setImage(OFF);
        StatusLabel.setText("");
        StatusLabel.setOpacity(0);
     }
    
    private void broke(){
        StatusLabel.setOpacity(1);
        StatusLabel.setText("Insufficient Funds! Borrow from the Bank.");
    }
    
    @FXML void PassButtonAction(ActionEvent event) {
        if(BANK < 5){
            broke();
            return;
        }
        if(PassBet > 999) return;
        PassBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        PassBetLabel.setText("$" + Integer.toString(PassBet));
        PassBetLabel.setTextFill(Color.GREEN);
        PassMB.setOpacity(1);
        PassMB.setText(Integer.toString(PassBet));
    }    
    
    @FXML void PassMBMinus(ActionEvent event) { 
        if(point == true || PassBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        PassBet -= 5;
        updateCash();
        PassBetLabel.setText("$" + Integer.toString(PassBet));
        PassMB.setText(Integer.toString(PassBet));
        if(PassBet == 0) PassMB.setOpacity(0);
    }
    
    @FXML void PassMBClear(ActionEvent event) { 
        if(point == true || PassBet == 0) return;
        TOTAL -= PassBet;
        BANK += PassBet;
        PassBet = 0;
        updateCash();
        PassBetLabel.setText("$" + Integer.toString(PassBet));
        PassBetLabel.setTextFill(Color.BLACK);
        PassMB.setOpacity(0);
    }
    
    @FXML void OddsButtonAction(ActionEvent event) {
        if(BANK < 5){
            broke();
            return;
        }
        if(point == false || PassBet == 0) return;
        if(OddsBet >= PassBet*2) return;
        OddsBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        OddsBetLabel.setText("$" + Integer.toString(OddsBet));
        OddsBetLabel.setTextFill(Color.GREEN);
        OddsMB.setOpacity(1);
        OddsMB.setText(Integer.toString(OddsBet));
    }

    @FXML void OddsMBMinus(ActionEvent event) {
        if(OddsBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        OddsBet -= 5;
        updateCash();
        OddsBetLabel.setText("$" + Integer.toString(OddsBet));
        OddsMB.setText(Integer.toString(OddsBet));
        if(OddsBet == 0) OddsMB.setOpacity(0);
    }
    
    @FXML void OddsMBClear(ActionEvent event) {
        if(OddsBet == 0) return;
        TOTAL -= OddsBet;
        BANK += OddsBet;
        OddsBet = 0;
        updateCash();
        OddsBetLabel.setText("$" + Integer.toString(OddsBet));
        OddsBetLabel.setTextFill(Color.BLACK);
        OddsMB.setOpacity(0);
    }   
   
    @FXML void FieldButtonAction(ActionEvent event) {
        if(BANK < 5){
            broke();
            return;
        }
        if(FieldBet > 999) return;
        FieldBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        BankLabel.setText("$" + Integer.toString(BANK));
        TotalBetLabel.setText("$" + Integer.toString(TOTAL));
        FieldBetLabel.setText("$" + Integer.toString(FieldBet));
        FieldBetLabel.setTextFill(Color.GREEN);
        FieldMB.setOpacity(1);
        FieldMB.setText(Integer.toString(FieldBet));
    }
    
    @FXML void FieldMBMinus(ActionEvent event) {
        if(FieldBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        FieldBet -= 5;
        updateCash();
        FieldBetLabel.setText("$" + Integer.toString(FieldBet));
        FieldMB.setText(Integer.toString(FieldBet));
        if(FieldBet == 0) FieldMB.setOpacity(0);
    }
    
    @FXML void FieldMBClear(ActionEvent event) {
        if(FieldBet == 0) return;
        TOTAL -= FieldBet;
        BANK += FieldBet;
        FieldBet = 0;
        updateCash();
        FieldBetLabel.setText("$" + Integer.toString(FieldBet));
        FieldMB.setOpacity(0);
    }
    
    @FXML void ComeButtonAction(ActionEvent event) {
        if(BANK < 5){
            broke();
            return;
        }
        if(ComeBet > 999 || point == false) return;
        ComeBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        ComeBetLabel.setText("$" + Integer.toString(ComeBet));
        ComeBetLabel.setTextFill(Color.GREEN);
        ComeMB.setOpacity(1);
        ComeMB.setText(Integer.toString(ComeBet));
    }

    @FXML void ComeMBMinus(ActionEvent event) {
        if(ComeBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        ComeBet -= 5;
        updateCash();
        ComeBetLabel.setText("$" + Integer.toString(ComeBet));
        ComeMB.setText(Integer.toString(ComeBet));
        if(ComeBet == 0) ComeMB.setOpacity(0);
    }
    
    @FXML void ComeMBClear(ActionEvent event) {
        if(ComeBet == 0) return;
        TOTAL -= ComeBet;
        BANK += ComeBet;
        ComeBet = 0;
        updateCash();
        ComeBetLabel.setText("$" + Integer.toString(ComeBet));
        ComeBetLabel.setTextFill(Color.BLACK);
        ComeMB.setOpacity(0);
    }
    
    @FXML void FourBetButtonAction(ActionEvent event) {
        if(BANK < 5){
            broke();
            return;
        }
        if(FourBet > 999) return;
        FourBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        FourBetLabel.setText("$" + Integer.toString(FourBet));
        FourBetLabel.setTextFill(Color.GREEN);
        FourMB.setOpacity(1);
        FourMB.setText(Integer.toString(FourBet));
    }

    @FXML void FourMBMinus(ActionEvent event) { 
        if(FourBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        FourBet -= 5;
        updateCash();
        FourBetLabel.setText("$" + Integer.toString(FourBet));
        FourMB.setText(Integer.toString(FourBet));
        if(FourBet == 0) FourMB.setOpacity(0);
    }
    
    @FXML void FourMBClear(ActionEvent event) { 
        if(FourBet == 0) return;
        TOTAL -= FourBet;
        BANK += FourBet;
        FourBet = 0;
        updateCash();
        FourBetLabel.setText("$" + Integer.toString(FourBet));
        FourBetLabel.setTextFill(Color.BLACK);
        FourMB.setOpacity(0);
    }
    
    @FXML void FiveBetButtonAction(ActionEvent event) {
        if(BANK < 5){
            broke();
            return;
        }
        if(FiveBet > 999) return;
        FiveBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        FiveBetLabel.setText("$" + Integer.toString(FiveBet));
        FiveBetLabel.setTextFill(Color.GREEN);
        FiveMB.setOpacity(1);
        FiveMB.setText(Integer.toString(FiveBet));
    }

    @FXML void FiveMBMinus(ActionEvent event) { 
        if(FiveBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        FiveBet -= 5;
        updateCash();
        FiveBetLabel.setText("$" + Integer.toString(FiveBet));
        FiveBetLabel.setTextFill(Color.BLACK);
        FiveMB.setText(Integer.toString(FiveBet));
        if(FiveBet == 0) FiveMB.setOpacity(0);
    }
    
    @FXML void FiveMBClear(ActionEvent event) { 
        if(FiveBet == 0) return;
        TOTAL -= FiveBet;
        BANK += FiveBet;
        FiveBet = 0;
        updateCash();
        FiveBetLabel.setText("$" + Integer.toString(FiveBet));
        FiveMB.setOpacity(0);
    }
    
    @FXML void SixBetButtonAction(ActionEvent event) {
        if(BANK < 6){
            broke();
            return;
        }
        if(SixBet > 999) return;
        SixBet += 6;
        BANK -= 6;
        TOTAL += 6;        
        updateCash();
        SixBetLabel.setText("$" + Integer.toString(SixBet));
        SixBetLabel.setTextFill(Color.GREEN);
        SixMB.setOpacity(1);
        SixMB.setText(Integer.toString(SixBet));
    }

    @FXML void SixMBMinus(ActionEvent event) { 
        if(SixBet == 0) return;
        TOTAL -= 6;
        BANK += 6;
        SixBet -= 6;
        updateCash();
        SixBetLabel.setText("$" + Integer.toString(SixBet));
        SixMB.setText(Integer.toString(SixBet));
        if(SixBet == 0) SixMB.setOpacity(0);
    }
    
    @FXML void SixMBClear(ActionEvent event) { 
        if(SixBet == 0) return;
        TOTAL -= SixBet;
        BANK += SixBet;
        SixBet = 0;
        updateCash();
        SixBetLabel.setText("$" + Integer.toString(SixBet));
        SixBetLabel.setTextFill(Color.BLACK);
        SixMB.setOpacity(0);
    }
    
    @FXML void EightBetButtonAction(ActionEvent event) {
        if(BANK < 6){
            broke();
            return;
        }
        if(EightBet > 999) return;
        EightBet += 6;
        BANK -= 6;
        TOTAL += 6;        
        updateCash();
        EightBetLabel.setText("$" + Integer.toString(EightBet));
        EightBetLabel.setTextFill(Color.GREEN);
        EightMB.setOpacity(1);
        EightMB.setText(Integer.toString(EightBet));
    }
    
    @FXML void EightMBMinus(ActionEvent event) {
        if(EightBet == 0) return;
        TOTAL -= 6;
        BANK += 6;
        EightBet -= 6;
        updateCash();
        EightBetLabel.setText("$" + Integer.toString(EightBet));
        EightMB.setText(Integer.toString(EightBet));
        if(EightBet == 0) EightMB.setOpacity(0);
    }
    
    @FXML void EightMBClear(ActionEvent event) {
        if(EightBet == 0) return;
        TOTAL -= EightBet;
        BANK += EightBet;
        EightBet = 0;
        updateCash();
        EightBetLabel.setText("$" + Integer.toString(EightBet));
        EightBetLabel.setTextFill(Color.BLACK);
        EightMB.setOpacity(0);
    }
    
    @FXML void NineBetButtonAction(ActionEvent event) {
        if(BANK < 5){
            broke();
            return;
        }
        if(NineBet > 999) return;
        NineBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        NineBetLabel.setText("$" + Integer.toString(NineBet));
        NineBetLabel.setTextFill(Color.GREEN);
        NineMB.setOpacity(1);
        NineMB.setText(Integer.toString(NineBet));
    }

    @FXML void NineMBMinus(ActionEvent event) { 
        if(NineBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        NineBet -= 5;
        updateCash();
        NineBetLabel.setText("$" + Integer.toString(NineBet));
        NineMB.setText(Integer.toString(NineBet));
        if(NineBet == 0) NineMB.setOpacity(0);
        System.out.println("Nine Bet: " + NineBet);
    }
    
    @FXML void NineMBClear(ActionEvent event) { 
        if(NineBet == 0) return;
        TOTAL -= NineBet;
        BANK += NineBet;
        NineBet = 0;
        updateCash();
        NineBetLabel.setText("$" + Integer.toString(NineBet));
        NineBetLabel.setTextFill(Color.BLACK);
        NineMB.setOpacity(0);
    }
 
        @FXML void TenBetButtonAction(ActionEvent event) {
        if(BANK < 5){
            broke();
            return;
        }
        if(TenBet > 999) return;
        TenBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        TenBetLabel.setText("$" + Integer.toString(TenBet));
        TenBetLabel.setTextFill(Color.GREEN);
        TenMB.setOpacity(1);
        TenMB.setText(Integer.toString(TenBet));
    }

    @FXML void TenMBMinus(ActionEvent event) { 
        if(TenBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        TenBet -= 5;
        updateCash();
        TenBetLabel.setText("$" + Integer.toString(TenBet));
        TenBetLabel.setTextFill(Color.BLACK);
        TenMB.setText(Integer.toString(TenBet));
        if(TenBet == 0) TenMB.setOpacity(0);
    }
    
    @FXML void TenMBClear(ActionEvent event) { 
        if(TenBet == 0) return;
        TOTAL -= TenBet;
        BANK += TenBet;
        TenBet = 0;
        updateCash();
        TenBetLabel.setText("$" + Integer.toString(TenBet));
        TenMB.setOpacity(0);
    }
    
    @FXML void DPBetButtonAction(ActionEvent event) {
        if(BANK < 5){
            broke();
            return;
        }
        if(DPBet > 999) return;
        if(point == true) return;
        DPBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        DPBetLabel.setText("$" + Integer.toString(DPBet));
        DPBetLabel.setTextFill(Color.GREEN);
        DPMB.setOpacity(1);
        DPMB.setText(Integer.toString(DPBet));
    }

    @FXML void DPMBMinus(ActionEvent event) { 
        if(DPBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        DPBet -= 5;
        updateCash();
        DPBetLabel.setText("$" + Integer.toString(DPBet));
        DPMB.setText(Integer.toString(DPBet));
        if(DPBet == 0) DPMB.setOpacity(0);
    }
    
    @FXML void DPMBClear(ActionEvent event) { 
        if(DPBet == 0) return;
        TOTAL -= DPBet;
        BANK += DPBet;
        DPBet = 0;
        updateCash();
        DPBetLabel.setText("$" + Integer.toString(DPBet));
        DPMB.setOpacity(0);
    }
        
    @FXML void DPLayButtonAction(ActionEvent event) { 
        
        if(POINT == 0 || DPBet == 0) return;
        if(POINT == 5 || POINT == 9){
            if(DPLayBet == 0 && BANK < 9){
                broke();
                return;
            }
            if(DPLayBet >9 && BANK < 1){
                broke();
                return;
            }
            if(DPLayBet >= DPBet*3) return;
            if(DPLayBet == 0) {
                DPLayBet += 9;
                BANK -= 9;
                TOTAL += 9;
            } else {DPLayBet += 3;
                BANK -= 3;
                TOTAL += 3;
            }
        }else{
            if(BANK < DontPay){
                broke();
                return;
            }
            if(POINT == 4 || POINT == 10) if(DPLayBet>=DPBet*4) return;
            if(POINT == 6 || POINT == 8) if(DPLayBet>=DPBet*2.4) return;
            DPLayBet += DontPay;
            BANK -= DontPay;
            TOTAL += DontPay;
        }       
        updateCash();
        DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
        DPLayBetLabel.setTextFill(Color.GREEN);
        DPLayMB.setOpacity(1);
        DPLayMB.setText(Integer.toString(DPLayBet));
    }

    @FXML void DPLayMBMinus(ActionEvent event) {
        if(DPLayBet == 0) return;  
        if(POINT == 5 || POINT == 9){
            if(DPLayBet < 10){
                TOTAL -= DPLayBet;
                BANK += DPLayBet;
                DPLayBet = 0;
            }else{
                TOTAL -= 3;
                BANK += 3;
                DPLayBet -= 3;
            }
        }
        TOTAL -= DontPay;
        BANK += DontPay;
        DPLayBet -= DontPay;
        updateCash();
        DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
        DPLayMB.setText(Integer.toString(DPLayBet));
        if(DPLayBet == 0) DPLayMB.setOpacity(0);
    }
    
    @FXML void DPLayMBClear(ActionEvent event) {
        if(DPLayBet == 0) return;
        TOTAL -= DPLayBet;
        BANK += DPLayBet;
        DPLayBet = 0;
        updateCash();
        DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
        DPLayMB.setOpacity(0);
    }
    
    @FXML void DCBetButtonAction(ActionEvent event) {
        if(DCBet > 999) return;
        if(point == false) return;
        if(BANK < 5){
            broke();
            return;
        }
        DCBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        DCBetLabel.setText("$" + Integer.toString(DCBet));
        DCBetLabel.setTextFill(Color.GREEN);
        DCMB.setOpacity(1);
        DCMB.setText(Integer.toString(DCBet));
    }

    @FXML void DCMBMinus(ActionEvent event) {
        if(DCBet == 0) return;       
        TOTAL -= 5;
        BANK += 5;
        DCBet -= 5;
        updateCash();
        DCBetLabel.setText("$" + Integer.toString(DCBet));
        DCMB.setText(Integer.toString(DCBet));
        if(DCBet == 0) DCMB.setOpacity(0);
    }
    
    @FXML void DCMBClear(ActionEvent event) {
        if(DCBet == 0) return;
        TOTAL -= DCBet;
        BANK += DCBet;
        DCBet = 0;
        updateCash();
        DCBetLabel.setText("$" + Integer.toString(DCBet));
        DCMB.setOpacity(0);
    }
    
    @FXML void RollButtonAction(ActionEvent event) {
        if(BANK < 1 && TOTAL == 0){
            StatusLabel.setText("Insufficient Funds.");
            return;
        }
        if(PassBet < 5 && DPBet < 5){
            StatusLabel.setText("No Line bets!");
            return;
        }
        PassBetLabel.setTextFill(Color.BLACK);
        OddsBetLabel.setTextFill(Color.BLACK);
        ComeBetLabel.setTextFill(Color.BLACK);
        FieldBetLabel.setTextFill(Color.BLACK);
        FourBetLabel.setTextFill(Color.BLACK);
        FiveBetLabel.setTextFill(Color.BLACK);
        SixBetLabel.setTextFill(Color.BLACK);
        EightBetLabel.setTextFill(Color.BLACK);
        NineBetLabel.setTextFill(Color.BLACK);
        TenBetLabel.setTextFill(Color.BLACK);
        DPBetLabel.setTextFill(Color.BLACK);
        DPLayBetLabel.setTextFill(Color.BLACK);
        DCBetLabel.setTextFill(Color.BLACK);
        No4BetLabel.setTextFill(Color.BLACK);
        No10BetLabel.setTextFill(Color.BLACK);
        AnyCrapsBetLabel.setTextFill(Color.BLACK);
        Any7BetLabel.setTextFill(Color.BLACK);
        TwoBetLabel.setTextFill(Color.BLACK);
        ThreeBetLabel.setTextFill(Color.BLACK);
        ElevenBetLabel.setTextFill(Color.BLACK);
        TwelveBetLabel.setTextFill(Color.BLACK);
        Hard6BetLabel.setTextFill(Color.BLACK);
        Hard8BetLabel.setTextFill(Color.BLACK);
        Hard4BetLabel.setTextFill(Color.BLACK);
        Hard10BetLabel.setTextFill(Color.BLACK);
        work();       
        updateCash(); // Needed?
    }
    
    private void updateCash(){
        BankLabel.setText("$" + Integer.toString(BANK));
        TotalBetLabel.setText("$" + Integer.toString(TOTAL));
        BalanceLabel.setText("$" + Integer.toString(Balance));
        StatusLabel.setText("");
        StatusLabel.setOpacity(0);
        if(PassBet == 0) PassMB.setOpacity(0);        
        if(OddsBet == 0) OddsMB.setOpacity(0);        
        if(ComeBet == 0) ComeMB.setOpacity(0);        
        if(FieldBet == 0) FieldMB.setOpacity(0);        
        if(FourBet == 0) FourMB.setOpacity(0);
        if(FiveBet == 0) FiveMB.setOpacity(0);        
        if(SixBet == 0) SixMB.setOpacity(0);        
        if(EightBet == 0) EightMB.setOpacity(0);       
        if(NineBet == 0) NineMB.setOpacity(0);        
        if(TenBet == 0) TenMB.setOpacity(0);
        if(DPBet == 0) DPMB.setOpacity(0);
        if(DPLayBet == 0) DPLayMB.setOpacity(0);
        if(DCBet == 0) DCMB.setOpacity(0);
        if(C4Bet == 0) C4MB.setOpacity(0);
        if(C5Bet == 0) C5MB.setOpacity(0);
        if(C6Bet == 0) C6MB.setOpacity(0);
        if(C8Bet == 0) C8MB.setOpacity(0);
        if(C9Bet == 0) C9MB.setOpacity(0);
        if(C10Bet == 0) C10MB.setOpacity(0);
        if(C4OddsBet == 0) C4OddsMB.setOpacity(0);
        if(C5OddsBet == 0) C5OddsMB.setOpacity(0);
        if(C6OddsBet == 0) C6OddsMB.setOpacity(0);
        if(C8OddsBet == 0) C8OddsMB.setOpacity(0);
        if(C9OddsBet == 0) C9OddsMB.setOpacity(0);
        if(C10OddsBet == 0) C10OddsMB.setOpacity(0);
        if(DC4Bet == 0) DC4MB.setOpacity(0);
        if(DC5Bet == 0) DC5MB.setOpacity(0);
        if(DC6Bet == 0) DC6MB.setOpacity(0);
        if(DC8Bet == 0) DC8MB.setOpacity(0);
        if(DC9Bet == 0) DC9MB.setOpacity(0);
        if(DC10Bet == 0) DC10MB.setOpacity(0);
        if(DC4LayBet == 0) DC4LayMB.setOpacity(0);
        if(DC5LayBet == 0) DC5LayMB.setOpacity(0);
        if(DC6LayBet == 0) DC6LayMB.setOpacity(0);
        if(DC8LayBet == 0) DC8LayMB.setOpacity(0);
        if(DC9LayBet == 0) DC9LayMB.setOpacity(0);
        if(DC10LayBet == 0) DC10LayMB.setOpacity(0);
        if(No4Bet == 0) No4BetMB.setOpacity(0);
        if(No10Bet == 0) No10BetMB.setOpacity(0);
        if(AnyCrapsBet == 0) AnyCrapsBetMB.setOpacity(0);
        if(Any7Bet == 0) Any7BetMB.setOpacity(0);
        if(TwoBet == 0) TwoBetMB.setOpacity(0);
        if(ThreeBet == 0) ThreeBetMB.setOpacity(0);
        if(ElevenBet == 0) ElevenBetMB.setOpacity(0);
        if(TwelveBet == 0) TwelveBetMB.setOpacity(0);
        if(Hard6Bet == 0) Hard6BetMB.setOpacity(0);
        if(Hard8Bet == 0) Hard8BetMB.setOpacity(0);
        if(Hard4Bet == 0) Hard4BetMB.setOpacity(0);
        if(Hard10Bet == 0) Hard10BetMB.setOpacity(0);
    }
    
    private void setLay(){       
        if(POINT == 4 || POINT == 10) DontPay = 10;
        if(POINT == 6 || POINT == 8) DontPay = 6;
    }
        
    private int rollDie(){
        return r.nextInt(6)+1;
    }
    
    private void work(){
        Die1 = rollDie();
        Die2 = rollDie();
        ROLL = Die1 + Die2;
        Die1Label.setText(Integer.toString(Die1));
        Die2Label.setText(Integer.toString(Die2));
        DiePic1.setOpacity(1);
        DiePic2.setOpacity(1);
                
        switch(Die1){
            case 1: DiePic1.setImage(ONE);
                break;
            case 2: DiePic1.setImage(TWO);
                break;
            case 3: DiePic1.setImage(THREE);
                break;
            case 4: DiePic1.setImage(FOUR);
                break;
            case 5: DiePic1.setImage(FIVE);
                break;
            case 6: DiePic1.setImage(SIX);
                break;
        }
        
        switch(Die2){
            case 1: DiePic2.setImage(ONE);
                break;
            case 2: DiePic2.setImage(TWO);
                break;
            case 3: DiePic2.setImage(THREE);
                break;
            case 4: DiePic2.setImage(FOUR);
                break;
            case 5: DiePic2.setImage(FIVE);
                break;
            case 6: DiePic2.setImage(SIX);
                break;
        }
        
        if(point == false){ // Puck OFF
            switch(ROLL){
                
                case 2: TOTAL -= PassBet;
                        PassBet = 0;
                        PassBetLabel.setText("$" + Integer.toString(PassBet));
                        PassBetLabel.setTextFill(Color.RED);
                        BANK += DPBet;
                        BANK += FieldBet*2;
                        // Centre Action
                        if(TwoBet > 0 ) BANK += TwoBet * 30;
                        if(AnyCrapsBet > 0 ) BANK += AnyCrapsBet * 8;                       
                        payNone();                        
                        break;
                
                case 3: TOTAL -= PassBet;
                        PassBet = 0;
                        PassBetLabel.setText("$" + Integer.toString(PassBet));
                        PassBetLabel.setTextFill(Color.RED);
                        BANK += DPBet;
                        BANK += FieldBet;
                        // Centre Action
                        if(ThreeBet > 0 ) BANK += ThreeBet * 15;
                        if(AnyCrapsBet > 0 ) BANK += AnyCrapsBet * 8;                       
                        payNone();
                        break;
                
                case 4: POINT = 4;
                        point = true;
                        workBets();
                        PointLabel.setText(Integer.toString(POINT));
                        BANK += FieldBet;
                        if(C4Bet > 0){
                            TOTAL -= C4OddsBet;
                            BANK += C4OddsBet;
                            TOTAL -= C4Bet;
                            BANK += C4Bet;
                        }
                        if(DC4Bet > 0){
                            TOTAL -= DC4LayBet;
                            TOTAL -= DC4Bet;
                            DC4LayBet = 0;
                            DC4Bet = 0;
                            DC4MB.setText(Integer.toString(DC4Bet));
                            DC4LayMB.setText(Integer.toString(DC4LayBet));        
                            DC4MB.setOpacity(0);
                            DC4LayMB.setOpacity(0);
                        }
                        PuckPic.setX(99);
                        PuckPic.setImage(ON);
                        payNone();
                        if(Hard4OFF == false && Hard4Bet > 0){
                            if(Die1 == 2 && Die2 == 2){
                                BANK += Hard4Bet * 7;
                            }
                            else{
                                TOTAL -= Hard4Bet;
                                Hard4Bet = 0;
                                Hard4BetLabel.setTextFill(Color.RED);
                                Hard4BetLabel.setText("$" + Integer.toString(Hard4Bet));
                                Hard4BetMB.setText("$" + Integer.toString(Hard4Bet));
                                Hard4BetMB.setOpacity(0);
                            }
                        }
                        if(No4Bet > 0){
                            TOTAL -= No4Bet;
                            No4Bet = 0;
                            No4BetLabel.setTextFill(Color.RED);
                            No4BetLabel.setText("$" + Integer.toString(No4Bet));
                            No4BetMB.setText("$" + Integer.toString(No4Bet));
                            No4BetMB.setOpacity(0);
                        }
                        break;
                
                case 5: POINT = 5;
                        point = true;
                        workBets();
                        PointLabel.setText(Integer.toString(POINT));
                        if(FieldBet>0) {
                            TOTAL -= FieldBet;
                            FieldBetLabel.setTextFill(Color.RED);                        
                            FieldBet = 0;
                            FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                        }
                        if(C5Bet > 0){
                            TOTAL -= C5OddsBet;
                            BANK += C5OddsBet;
                            TOTAL -= C5Bet;
                            BANK += C5Bet;
                        }
                        if(DC5Bet > 0){
                            TOTAL -= DC5LayBet;
                            TOTAL -= DC5Bet;
                            DC5LayBet = 0;
                            DC5Bet = 0;
                            DC5MB.setText(Integer.toString(DC5Bet));
                            DC5LayMB.setText(Integer.toString(DC5LayBet));        
                            DC5MB.setOpacity(0);
                            DC5LayMB.setOpacity(0);
                        }
                        PuckPic.setX(196);
                        PuckPic.setImage(ON);
                        payNone();
                        break;
                
                case 6: POINT = 6;
                        point = true;
                        workBets();
                        PointLabel.setText(Integer.toString(POINT));                        
                        if(FieldBet>0) {
                            TOTAL -= FieldBet;
                            FieldBetLabel.setTextFill(Color.RED);                        
                            FieldBet = 0;
                            FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                        }
                        if(C6Bet > 0){
                            TOTAL -= C6OddsBet;
                            BANK += C6OddsBet;
                            TOTAL -= C6Bet;
                            BANK += C6Bet;
                        }
                        if(DC6Bet > 0){
                            TOTAL -= DC6LayBet;
                            TOTAL -= DC6Bet;
                            DC6LayBet = 0;
                            DC6Bet = 0;
                            DC6MB.setText(Integer.toString(DC6Bet));
                            DC6LayMB.setText(Integer.toString(DC6LayBet));        
                            DC6MB.setOpacity(0);
                            DC6LayMB.setOpacity(0);
                        }
                        PuckPic.setX(294);
                        PuckPic.setImage(ON);
                        payNone();
                        if(Hard6OFF == false && Hard6Bet > 0){
                            if(Die1 == 3 && Die2 == 3){
                                BANK += Hard6Bet * 9;
                            }
                            else{
                                TOTAL -= Hard6Bet;
                                Hard6Bet = 0;
                                Hard6BetLabel.setTextFill(Color.RED);
                                Hard6BetLabel.setText("$" + Integer.toString(Hard6Bet));
                                Hard6BetMB.setText("$" + Integer.toString(Hard6Bet));
                                Hard6BetMB.setOpacity(0);
                            }
                        }
                        break;

                case 8: POINT = 8;
                        point = true;
                        workBets();
                        PointLabel.setText(Integer.toString(POINT));
                        if(FieldBet>0) {
                            TOTAL -= FieldBet;
                            FieldBetLabel.setTextFill(Color.RED);                        
                            FieldBet = 0;
                            FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                        }
                        if(C8Bet > 0){
                            TOTAL -= C8OddsBet;
                            BANK += C8OddsBet;
                            TOTAL -= C8Bet;
                            BANK += C8Bet;
                        }
                        if(DC8Bet > 0){
                            TOTAL -= DC8LayBet;
                            TOTAL -= DC8Bet;
                            DC8LayBet = 0;
                            DC8Bet = 0;
                            DC8MB.setText(Integer.toString(DC8Bet));
                            DC8LayMB.setText(Integer.toString(DC8LayBet));        
                            DC8MB.setOpacity(0);
                            DC8LayMB.setOpacity(0);
                        }
                        PuckPic.setX(392);
                        PuckPic.setImage(ON);
                        payNone();
                        if(Hard8OFF == false && Hard8Bet > 0){
                            if(Die1 == 4 && Die2 == 4){
                                BANK += Hard8Bet * 9;
                            }
                            else{
                                TOTAL -= Hard8Bet;
                                Hard8Bet = 0;
                                Hard8BetLabel.setTextFill(Color.RED);
                                Hard8BetLabel.setText("$" + Integer.toString(Hard8Bet));
                                Hard8BetMB.setText("$" + Integer.toString(Hard8Bet));
                                Hard8BetMB.setOpacity(0);
                            }
                        }
                        break;
                   
                case 9: POINT = 9;
                        point = true;
                        workBets();
                        PointLabel.setText(Integer.toString(POINT));
                        BANK += FieldBet;
                        if(C9Bet > 0){
                            TOTAL -= C9OddsBet;
                            BANK += C9OddsBet;
                            TOTAL -= C9Bet;
                            BANK += C9Bet;
                        }
                        if(DC9Bet > 0){
                            TOTAL -= DC9LayBet;
                            TOTAL -= DC9Bet;
                            DC9LayBet = 0;
                            DC9Bet = 0;
                            DC9MB.setText(Integer.toString(DC9Bet));
                            DC9LayMB.setText(Integer.toString(DC9LayBet));        
                            DC9MB.setOpacity(0);
                            DC9LayMB.setOpacity(0);
                        }
                        PuckPic.setX(492);
                        PuckPic.setImage(ON);
                        payNone();
                        break;
                         
                case 10: POINT = 10;
                         point = true;
                         workBets();
                         PointLabel.setText(Integer.toString(POINT));
                         BANK += FieldBet;
                         if(C10Bet > 0){
                            TOTAL -= C10OddsBet;
                            BANK += C10OddsBet;
                            TOTAL -= C10Bet;
                            BANK += C10Bet;
                         }
                         if(DC10Bet > 0){
                            TOTAL -= DC10LayBet;
                            TOTAL -= DC10Bet;
                            DC10LayBet = 0;
                            DC10Bet = 0;
                            DC10MB.setText(Integer.toString(DC10Bet));
                            DC10LayMB.setText(Integer.toString(DC10LayBet));        
                            DC10MB.setOpacity(0);
                            DC10LayMB.setOpacity(0);
                        }
                         PuckPic.setX(591);
                         PuckPic.setImage(ON);
                         payNone();
                         if(Hard10OFF == false && Hard10Bet > 0){
                            if(Die1 == 5 && Die2 == 5){
                                BANK += Hard10Bet * 7;
                            }
                            else{
                                TOTAL -= Hard10Bet;
                                Hard10Bet = 0;
                                Hard10BetLabel.setTextFill(Color.RED);
                                Hard10BetLabel.setText("$" + Integer.toString(Hard10Bet));
                                Hard10BetMB.setText("$" + Integer.toString(Hard10Bet));
                                Hard10BetMB.setOpacity(0);
                            }
                        }
                         if(No10Bet > 0){
                            TOTAL -= No10Bet;
                            No10Bet = 0;
                            No10BetLabel.setTextFill(Color.RED);
                            No10BetLabel.setText("$" + Integer.toString(No10Bet));
                            No10BetMB.setText("$" + Integer.toString(No10Bet));
                            No10BetMB.setOpacity(0);
                        }
                         break;                        
 
                case 11: TOTAL -= DPBet;
                         DPBet = 0;
                         DPBetLabel.setText("$" + Integer.toString(DPBet));
                         DPBetLabel.setTextFill(Color.RED);
                         BANK += PassBet;
                         BANK += FieldBet;
                         // Centre Action
                         // Centre Action
                         if(ElevenBet > 0 ) BANK += ElevenBet * 15;
                         payNone();
                         break;
 
                case 12: TOTAL -= PassBet;
                         PassBet = 0;
                         PassBetLabel.setText("$" + Integer.toString(PassBet));
                         PassBetLabel.setTextFill(Color.RED);
                         BANK += FieldBet*2;
                         // Centre Action
                         if(TwelveBet > 0 ) BANK += TwelveBet * 30;
                         if(AnyCrapsBet > 0 ) BANK += AnyCrapsBet * 8;                       
                         payNone();
                         break;
                                   
                case 7: BANK += PassBet; 
                        if(DPBet > 0){
                            TOTAL -= DPBet;
                            DPBet = 0;
                            DPBetLabel.setText("$" + Integer.toString(DPBet));
                            DPBetLabel.setTextFill(Color.RED);
                         }
                         if(FieldBet>0) {
                            TOTAL -= FieldBet; 
                            FieldBetLabel.setTextFill(Color.RED);                        
                            FieldBet = 0;
                            FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                         }
                         TOTAL -= C4OddsBet+C5OddsBet+C6OddsBet+C8OddsBet+C9OddsBet+C10OddsBet;
                         BANK += C4OddsBet+C5OddsBet+C6OddsBet+C8OddsBet+C9OddsBet+C10OddsBet;
                         C4OddsBet = 0;
                         C5OddsBet = 0;
                         C6OddsBet = 0;
                         C8OddsBet = 0;
                         C9OddsBet = 0;
                         C10OddsBet = 0;
                         TOTAL -= C4Bet+C5Bet+C6Bet+C8Bet+C9Bet+C10Bet;
                         C4Bet = 0;
                         C5Bet = 0;
                         C6Bet = 0;
                         C8Bet = 0;
                         C9Bet = 0;
                         C10Bet = 0;
                         
                         TOTAL -= DC4Bet+DC4LayBet+DC5Bet+DC5LayBet+DC6Bet+DC6LayBet+DC8Bet+DC8LayBet+DC9Bet+DC9LayBet+DC10Bet+DC10LayBet;
                         BANK += DC4Bet+DC5Bet+DC6Bet+DC8Bet+DC9Bet+DC10Bet;
                         BANK += (DC4LayBet * 1.5) + (DC10LayBet * 1.5);
                         BANK += (DC5LayBet/3*2 + DC5LayBet) + (DC9LayBet/3*2 + DC9LayBet);
                         BANK += (DC6LayBet/6*5 + DC6LayBet) + (DC8LayBet/6*5 + DC8LayBet);
                         DC4Bet = 0;
                         DC5Bet = 0;
                         DC6Bet = 0;
                         DC8Bet = 0;
                         DC9Bet = 0;
                         DC10Bet = 0;
                         DC4LayBet = 0;
                         DC5LayBet = 0;
                         DC6LayBet = 0;
                         DC8LayBet = 0;
                         DC9LayBet = 0;
                         DC10LayBet = 0;
                         // Centre Action
                         int t7 = Any7Bet;
                         payNone();
                         Any7Bet = t7;
                         BANK  += Any7Bet * 4;
                         if(Hard4OFF == false && Hard4Bet > 0){
                            TOTAL -= Hard4Bet;
                            Hard4Bet = 0;
                            Hard4BetLabel.setTextFill(Color.RED);
                            Hard4BetLabel.setText("$" + Integer.toString(Hard4Bet));
                            Hard4BetMB.setText("$" + Integer.toString(Hard4Bet));
                            Hard4BetMB.setOpacity(0);                            
                         }
                         if(Hard6OFF == false && Hard6Bet > 0){
                            TOTAL -= Hard6Bet;
                            Hard6Bet = 0;
                            Hard6BetLabel.setTextFill(Color.RED);
                            Hard6BetLabel.setText("$" + Integer.toString(Hard6Bet));
                            Hard6BetMB.setText("$" + Integer.toString(Hard6Bet));
                            Hard6BetMB.setOpacity(0);                            
                         }
                         if(Hard8OFF == false && Hard8Bet > 0){
                            TOTAL -= Hard8Bet;
                            Hard8Bet = 0;
                            Hard8BetLabel.setTextFill(Color.RED);
                            Hard8BetLabel.setText("$" + Integer.toString(Hard8Bet));
                            Hard8BetMB.setText("$" + Integer.toString(Hard8Bet));
                            Hard8BetMB.setOpacity(0);                            
                         }
                         if(Hard10OFF == false && Hard10Bet > 0){
                            TOTAL -= Hard10Bet;
                            Hard10Bet = 0;
                            Hard10BetLabel.setTextFill(Color.RED);
                            Hard10BetLabel.setText("$" + Integer.toString(Hard10Bet));
                            Hard10BetMB.setText("$" + Integer.toString(Hard10Bet));
                            Hard10BetMB.setOpacity(0);                            
                         }
                         if(No4Bet > 0){
                             TOTAL -= No4Bet;
                             BANK += No4Bet * 1.5;
                             No4Bet = 0;
                             No4BetLabel.setText("$" + Integer.toString(No4Bet));
                             No4BetMB.setText("$" + Integer.toString(No4Bet));
                             No4BetMB.setOpacity(0);
                         }
                         if(No10Bet > 0){
                             TOTAL -= No10Bet;
                             BANK += No10Bet * 1.5;
                             No10Bet = 0;
                             No10BetLabel.setText("$" + Integer.toString(No10Bet));
                             No10BetMB.setText("$" + Integer.toString(No10Bet));
                             No10BetMB.setOpacity(0);
                         }
                         break;  
            }
            
        }
        
        else { // Puck ON
            switch(ROLL){
                case 2: if(ComeBet>0) {
                            TOTAL -= ComeBet;
                            ComeBetLabel.setTextFill(Color.RED);                        
                            ComeBet = 0;
                            ComeBetLabel.setText("$" + Integer.toString(ComeBet));
                        }
                        BANK += FieldBet*2;
                        BANK += DCBet;
                        // Centre Action
                        if(TwoBet > 0 ) BANK += TwoBet * 30;
                        if(AnyCrapsBet > 0 ) BANK += AnyCrapsBet * 8;                       
                        payNone();
                        break;
                    
                case 3: if(ComeBet>0) {
                            TOTAL -= ComeBet;
                            ComeBetLabel.setTextFill(Color.RED);                        
                            ComeBet = 0;
                            ComeBetLabel.setText("$" + Integer.toString(ComeBet));
                        }
                        BANK += FieldBet;
                        BANK += DCBet;
                        // Centre Action
                        if(ThreeBet > 0 ) BANK += ThreeBet * 15;
                        if(AnyCrapsBet > 0 ) BANK += AnyCrapsBet * 8;                       
                        payNone();
                        break;
                    
                case 4: if(DC4Bet > 0){
                            TOTAL -= DC4LayBet;
                            TOTAL -= DC4Bet;
                            DC4LayBet = 0;
                            DC4Bet = 0;
                            DC4MB.setText(Integer.toString(DC4Bet));
                            DC4LayMB.setText(Integer.toString(DC4LayBet));        
                            DC4MB.setOpacity(0);
                            DC4LayMB.setOpacity(0);
                        }
                        if(DCBet > 0){
                            DC4Bet = DCBet;
                            DCBet = 0;
                            DC4MB.setOpacity(1);
                            DC4MB.setText(Integer.toString(DC4Bet));
                            DCBetLabel.setText("$" + Integer.toString(DCBet));
                            DCMB.setOpacity(0);
                            DCMB.setText(Integer.toString(DCBet));
                        }
                        if(POINT == 4) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                                DPMB.setOpacity(0);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
                                DPLayMB.setOpacity(0);
                            }
                            TOTAL -= OddsBet;
                            BANK += OddsBet*3;
                            OddsBet = 0;
                            BANK += PassBet;
                            OddsBetLabel.setText("$" + Integer.toString(OddsBet));  
                            POINT = 0;
                            if(POINT == 0) PointLabel.setText("NONE");
                            point = false;
                            PuckPic.setX(0);
                            PuckPic.setImage(OFF);
                        }                         
                        BANK += FieldBet;
                        if(C4Bet > 0){
                            if(ComeBet == C4Bet){
                                BANK += C4OddsBet*2; 
                                BANK += ComeBet;
                            }else{
                                TOTAL -= C4Bet+C4OddsBet;
                                BANK += C4Bet+C4OddsBet*3; 
                                C4Bet = 0;
                                C4OddsBet = 0;
                                C4MB.setOpacity(0);
                                C4OddsMB.setOpacity(0);
                            }
                        }
                        if(ComeBet > 0 && C4Bet == 0){
                            C4Bet = ComeBet;
                            ComeBet = 0;
                            C4MB.setOpacity(1);
                            C4MB.setText(Integer.toString(C4Bet));
                            ComeMB.setOpacity(0);
                        }
                        BANK += FourBet/5*9;
                        payNone();
                        if(Hard4OFF == false){
                            if(Die1 == 2 && Die2 == 2){
                                BANK += Hard4Bet * 7;
                            }
                            else{
                                TOTAL -= Hard4Bet;
                                Hard4Bet = 0;
                                Hard4BetLabel.setTextFill(Color.RED);
                                Hard4BetLabel.setText("$" + Integer.toString(Hard4Bet));
                                Hard4BetMB.setText("$" + Integer.toString(Hard4Bet));
                                Hard4BetMB.setOpacity(0);
                            }
                        }
                        if(No4Bet > 0){
                            TOTAL -= No4Bet;
                            No4Bet = 0;
                            No4BetLabel.setTextFill(Color.RED);
                            No4BetLabel.setText("$" + Integer.toString(No4Bet));
                            No4BetMB.setText("$" + Integer.toString(No4Bet));
                            No4BetMB.setOpacity(0);
                        }
                        workBets();
                        break;
                    
                case 5: if(DC5Bet > 0){
                            TOTAL -= DC5LayBet;
                            TOTAL -= DC5Bet;
                            DC5LayBet = 0;
                            DC5Bet = 0;
                            DC5MB.setText(Integer.toString(DC5Bet));
                            DC5LayMB.setText(Integer.toString(DC5LayBet));        
                            DC5MB.setOpacity(0);
                            DC5LayMB.setOpacity(0);
                        }
                        if(DCBet > 0){
                            DC5Bet = DCBet;
                            DCBet = 0;
                            DC5MB.setOpacity(1);
                            DC5MB.setText(Integer.toString(DC5Bet));
                            DCBetLabel.setText("$" + Integer.toString(DCBet));
                            DCMB.setOpacity(0);
                            DCMB.setText(Integer.toString(DCBet));
                        }
                        if(POINT == 5) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                                DPMB.setOpacity(0);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
                                DPLayMB.setOpacity(0);
                            }
                            TOTAL -= OddsBet;
                            BANK += OddsBet*2;
                            OddsBet = 0;
                            BANK += PassBet;
                            OddsBetLabel.setText("$" + Integer.toString(OddsBet));
                            POINT = 0;
                            if(POINT == 0) PointLabel.setText("NONE");
                            point = false;
                            PuckPic.setX(0);
                            PuckPic.setImage(OFF);
                        }
                        if(FieldBet>0) {
                            TOTAL -= FieldBet;
                            FieldBetLabel.setTextFill(Color.RED);                        
                            FieldBet = 0;
                            FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                        }
                        if(C5Bet > 0){
                            if(ComeBet == C5Bet){
                                BANK += C5OddsBet*1.5; 
                                BANK += ComeBet;
                            }else{
                                TOTAL -= C5Bet+C5OddsBet;
                                BANK += C5Bet+C5OddsBet*2.5; 
                                C5Bet = 0;
                                C5OddsBet = 0;
                                C5MB.setOpacity(0);
                                C5OddsMB.setOpacity(0);
                            }
                        }
                        if(ComeBet > 0 && C5Bet == 0){
                            C5Bet = ComeBet;
                            ComeBet = 0;
                            C5MB.setOpacity(1);
                            C5MB.setText(Integer.toString(C5Bet));
                            ComeMB.setOpacity(0);
                        }
                        BANK += FiveBet/5*7;
                        payNone();
                        workBets();
                        break;
                    
                case 6: if(DC6Bet > 0){
                            TOTAL -= DC6LayBet;
                            TOTAL -= DC6Bet;
                            DC6LayBet = 0;
                            DC6Bet = 0;
                            DC6MB.setText(Integer.toString(DC6Bet));
                            DC6LayMB.setText(Integer.toString(DC6LayBet));        
                            DC6MB.setOpacity(0);
                            DC6LayMB.setOpacity(0);
                        }
                        if(DCBet > 0){
                            DC6Bet = DCBet;
                            DCBet = 0;
                            DC6MB.setOpacity(1);
                            DC6MB.setText(Integer.toString(DC6Bet));
                            DCBetLabel.setText("$" + Integer.toString(DCBet));
                            DCMB.setOpacity(0);
                            DCMB.setText(Integer.toString(DCBet));
                        }
                        if(POINT == 6) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                                DPMB.setOpacity(0);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
                                DPLayMB.setOpacity(0);
                            }
                            TOTAL -= OddsBet;
                            BANK += OddsBet/5*6;
                            OddsBet = 0;
                            BANK += PassBet;
                            OddsBetLabel.setText("$" + Integer.toString(OddsBet)); 
                            POINT = 0;
                            if(POINT == 0) PointLabel.setText("NONE");
                            point = false;
                            PuckPic.setX(0);
                            PuckPic.setImage(OFF);
                        } 
                        if(FieldBet>0) {
                            TOTAL -= FieldBet;
                            FieldBetLabel.setTextFill(Color.RED);                        
                            FieldBet = 0;
                            FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                        }
                        if(C6Bet > 0){
                            if(ComeBet == C6Bet){
                                BANK += C6OddsBet/5*6; 
                                BANK += ComeBet;
                            }else{
                                TOTAL -= C6Bet+C6OddsBet;
                                BANK += C6Bet+C6OddsBet/5*6;
                                BANK += C6OddsBet;
                                C6Bet = 0;
                                C6OddsBet = 0;
                                C6MB.setOpacity(0);
                                C6OddsMB.setOpacity(0);
                            }
                        }
                        if(ComeBet > 0 && C6Bet == 0){
                            C6Bet = ComeBet;
                            ComeBet = 0;
                            C6MB.setOpacity(1);
                            C6MB.setText(Integer.toString(C6Bet));
                            ComeMB.setOpacity(0);
                        }
                        BANK += SixBet/5*6;
                        payNone();
                        if(Hard6OFF == false){
                            if(Die1 == 3 && Die2 == 3){
                                BANK += Hard6Bet * 9;
                            }
                            else{
                                TOTAL -= Hard6Bet;
                                Hard6Bet = 0;
                                Hard6BetLabel.setTextFill(Color.RED);
                                Hard6BetLabel.setText("$" + Integer.toString(Hard6Bet));
                                Hard6BetMB.setText("$" + Integer.toString(Hard6Bet));
                                Hard6BetMB.setOpacity(0);
                            }
                        }
                        workBets();
                        break;
                    
                case 8: if(DC8Bet > 0){
                            TOTAL -= DC8LayBet;
                            TOTAL -= DC8Bet;
                            DC8LayBet = 0;
                            DC8Bet = 0;
                            DC8MB.setText(Integer.toString(DC8Bet));
                            DC8LayMB.setText(Integer.toString(DC8LayBet));        
                            DC8MB.setOpacity(0);
                            DC8LayMB.setOpacity(0);
                        }
                        if(DCBet > 0){
                            DC8Bet = DCBet;
                            DCBet = 0;
                            DC8MB.setOpacity(1);
                            DC8MB.setText(Integer.toString(DC8Bet));
                            DCBetLabel.setText("$" + Integer.toString(DCBet));
                            DCMB.setOpacity(0);
                            DCMB.setText(Integer.toString(DCBet));
                        }
                        if(POINT == 8) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                                DPMB.setOpacity(0);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
                                DPLayMB.setOpacity(0);
                            }
                            TOTAL -= OddsBet;
                            BANK += OddsBet/5*6;
                            OddsBet = 0;
                            BANK += PassBet;
                            OddsBetLabel.setText("$" + Integer.toString(OddsBet));
                            POINT = 0;
                            if(POINT == 0) PointLabel.setText("NONE");
                            PuckPic.setX(0);
                            PuckPic.setImage(OFF);
                            point = false;
                        } 
                        if(FieldBet>0) {
                            TOTAL -= FieldBet;
                            FieldBetLabel.setTextFill(Color.RED);                        
                            FieldBet = 0;
                            FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                        }
                        if(C8Bet > 0){
                            if(ComeBet == C8Bet){
                                BANK += C8OddsBet/5*6;
                                BANK += ComeBet;
                            }else{
                                TOTAL -= C8Bet+C8OddsBet;
                                BANK += C8Bet+C8OddsBet/5*6;
                                BANK += C8OddsBet;
                                C8Bet = 0;
                                C8OddsBet = 0;
                                C8MB.setOpacity(0);
                                C8OddsMB.setOpacity(0);
                            }
                        }
                        if(ComeBet > 0 && C8Bet == 0){
                            C8Bet = ComeBet;
                            ComeBet = 0;
                            C8MB.setOpacity(1);
                            C8MB.setText(Integer.toString(C8Bet));
                            ComeMB.setOpacity(0);
                        }
                        BANK += EightBet/5*6;
                        payNone();
                        if(Hard8OFF == false){
                            if(Die1 == 4 && Die2 == 4){
                                BANK += Hard8Bet * 9;
                            }
                            else{
                                TOTAL -= Hard8Bet;
                                Hard8Bet = 0;
                                Hard8BetLabel.setTextFill(Color.RED);
                                Hard8BetLabel.setText("$" + Integer.toString(Hard8Bet));
                                Hard8BetMB.setText("$" + Integer.toString(Hard8Bet));
                                Hard8BetMB.setOpacity(0);
                            }
                        }
                        workBets();
                        break;
                    
                case 9: if(DC9Bet > 0){
                            TOTAL -= DC9LayBet;
                            TOTAL -= DC9Bet;
                            DC9LayBet = 0;
                            DC9Bet = 0;
                            DC9MB.setText(Integer.toString(DC9Bet));
                            DC9LayMB.setText(Integer.toString(DC9LayBet));        
                            DC9MB.setOpacity(0);
                            DC9LayMB.setOpacity(0);
                        }
                        if(DCBet > 0){
                            DC9Bet = DCBet;
                            DCBet = 0;
                            DC9MB.setOpacity(1);
                            DC9MB.setText(Integer.toString(DC9Bet));
                            DCBetLabel.setText("$" + Integer.toString(DCBet));
                            DCMB.setOpacity(0);
                            DCMB.setText(Integer.toString(DCBet));
                        }
                        if(POINT == 9) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                                DPMB.setOpacity(0);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
                                DPLayMB.setOpacity(0);
                            }
                            TOTAL -= OddsBet;
                            BANK += OddsBet*2;
                            OddsBet = 0;
                            BANK += PassBet;
                            OddsBetLabel.setText("$" + Integer.toString(OddsBet));  
                            POINT = 0;
                            if(POINT == 0) PointLabel.setText("NONE");
                            point = false;
                            PuckPic.setX(0);
                            PuckPic.setImage(OFF);
                        }                         
                        BANK += FieldBet;
                        if(C9Bet > 0){
                            if(ComeBet == C9Bet){
                                BANK += C9OddsBet*1.5; 
                                BANK += ComeBet;
                            }else{
                                TOTAL -= C9Bet+C9OddsBet;
                                BANK += C9Bet+C9OddsBet*2.5; 
                                C9Bet = 0;
                                C9OddsBet = 0;
                                C9MB.setOpacity(0);
                                C9OddsMB.setOpacity(0);
                            }
                        }
                        if(ComeBet > 0 && C9Bet == 0){
                            C9Bet = ComeBet;
                            ComeBet = 0;
                            C9MB.setOpacity(1);
                            C9MB.setText(Integer.toString(C9Bet));
                            ComeMB.setOpacity(0);
                        }
                        BANK += NineBet/5*7;
                        payNone();
                        workBets();
                        break;
                    
               case 10: if(DC10Bet > 0){
                            TOTAL -= DC10LayBet;
                            TOTAL -= DC10Bet;
                            DC10LayBet = 0;
                            DC10Bet = 0;
                            DC10MB.setText(Integer.toString(DC10Bet));
                            DC10LayMB.setText(Integer.toString(DC10LayBet));        
                            DC10MB.setOpacity(0);
                            DC10LayMB.setOpacity(0);
                        }
                        if(DCBet > 0){
                            DC10Bet = DCBet;
                            DCBet = 0;
                            DC10MB.setOpacity(1);
                            DC10MB.setText(Integer.toString(DC10Bet));
                            DCBetLabel.setText("$" + Integer.toString(DCBet));
                            DCMB.setOpacity(0);
                            DCMB.setText(Integer.toString(DCBet));
                        }
                        if(POINT == 10) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                                DPMB.setOpacity(0);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
                                DPLayMB.setOpacity(0);
                            }
                            TOTAL -= OddsBet;
                            BANK += OddsBet*3;
                            OddsBet = 0;
                            BANK += PassBet;
                            OddsBetLabel.setText("$" + Integer.toString(OddsBet));  
                            POINT = 0;
                            if(POINT == 0) PointLabel.setText("NONE");
                            point = false;                            
                            PuckPic.setX(0);
                            PuckPic.setImage(OFF);
                        }                         
                        BANK += FieldBet;
                        if(C10Bet > 0){
                            if(ComeBet == C10Bet){
                                BANK += C10OddsBet*2; 
                                BANK += ComeBet;
                            }else{
                                TOTAL -= C10Bet+C10OddsBet;
                                BANK += C10Bet+C10OddsBet*3; 
                                C10Bet = 0;
                                C10OddsBet = 0;
                                C10MB.setOpacity(0);
                                C10OddsMB.setOpacity(0);
                            }
                        }
                        if(ComeBet > 0 && C10Bet == 0){
                            C10Bet = ComeBet;
                            ComeBet = 0;
                            C10MB.setOpacity(1);
                            C10MB.setText(Integer.toString(C10Bet));
                            ComeMB.setOpacity(0);
                        }
                        BANK += TenBet/5*9;
                        payNone();
                        if(Hard10OFF == false){
                            if(Die1 == 5 && Die2 == 5){
                                BANK += Hard10Bet * 7;
                            }
                            else{
                                TOTAL -= Hard10Bet;
                                Hard10Bet = 0;
                                Hard10BetLabel.setTextFill(Color.RED);
                                Hard10BetLabel.setText("$" + Integer.toString(Hard10Bet));
                                Hard10BetMB.setText("$" + Integer.toString(Hard10Bet));
                                Hard10BetMB.setOpacity(0);
                            }
                        }
                         if(No10Bet > 0){
                            TOTAL -= No10Bet;
                            No10Bet = 0;
                            No10BetLabel.setTextFill(Color.RED);
                            No10BetLabel.setText("$" + Integer.toString(No10Bet));
                            No10BetMB.setText("$" + Integer.toString(No10Bet));
                            No10BetMB.setOpacity(0);
                        }
                        workBets();
                        break;
                    
                case 11: if(DCBet>0) {
                            TOTAL -= DCBet;
                            DCBetLabel.setTextFill(Color.RED);                        
                            DCBet = 0;
                            DCBetLabel.setText("$" + Integer.toString(DCBet));
                            DCMB.setOpacity(0);
                         }
                         BANK += FieldBet;
                         BANK += ComeBet;
                         // Centre Action
                         if(ElevenBet > 0) BANK += ElevenBet * 15;
                         payNone();
                         break;
                    
               case 12: if(ComeBet>0) {
                            TOTAL -= ComeBet;
                            ComeBetLabel.setTextFill(Color.RED);                        
                            ComeBet = 0;
                            ComeBetLabel.setText("$" + Integer.toString(ComeBet));
                            ComeMB.setOpacity(0);
                        }
                        BANK += FieldBet*2;
                        // Centre Action
                        if(TwoBet > 0 ) BANK += TwoBet * 30;
                        if(AnyCrapsBet > 0 ) BANK += AnyCrapsBet * 8;
                        payNone();
                        break;   
                    
                case 7: if(DCBet > 0){
                             TOTAL -= DCBet;
                             DCBet = 0;
                             DCBetLabel.setText("$" + Integer.toString(DCBet));
                             DCBetLabel.setTextFill(Color.RED);
                             DCMB.setOpacity(0);
                        }
                        if(PassBet > 0){
                             TOTAL -= PassBet;
                             PassBet = 0;
                             PassBetLabel.setText("$" + Integer.toString(PassBet));
                             PassBetLabel.setTextFill(Color.RED);
                        }
                        if(OddsBet > 0){
                             TOTAL -= OddsBet;
                             OddsBet = 0;
                             OddsBetLabel.setText("$" + Integer.toString(OddsBet));
                             OddsBetLabel.setTextFill(Color.RED);
                        }
                        if(FieldBet > 0){
                             TOTAL -= FieldBet;
                             FieldBet = 0;
                             FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                             FieldBetLabel.setTextFill(Color.RED);
                        }
                        BANK += DPBet;
                        BANK += DPLayBet;
                        if(POINT == 4 || POINT == 10) BANK += DPLayBet * 1.5;                        
                        if(POINT == 5 || POINT == 9) BANK += (DPLayBet/3*2 + DPLayBet);
                        if(POINT == 6 || POINT == 8) BANK += (DPLayBet/6*5 + DPLayBet);
                        TOTAL -= DPLayBet;
                        DPLayBet = 0;
                        DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                        TOTAL -= ComeBet;
                        BANK += ComeBet*2;
                        ComeBet = 0;
                        ComeBetLabel.setText("$" + Integer.toString(ComeBet));
                        if(C4Bet > 0){
                             TOTAL -= C4Bet;
                             C4Bet = 0;
                             C4MB.setOpacity(0);
                        }
                        if(C4OddsBet > 0){
                             TOTAL -= C4OddsBet;
                             C4OddsBet = 0;
                             C4OddsMB.setOpacity(0);
                        }
                        if(C5Bet > 0){
                             TOTAL -= C5Bet;
                             C5Bet = 0;
                             C5MB.setOpacity(0);
                        }
                        if(C5OddsBet > 0){
                             TOTAL -= C5OddsBet;
                             C5OddsBet = 0;
                             C5OddsMB.setOpacity(0);
                        }
                        if(C6Bet > 0){
                             TOTAL -= C6Bet;
                             C6Bet = 0;
                             C6MB.setOpacity(0);
                        }
                        if(C6OddsBet > 0){
                             TOTAL -= C6OddsBet;
                             C6OddsBet = 0;
                             C6OddsMB.setOpacity(0);
                        }
                        if(C8Bet > 0){
                             TOTAL -= C8Bet;
                             C8Bet = 0;
                             C8MB.setOpacity(0);
                        }
                        if(C8OddsBet > 0){
                             TOTAL -= C8OddsBet;
                             C8OddsBet = 0;
                             C8OddsMB.setOpacity(0);
                        }
                        if(C9Bet > 0){
                             TOTAL -= C9Bet;
                             C9Bet = 0;
                             C9MB.setOpacity(0);
                        }
                        if(C9OddsBet > 0){
                             TOTAL -= C9OddsBet;
                             C9OddsBet = 0;
                             C9OddsMB.setOpacity(0);
                        }
                        if(C10Bet > 0){
                             TOTAL -= C10Bet;
                             C10Bet = 0;
                             C10MB.setOpacity(0);
                        }
                        if(C10OddsBet > 0){
                             TOTAL -= C10OddsBet;
                             C10OddsBet = 0;
                             C10OddsMB.setOpacity(0);
                        }
                        if(FourBet > 0){
                             TOTAL -= FourBet;
                             FourBet = 0;
                             FourBetLabel.setText("$" + Integer.toString(FourBet));
                             FourBetLabel.setTextFill(Color.RED);
                        }
                        if(FiveBet > 0){
                             TOTAL -= FiveBet;
                             FiveBet = 0;
                             FiveBetLabel.setText("$" + Integer.toString(FiveBet));
                             FiveBetLabel.setTextFill(Color.RED);
                        }
                        if(SixBet > 0){
                             TOTAL -= SixBet;
                             SixBet = 0;
                             SixBetLabel.setText("$" + Integer.toString(SixBet));
                             SixBetLabel.setTextFill(Color.RED);
                        }
                        if(EightBet > 0){
                             TOTAL -= EightBet;
                             EightBet = 0;
                             EightBetLabel.setText("$" + Integer.toString(EightBet));
                             EightBetLabel.setTextFill(Color.RED);
                        }
                        if(NineBet > 0){
                             TOTAL -= NineBet;
                             NineBet = 0;
                             NineBetLabel.setText("$" + Integer.toString(NineBet));
                             NineBetLabel.setTextFill(Color.RED);
                        }
                        if(TenBet > 0){
                             TOTAL -= TenBet;
                             TenBet = 0;
                             TenBetLabel.setText("$" + Integer.toString(TenBet));
                             TenBetLabel.setTextFill(Color.RED);
                        }
                        
                        TOTAL -= DC4Bet+DC4LayBet+DC5Bet+DC5LayBet+DC6Bet+DC6LayBet+DC8Bet+DC8LayBet+DC9Bet+DC9LayBet+DC10Bet+DC10LayBet;
                        BANK += DC4Bet*2+DC5Bet*2+DC6Bet*2+DC8Bet*2+DC9Bet*2+DC10Bet*2;
                        BANK += (DC4LayBet * 1.5) + (DC10LayBet * 1.5);
                        BANK += (DC5LayBet/3*2 + DC5LayBet) + (DC9LayBet/3*2 + DC9LayBet);
                        BANK += (DC6LayBet/6*5 + DC6LayBet) + (DC8LayBet/6*5 + DC8LayBet);
                        DC4Bet = 0;
                        DC5Bet = 0;
                        DC6Bet = 0;
                        DC8Bet = 0;
                        DC9Bet = 0;
                        DC10Bet = 0;
                        DC4LayBet = 0;
                        DC5LayBet = 0;
                        DC6LayBet = 0;
                        DC8LayBet = 0;
                        DC9LayBet = 0;
                        DC10LayBet = 0;
                                
                        POINT = 0;
                        if(POINT == 0) PointLabel.setText("NONE");
                        point = false;                        
                        PuckPic.setX(0);
                        PuckPic.setImage(OFF);
                        // Centre Action
                        if(Any7Bet > 0) BANK  += Any7Bet * 5;
                        payNone();                        
                        if(No4Bet > 0){
                             TOTAL -= No4Bet;
                             BANK += No4Bet * 1.5;
                             No4Bet = 0;
                             No4BetLabel.setText("$" + Integer.toString(No4Bet));
                             No4BetMB.setText("$" + Integer.toString(No4Bet));
                             No4BetMB.setOpacity(0);
                         }
                         if(No10Bet > 0){
                             TOTAL -= No10Bet;
                             BANK += No10Bet * 1.5;
                             No10Bet = 0;
                             No10BetLabel.setText("$" + Integer.toString(No10Bet));
                             No10BetMB.setText("$" + Integer.toString(No10Bet));
                             No10BetMB.setOpacity(0);
                         }
                         if(Hard4OFF == false && Hard4Bet > 0){
                            TOTAL -= Hard4Bet;
                            Hard4Bet = 0;
                            Hard4BetLabel.setTextFill(Color.RED);
                            Hard4BetLabel.setText("$" + Integer.toString(Hard4Bet));
                            Hard4BetMB.setText("$" + Integer.toString(Hard4Bet));
                            Hard4BetMB.setOpacity(0);                            
                         }
                         if(Hard6OFF == false && Hard6Bet > 0){
                            TOTAL -= Hard6Bet;
                            Hard6Bet = 0;
                            Hard6BetLabel.setTextFill(Color.RED);
                            Hard6BetLabel.setText("$" + Integer.toString(Hard6Bet));
                            Hard6BetMB.setText("$" + Integer.toString(Hard6Bet));
                            Hard6BetMB.setOpacity(0);                            
                         }
                         if(Hard8OFF == false && Hard8Bet > 0){
                            TOTAL -= Hard8Bet;
                            Hard8Bet = 0;
                            Hard8BetLabel.setTextFill(Color.RED);
                            Hard8BetLabel.setText("$" + Integer.toString(Hard8Bet));
                            Hard8BetMB.setText("$" + Integer.toString(Hard8Bet));
                            Hard8BetMB.setOpacity(0);                            
                         }
                         if(Hard10OFF == false && Hard10Bet > 0){
                            TOTAL -= Hard10Bet;
                            Hard10Bet = 0;
                            Hard10BetLabel.setTextFill(Color.RED);
                            Hard10BetLabel.setText("$" + Integer.toString(Hard10Bet));
                            Hard10BetMB.setText("$" + Integer.toString(Hard10Bet));
                            Hard10BetMB.setOpacity(0);                            
                         }
                         if(No4Bet > 0){
                             TOTAL -= No4Bet;
                             BANK += No4Bet * 1.5;
                             No4Bet = 0;
                             No4BetLabel.setText("$" + Integer.toString(No4Bet));
                             No4BetMB.setText("$" + Integer.toString(No4Bet));
                             No4BetMB.setOpacity(0);
                         }
                         if(No10Bet > 0){
                             TOTAL -= No10Bet;
                             BANK += No10Bet * 1.5;
                             No10Bet = 0;
                             No10BetLabel.setText("$" + Integer.toString(No10Bet));
                             No10BetMB.setText("$" + Integer.toString(No10Bet));
                             No10BetMB.setOpacity(0);
                         }
                         workBets();
                        break;   
            }
        // End If
            
        }
        //System.out.println("work Setlay");
        if(point == true) setLay(); 
        updateCash();
    }
    
    private void workBets(){
        if(point == true){
            if(Hard4Bet > 0){
                Hard4OFF = false;
                Hard4BetMB.setOpacity(1);
                Hard4BetMB.setText("$" + Integer.toString(Hard4Bet));
            }
            if(Hard6Bet > 0){
                Hard6OFF = false;
                Hard6BetMB.setOpacity(1);
                Hard6BetMB.setText("$" + Integer.toString(Hard6Bet));
            }
            if(Hard8Bet > 0){
                Hard8OFF = false;
                Hard8BetMB.setOpacity(1);
                Hard8BetMB.setText("$" + Integer.toString(Hard8Bet));
            }
            if(Hard10Bet > 0){
                Hard10OFF = false;
                Hard10BetMB.setOpacity(1);
                Hard10BetMB.setText("$" + Integer.toString(Hard10Bet));
            }
        }
        if(point == false){
            if(Hard4Bet > 0){
                Hard4OFF = true;
                Hard4BetMB.setOpacity(0.5);
                Hard4BetMB.setText("OFF");
            }
            if(Hard6Bet > 0){
                Hard6OFF = true;
                Hard6BetMB.setOpacity(0.5);
                Hard6BetMB.setText("OFF");
            }
            if(Hard8Bet > 0){
                Hard8OFF = true;
                Hard8BetMB.setOpacity(0.5);
                Hard8BetMB.setText("OFF");
            }
            if(Hard10Bet > 0){
                Hard10OFF = true;
                Hard10BetMB.setOpacity(0.5);
                Hard10BetMB.setText("OFF");
            }           
        }
    }
    
    private void payNone(){
        TOTAL -= Any7Bet+AnyCrapsBet+TwoBet+ThreeBet+ElevenBet+TwelveBet;
        if(Any7Bet > 0){
            Any7Bet = 0;
            Any7BetLabel.setTextFill(Color.RED);
            Any7BetLabel.setText("$" + Integer.toString(Any7Bet));
            Any7BetMB.setOpacity(0);
        }
        if(AnyCrapsBet > 0){
            AnyCrapsBet = 0;
            AnyCrapsBetLabel.setTextFill(Color.RED);
            AnyCrapsBetLabel.setText("$" + Integer.toString(AnyCrapsBet));
            AnyCrapsBetMB.setOpacity(0);           
        }
        if(TwoBet > 0){
            TwoBet = 0;
            TwoBetLabel.setTextFill(Color.RED);
            TwoBetLabel.setText("$" + Integer.toString(TwoBet));
            TwoBetMB.setOpacity(0);          
        }
        if(ThreeBet > 0){
            ThreeBet = 0;
            ThreeBetLabel.setTextFill(Color.RED);
            ThreeBetLabel.setText("$" + Integer.toString(ThreeBet));
            ThreeBetMB.setOpacity(0);           
        }
        if(ElevenBet > 0){
            ElevenBet = 0;
            ElevenBetLabel.setTextFill(Color.RED);
            ElevenBetLabel.setText("$" + Integer.toString(ElevenBet));
            ElevenBetMB.setOpacity(0);           
        }
        if(TwelveBet > 0){
            TwelveBet = 0;
            TwelveBetLabel.setTextFill(Color.RED);
            TwelveBetLabel.setText("$" + Integer.toString(TwelveBet));
            TwelveBetMB.setOpacity(0);           
        }
     }
     
    @FXML void C4Add(ActionEvent event) { 
        if(C4Bet > 999) return;
        if(BANK < 5){
            broke();
            return;
        }
        TOTAL += 5;
        BANK -= 5;
        C4Bet += 5;
        updateCash();       
        C4MB.setText(Integer.toString(C4Bet));
    }
    
    @FXML void C4Odds(ActionEvent event) { 
        if(C4Bet == 0) return;
        if(BANK < 5){
            broke();
            return;
        }
        if(C4OddsBet >= C4Bet*2) return;
        C4OddsBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        C4OddsMB.setOpacity(1);
        C4OddsMB.setText(Integer.toString(C4OddsBet));
    }
    
    @FXML void C4OddsMBMinus(ActionEvent event) {
        if(C4OddsBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        C4OddsBet -= 5;
        updateCash();       
        C4OddsMB.setText(Integer.toString(C4OddsBet));
        if(C4OddsBet == 0) C4OddsMB.setOpacity(0);
    }
    
    @FXML void C4OddsMBClear(ActionEvent event) {
        if(C4OddsBet == 0) return;
        TOTAL -= C4OddsBet;
        BANK += C4OddsBet;
        C4OddsBet = 0;
        updateCash();
        C4OddsMB.setOpacity(0);
    }
    
    @FXML void C5Add(ActionEvent event) { 
        if(C5Bet > 999) return;
        if(BANK < 5){
            broke();
            return;
        }
        TOTAL += 5;
        BANK -= 5;
        C5Bet += 5;
        updateCash();       
        C5MB.setText(Integer.toString(C5Bet));
    }
    
    @FXML void C5Odds(ActionEvent event) { 
        if(C5Bet == 0 || C5OddsBet >= C5Bet*2) return;
        if(C5OddsBet == 0) {
            if(BANK < 6){
                broke();
                return;
            }
            C5OddsBet += 6;
            BANK -= 6;
            TOTAL += 6;
        }else{
            if(BANK < 2){
                broke();
                return;
            }
            C5OddsBet += 2;
            BANK -= 2;
            TOTAL += 2;
        }
        updateCash();
        C5OddsMB.setOpacity(1);
        C5OddsMB.setText(Integer.toString(C5OddsBet));
    }
    
    @FXML void C5OddsMBMinus(ActionEvent event) {
        if(C5OddsBet == 0) return;
        if(C5OddsBet == 6) {
            C5OddsBet = 0;
            BANK += 6;
            TOTAL -= 6;
        }else{
            C5OddsBet -= 2;
            BANK += 2;
            TOTAL -= 2;
        }
        updateCash();       
        C5OddsMB.setText(Integer.toString(C5OddsBet));
        if(C5OddsBet == 0) C5OddsMB.setOpacity(0);
    }
    
    @FXML void C5OddsMBClear(ActionEvent event) {
        if(C5OddsBet == 0) return;
        TOTAL -= C5OddsBet;
        BANK += C5OddsBet;
        C5OddsBet = 0;
        updateCash();
        C5OddsMB.setOpacity(0);
    }
    
    @FXML void C6Add(ActionEvent event) { 
        if(C6Bet > 999) return;
        if(BANK < 5){
            broke();
            return;
        }
        TOTAL += 5;
        BANK -= 5;
        C6Bet += 5;
        updateCash();       
        C6MB.setText(Integer.toString(C6Bet));
    }
    
    @FXML void C6Odds(ActionEvent event) { 
        if(C6Bet == 0) return;
        if(C6OddsBet >= C6Bet*2) return;
        if(BANK < 5){
            broke();
            return;
        }
        C6OddsBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        C6OddsMB.setOpacity(1);
        C6OddsMB.setText(Integer.toString(C6OddsBet));
    }
    
    @FXML void C6OddsMBMinus(ActionEvent event) {
        if(C6OddsBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        C6OddsBet -= 5;
        updateCash();       
        C6OddsMB.setText(Integer.toString(C6OddsBet));
        if(C6OddsBet == 0) C6OddsMB.setOpacity(0);
    }
    
    @FXML void C6OddsMBClear(ActionEvent event) {
        if(C6OddsBet == 0) return;
        TOTAL -= C6OddsBet;
        BANK += C6OddsBet;
        C6OddsBet = 0;
        updateCash();
        C6OddsMB.setOpacity(0);
    }
    
    @FXML void C8Add(ActionEvent event) { 
        if(C8Bet > 999) return;
        if(BANK < 5){
            broke();
            return;
        }
        TOTAL += 5;
        BANK -= 5;
        C8Bet += 5;
        updateCash();       
        C8MB.setText(Integer.toString(C8Bet));
    }
    
    @FXML void C8Odds(ActionEvent event) { 
        if(C8Bet == 0) return;
        if(C8OddsBet >= C8Bet*2) return;
        if(BANK < 5){
            broke();
            return;
        }
        C8OddsBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        C8OddsMB.setOpacity(1);
        C8OddsMB.setText(Integer.toString(C8OddsBet));
    }
    
    @FXML void C8OddsMBMinus(ActionEvent event) {
        if(C8OddsBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        C8OddsBet -= 5;
        updateCash();       
        C8OddsMB.setText(Integer.toString(C8OddsBet));
        if(C8OddsBet == 0) C8OddsMB.setOpacity(0);
    }
    
    @FXML void C8OddsMBClear(ActionEvent event) {
        if(C8OddsBet == 0) return;
        TOTAL -= C8OddsBet;
        BANK += C8OddsBet;
        C8OddsBet = 0;
        updateCash();
        C8OddsMB.setOpacity(0);
    }
    
    @FXML void C9Add(ActionEvent event) { 
        if(C9Bet > 999) return;
        if(BANK < 5){
            broke();
            return;
        }
        TOTAL += 5;
        BANK -= 5;
        C9Bet += 5;
        updateCash();       
        C9MB.setText(Integer.toString(C9Bet));
    }
    
    @FXML void C9Odds(ActionEvent event) { 
        if(C9Bet == 0 || C9OddsBet >= C9Bet*2) return;
        if(C9OddsBet == 0) {
            if(BANK < 6){
                broke();
                return;
            }
            C9OddsBet += 6;
            BANK -= 6;
            TOTAL += 6;
        }else{
            if(BANK < 2){
                broke();
                return;
            }
            C9OddsBet += 2;
            BANK -= 2;
            TOTAL += 2;
        }
        updateCash();
        C9OddsMB.setOpacity(1);
        C9OddsMB.setText(Integer.toString(C9OddsBet));
    }
    
    @FXML void C9OddsMBMinus(ActionEvent event) {
        if(C9OddsBet == 0) return;
        if(C9OddsBet == 6) {
            C9OddsBet = 0;
            BANK += 6;
            TOTAL -= 6;
        }else{
            C9OddsBet -= 2;
            BANK += 2;
            TOTAL -= 2;
        }
        updateCash();       
        C9OddsMB.setText(Integer.toString(C9OddsBet));
        if(C9OddsBet == 0) C9OddsMB.setOpacity(0);
    }
    
    @FXML void C9OddsMBClear(ActionEvent event) {
        if(C9OddsBet == 0) return;
        TOTAL -= C9OddsBet;
        BANK += C9OddsBet;
        C9OddsBet = 0;
        updateCash();
        C9OddsMB.setOpacity(0);
    }
    
    @FXML void C10Add(ActionEvent event) { 
        if(C10Bet > 999) return;
        if(BANK < 5){
            broke();
            return;
        }
        TOTAL += 5;
        BANK -= 5;
        C10Bet += 5;
        updateCash();       
        C10MB.setText(Integer.toString(C10Bet));
    }
    
    @FXML void C10Odds(ActionEvent event) { 
        if(C10Bet == 0) return;
        if(BANK < 5){
            broke();
            return;
        }
        if(C10OddsBet >= C10Bet*2) return;
        C10OddsBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        C10OddsMB.setOpacity(1);
        C10OddsMB.setText(Integer.toString(C10OddsBet));
    }
    
    @FXML void C10OddsMBMinus(ActionEvent event) {
        if(C10OddsBet == 0) return;
        TOTAL -= 5;
        BANK += 5;
        C10OddsBet -= 5;
        updateCash();       
        C10OddsMB.setText(Integer.toString(C10OddsBet));
        if(C10OddsBet == 0) C10OddsMB.setOpacity(0);
    }
    
    @FXML void C10OddsMBClear(ActionEvent event) {
        if(C10OddsBet == 0) return;
        TOTAL -= C10OddsBet;
        BANK += C10OddsBet;
        C10OddsBet = 0;
        updateCash();
        C10OddsMB.setOpacity(0);
    }
    
    @FXML void DC4Lay(ActionEvent event) {
        if(DC4Bet == 0) return;
        if(BANK < 10){
            broke();
            return;
        }
        if(DC4LayBet >= DC4Bet*4) return;
        DC4LayBet += 10;
        BANK -= 10;
        TOTAL += 10;        
        updateCash();
        DC4LayMB.setOpacity(1);
        DC4LayMB.setText(Integer.toString(DC4LayBet));                
    }
    
    @FXML void DC4Down(ActionEvent event) {
        if(DC4Bet == 0) return;
        if(DC4LayBet > 0){
            TOTAL -= DC4LayBet;
            BANK += DC4LayBet;
            DC4LayBet = 0;
            updateCash();
            DC4LayMB.setOpacity(0);
        }
        TOTAL -= DC4Bet;
        BANK += DC4Bet;
        DC4Bet = 0;
        updateCash();
        DC4MB.setOpacity(0);
    }
    
    @FXML void DC4LayDown(ActionEvent event) {
        if(DC4LayBet == 0) return;
        TOTAL -= DC4LayBet;
        BANK += DC4LayBet;
        DC4LayBet = 0;
        updateCash();
        DC4LayMB.setOpacity(0);
    }
    
    @FXML void DC5Lay(ActionEvent event) { 
        if(DC5Bet == 0 || DC5LayBet >= DC5Bet*3) return;
        if(DC5LayBet == 0) {
            if(BANK < 9){
                broke();
                return;
            }
            DC5LayBet += 9;
            BANK -= 9;
            TOTAL += 9;
        }else{
            if(BANK < 3){
                broke();
                return;
            }
            DC5LayBet += 3;
            BANK -= 3;
            TOTAL += 3;
        }
        updateCash();
        DC5LayMB.setOpacity(1);
        DC5LayMB.setText(Integer.toString(DC5LayBet));
    }
    
    @FXML void DC5Down(ActionEvent event) {
        if(DC5Bet == 0) return;
        if(DC5LayBet > 0){
            TOTAL -= DC5LayBet;
            BANK += DC5LayBet;
            DC5LayBet = 0;
            updateCash();
            DC5LayMB.setOpacity(0);
        }
        TOTAL -= DC5Bet;
        BANK += DC5Bet;
        DC5Bet = 0;
        updateCash();
        DC5MB.setOpacity(0);
    }
    
    @FXML void DC5LayDown(ActionEvent event) {
        if(DC5LayBet == 0) return;
        TOTAL -= DC5LayBet;
        BANK += DC5LayBet;
        DC5LayBet = 0;
        updateCash();
        DC5LayMB.setOpacity(0);
    }
    
    @FXML void DC6Lay(ActionEvent event) { 
        if(DC6Bet == 0) return;
        if(DC6LayBet >= DC6Bet*2.4) return; 
        if(BANK < 6){
            broke();
            return;
        }
        DC6LayBet += 6;
        BANK -= 6;
        TOTAL += 6;        
        updateCash();
        DC6LayMB.setOpacity(1);
        DC6LayMB.setText(Integer.toString(DC6LayBet));
    }
    
    @FXML void DC6Down(ActionEvent event) {
        if(DC6Bet == 0) return;
        if(DC6LayBet > 0){
            TOTAL -= DC6LayBet;
            BANK += DC6LayBet;
            DC6LayBet = 0;
            updateCash();
            DC6LayMB.setOpacity(0);
        }
        TOTAL -= DC6Bet;
        BANK += DC6Bet;
        DC6Bet = 0;
        updateCash();
        DC6MB.setOpacity(0);
    }
    
    @FXML void DC6LayDown(ActionEvent event) {
        if(DC6LayBet == 0) return;
        TOTAL -= DC6LayBet;
        BANK += DC6LayBet;
        DC6LayBet = 0;
        updateCash();
        DC6LayMB.setOpacity(0);
    }
    
    @FXML void DC8Lay(ActionEvent event) { 
        if(DC8Bet == 0) return;
        if(DC8LayBet >= DC8Bet*2.4) return;
        if(BANK < 6){
            broke();
            return;
        }
        DC8LayBet += 6;
        BANK -= 6;
        TOTAL += 6;        
        updateCash();
        DC8LayMB.setOpacity(1);
        DC8LayMB.setText(Integer.toString(DC8LayBet));
    }
    
    @FXML void DC8Down(ActionEvent event) {
        if(DC8Bet == 0) return;
        if(DC8LayBet > 0){
            TOTAL -= DC8LayBet;
            BANK += DC8LayBet;
            DC8LayBet = 0;
            updateCash();
            DC8LayMB.setOpacity(0);
        }
        TOTAL -= DC8Bet;
        BANK += DC8Bet;
        DC8Bet = 0;
        updateCash();
        DC8MB.setOpacity(0);
    }
    
    @FXML void DC8LayDown(ActionEvent event) {
        if(DC8LayBet == 0) return;
        TOTAL -= DC8LayBet;
        BANK += DC8LayBet;
        DC8LayBet = 0;
        updateCash();
        DC8LayMB.setOpacity(0);
    }
    
    @FXML void DC9Lay(ActionEvent event) { 
        if(DC9Bet == 0 || DC9LayBet >= DC9Bet*3) return;
        if(DC9LayBet == 0) {
            if(BANK < 9){
                broke();
                return;
            }
            DC9LayBet += 9;
            BANK -= 9;
            TOTAL += 9;
        }else{
            if(BANK < 3){
                broke();
                return;
            }
            DC9LayBet += 3;
            BANK -= 3;
            TOTAL += 3;
        }
        updateCash();
        DC9LayMB.setOpacity(1);
        DC9LayMB.setText(Integer.toString(DC9LayBet));
    }
    
    @FXML void DC9Down(ActionEvent event) {
        if(DC9Bet == 0) return;
        if(DC9LayBet > 0){
            TOTAL -= DC9LayBet;
            BANK += DC9LayBet;
            DC9LayBet = 0;
            updateCash();
            DC9LayMB.setOpacity(0);
        }
        TOTAL -= DC9Bet;
        BANK += DC9Bet;
        DC9Bet = 0;
        updateCash();
        DC9MB.setOpacity(0);
    }
    
    @FXML void DC9LayDown(ActionEvent event) {
        if(DC9LayBet == 0) return;
        TOTAL -= DC9LayBet;
        BANK += DC9LayBet;
        DC9LayBet = 0;
        updateCash();
        DC9LayMB.setOpacity(0);
    }
    
    @FXML void DC10Lay(ActionEvent event) {
        if(DC10Bet == 0) return;
        if(DC10LayBet >= DC10Bet*4) return;
        if(BANK < 10){
            broke();
            return;
        }
        DC10LayBet += 10;
        BANK -= 10;
        TOTAL += 10;        
        updateCash();
        DC10LayMB.setOpacity(1);
        DC10LayMB.setText(Integer.toString(DC10LayBet));                
    }
    
    @FXML void DC10Down(ActionEvent event) {
        if(DC10Bet == 0) return;
        if(DC10LayBet > 0){
            TOTAL -= DC10LayBet;
            BANK += DC10LayBet;
            DC10LayBet = 0;
            updateCash();
            DC10LayMB.setOpacity(0);
        }
        TOTAL -= DC10Bet;
        BANK += DC10Bet;
        DC10Bet = 0;
        updateCash();
        DC10MB.setOpacity(0);
    }
    
    @FXML void DC10LayDown(ActionEvent event) {
        if(DC10LayBet == 0) return;
        TOTAL -= DC10LayBet;
        BANK += DC10LayBet;
        DC10LayBet = 0;
        updateCash();
        DC10LayMB.setOpacity(0);
    }
    
    /////////////////////////// New Stuff //////////////////////////////
    @FXML void No4BetButtonAction(ActionEvent event) {   
        if(No4Bet > 1999) return;
        if(BANK < 21){
            broke();
            return;
        }
        TOTAL += 21;
        BANK -= 21;
        No4Bet += 20;       
        No4BetLabel.setText("$" + Integer.toString(No4Bet));
        No4BetLabel.setTextFill(Color.GREEN);
        No4BetMB.setOpacity(1);
        No4BetMB.setText(Integer.toString(No4Bet));
        updateCash();
    }
    
    @FXML void No4BetMBMinus(ActionEvent event) {   
        if(No4Bet == 0) return;
        TOTAL -= 21;
        BANK += 21;
        No4Bet -= 20;
        updateCash();
        No4BetLabel.setText("$" + Integer.toString(No4Bet));
        No4BetMB.setText(Integer.toString(No4Bet));
        if(No4Bet == 0) No4BetMB.setOpacity(0);
    }
    
    @FXML void No4BetMBClear(ActionEvent event) {   
        if(No4Bet == 0) return;
        TOTAL -= No4Bet;
        BANK += No4Bet;
        No4Bet = 0;
        updateCash();
        No4BetLabel.setText("$" + Integer.toString(No4Bet));
        No4BetMB.setText(Integer.toString(No4Bet));
        No4BetMB.setOpacity(0);
    }
    
    @FXML void No10BetButtonAction(ActionEvent event) {   
        if(No10Bet > 1999) return;
        if(BANK < 21){
            broke();
            return;
        }
        TOTAL += 21;
        BANK -= 21;
        No10Bet += 20;
        No10BetLabel.setText("$" + Integer.toString(No10Bet));
        No10BetLabel.setTextFill(Color.GREEN);
        No10BetMB.setOpacity(1);
        No10BetMB.setText(Integer.toString(No10Bet));
        updateCash();
    }
    
    @FXML void No10BetMBMinus(ActionEvent event) {   
        if(No10Bet == 0) return;
        TOTAL -= 21;
        BANK += 21;
        No10Bet -= 20;
        updateCash();
        No10BetLabel.setText("$" + Integer.toString(No10Bet));
        No10BetMB.setText(Integer.toString(No10Bet));
        if(No10Bet == 0) No10BetMB.setOpacity(0);
    }
    
    @FXML void No10BetMBClear(ActionEvent event) {   
        if(No10Bet == 0) return;
        TOTAL -= No10Bet;
        BANK += No10Bet;
        No10Bet = 0;
        updateCash();
        No10BetLabel.setText("$" + Integer.toString(No10Bet));
        No10BetMB.setText(Integer.toString(No10Bet));
        No10BetMB.setOpacity(0);
    }
    
    @FXML void AnyCrapsBetButtonAction(ActionEvent event) {   
        if(AnyCrapsBet > 449) return;
        if(BANK < 1){
            broke();
            return;
        }
        TOTAL += 1;
        BANK -= 1;
        AnyCrapsBet += 1;
        updateCash();
        AnyCrapsBetLabel.setText("$" + Integer.toString(AnyCrapsBet));
        AnyCrapsBetLabel.setTextFill(Color.GREEN);
        AnyCrapsBetMB.setOpacity(1);
        AnyCrapsBetMB.setText("$" + Integer.toString(AnyCrapsBet));
    }
    
    @FXML void AnyCrapsBetMBMinus(ActionEvent event) {   
        if(AnyCrapsBet == 0) return;
        TOTAL -= 1;
        BANK += 1;
        AnyCrapsBet -= 1;
        updateCash();
        AnyCrapsBetLabel.setText("$" + Integer.toString(AnyCrapsBet));
        AnyCrapsBetMB.setText("$" + Integer.toString(AnyCrapsBet));
        if(AnyCrapsBet == 0) AnyCrapsBetMB.setOpacity(0);
    }
    
    @FXML void AnyCrapsBetMBClear(ActionEvent event) {   
        if(AnyCrapsBet == 0) return;
        TOTAL -= AnyCrapsBet;
        BANK += AnyCrapsBet;
        AnyCrapsBet = 0;
        updateCash();
        AnyCrapsBetLabel.setText("$" + Integer.toString(AnyCrapsBet));
        AnyCrapsBetMB.setText("$" + Integer.toString(AnyCrapsBet));
        AnyCrapsBetMB.setOpacity(0);
    }
    
     @FXML void Any7BetButtonAction(ActionEvent event) {   
        if(Any7Bet > 749) return;
        if(BANK < 1){
            broke();
            return;
        }
        TOTAL += 1;
        BANK -= 1;
        Any7Bet += 1;
        updateCash();
        Any7BetLabel.setText("$" + Integer.toString(Any7Bet));
        Any7BetLabel.setTextFill(Color.GREEN);
        Any7BetMB.setOpacity(1);
        Any7BetMB.setText("$" + Integer.toString(Any7Bet));
    }
    
    @FXML void Any7BetMBMinus(ActionEvent event) {   
        if(Any7Bet == 0) return;
        TOTAL -= 1;
        BANK += 1;
        Any7Bet -= 1;
        updateCash();
        Any7BetLabel.setText("$" + Integer.toString(Any7Bet));
        Any7BetMB.setText("$" + Integer.toString(Any7Bet));
        if(Any7Bet == 0) Any7BetMB.setOpacity(0);
    }
    
    @FXML void Any7BetMBClear(ActionEvent event) {   
        if(Any7Bet == 0) return;
        TOTAL -= Any7Bet;
        BANK += Any7Bet;
        Any7Bet = 0;
        updateCash();
        Any7BetLabel.setText("$" + Integer.toString(Any7Bet));
        Any7BetMB.setText("$" + Integer.toString(Any7Bet));
        Any7BetMB.setOpacity(0);
    }
    
    @FXML void TwoBetButtonAction(ActionEvent event) {   
        if(TwoBet > 99) return;
        if(BANK < 1){
            broke();
            return;
        }
        TOTAL += 1;
        BANK -= 1;
        TwoBet += 1;
        updateCash();
        TwoBetLabel.setText("$" + Integer.toString(TwoBet));
        TwoBetLabel.setTextFill(Color.GREEN);
        TwoBetMB.setOpacity(1);
        TwoBetMB.setText("$" + Integer.toString(TwoBet));
    }
    
    @FXML void TwoBetMBMinus(ActionEvent event) {   
        if(TwoBet == 0) return;
        TOTAL -= 1;
        BANK += 1;
        TwoBet -= 1;
        updateCash();
        TwoBetLabel.setText("$" + Integer.toString(TwoBet));
        TwoBetMB.setText("$" + Integer.toString(TwoBet));
        if(TwoBet == 0) TwoBetMB.setOpacity(0);
    }
    
    @FXML void TwoBetMBClear(ActionEvent event) {   
        if(TwoBet == 0) return;
        TOTAL -= TwoBet;
        BANK += TwoBet;
        TwoBet = 0;
        updateCash();
        TwoBetLabel.setText("$" + Integer.toString(TwoBet));
        TwoBetMB.setText("$" + Integer.toString(TwoBet));
        TwoBetMB.setOpacity(0);
    }
    
    @FXML void ThreeBetButtonAction(ActionEvent event) {   
        if(ThreeBet > 199) return;
        if(BANK < 1){
            broke();
            return;
        }
        TOTAL += 1;
        BANK -= 1;
        ThreeBet += 1;
        updateCash();
        ThreeBetLabel.setText("$" + Integer.toString(ThreeBet));
        ThreeBetLabel.setTextFill(Color.GREEN);
        ThreeBetMB.setOpacity(1);
        ThreeBetMB.setText("$" + Integer.toString(ThreeBet));
    }
    
    @FXML void ThreeBetMBMinus(ActionEvent event) {   
        if(ThreeBet == 0) return;
        TOTAL -= 1;
        BANK += 1;
        ThreeBet -= 1;
        updateCash();
        ThreeBetLabel.setText("$" + Integer.toString(ThreeBet));
        ThreeBetMB.setText("$" + Integer.toString(ThreeBet));
        if(ThreeBet == 0) ThreeBetMB.setOpacity(0);
    }
    
    @FXML void ThreeBetMBClear(ActionEvent event) {   
        if(ThreeBet == 0) return;
        TOTAL -= ThreeBet;
        BANK += ThreeBet;
        ThreeBet = 0;
        updateCash();
        ThreeBetLabel.setText("$" + Integer.toString(ThreeBet));
        ThreeBetMB.setText("$" + Integer.toString(ThreeBet));
        ThreeBetMB.setOpacity(0);
    }
    
    @FXML void ElevenBetButtonAction(ActionEvent event) {   
        if(ElevenBet > 199) return;
        if(BANK < 1){
            broke();
            return;
        }
        TOTAL += 1;
        BANK -= 1;
        ElevenBet += 1;
        updateCash();
        ElevenBetLabel.setText("$" + Integer.toString(ElevenBet));
        ElevenBetLabel.setTextFill(Color.GREEN);
        ElevenBetMB.setOpacity(1);
        ElevenBetMB.setText("$" + Integer.toString(ElevenBet));
    }
    
    @FXML void ElevenBetMBMinus(ActionEvent event) {   
        if(ElevenBet == 0) return;
        TOTAL -= 1;
        BANK += 1;
        ElevenBet -= 1;
        updateCash();
        ElevenBetLabel.setText("$" + Integer.toString(ElevenBet));
        ElevenBetMB.setText("$" + Integer.toString(ElevenBet));
        if(ElevenBet == 0) ElevenBetMB.setOpacity(0);
    }
    
    @FXML void ElevenBetMBClear(ActionEvent event) {   
        if(ElevenBet == 0) return;
        TOTAL -= ElevenBet;
        BANK += ElevenBet;
        ElevenBet = 0;
        updateCash();
        ElevenBetLabel.setText("$" + Integer.toString(ElevenBet));
        ElevenBetMB.setText("$" + Integer.toString(ElevenBet));
        ElevenBetMB.setOpacity(0);
    }
    
    @FXML void TwelveBetButtonAction(ActionEvent event) {   
        if(TwelveBet > 99) return;
        if(BANK < 1){
            broke();
            return;
        }
        TOTAL += 1;
        BANK -= 1;
        TwelveBet += 1;
        updateCash();
        TwelveBetLabel.setText("$" + Integer.toString(TwelveBet));
        TwelveBetLabel.setTextFill(Color.GREEN);
        TwelveBetMB.setOpacity(1);
        TwelveBetMB.setText("$" + Integer.toString(TwelveBet));
    }
    
    @FXML void TwelveBetMBMinus(ActionEvent event) {   
        if(TwelveBet == 0) return;
        TOTAL -= 1;
        BANK += 1;
        TwelveBet -= 1;
        updateCash();
        TwelveBetLabel.setText("$" + Integer.toString(TwelveBet));
        TwelveBetMB.setText("$" + Integer.toString(TwelveBet));
        if(TwelveBet == 0) TwelveBetMB.setOpacity(0);
    }
    
    @FXML void TwelveBetMBClear(ActionEvent event) {   
        if(TwelveBet == 0) return;
        TOTAL -= TwelveBet;
        BANK += TwelveBet;
        TwelveBet = 0;
        updateCash();
        TwelveBetLabel.setText("$" + Integer.toString(TwelveBet));
        TwelveBetMB.setText("$" + Integer.toString(TwelveBet));
        TwelveBetMB.setOpacity(0);
    }
    
    @FXML void Hard6BetButtonAction(ActionEvent event) {   
        if(Hard6Bet > 299) return;
        if(BANK < 1){
            broke();
            return;
        }
        Hard6OFF = false;
        TOTAL += 1;
        BANK -= 1;
        Hard6Bet += 1;
        updateCash();
        Hard6BetLabel.setText("$" + Integer.toString(Hard6Bet));
        Hard6BetLabel.setTextFill(Color.GREEN);
        Hard6BetMB.setOpacity(1);
        Hard6BetMB.setText("$" + Integer.toString(Hard6Bet));
    }
    
    @FXML void Hard6BetMBONOFF(ActionEvent event) {   
        if(Hard6Bet < 1) return;
        if(Hard6OFF == false){
            Hard6OFF = true;
            Hard6BetMB.setOpacity(0.5);
            Hard6BetMB.setText("OFF");
        }else{
            Hard6OFF = false;
            Hard6BetMB.setOpacity(1);
            Hard6BetMB.setText("$" + Integer.toString(Hard6Bet));
        }
    }
    
    @FXML void Hard6BetMBMinus(ActionEvent event) {   
        if(Hard6Bet == 0) return;
        TOTAL -= 1;
        BANK += 1;
        Hard6Bet -= 1;
        updateCash();
        Hard6BetLabel.setText("$" + Integer.toString(Hard6Bet));
        Hard6BetMB.setText("$" + Integer.toString(Hard6Bet));
        if(Hard6Bet == 0) Hard6BetMB.setOpacity(0);
    }
    
    @FXML void Hard6BetMBClear(ActionEvent event) {   
        if(Hard6Bet == 0) return;
        TOTAL -= Hard6Bet;
        BANK += Hard6Bet;
        Hard6Bet = 0;
        updateCash();
        Hard6BetLabel.setText("$" + Integer.toString(Hard6Bet));
        Hard6BetMB.setText("$" + Integer.toString(Hard6Bet));
        Hard6BetMB.setOpacity(0);
    }
    
    @FXML void Hard8BetButtonAction(ActionEvent event) {   
        if(Hard8Bet > 299) return;
        if(BANK < 1){
            broke();
            return;
        }
        Hard8OFF = false;
        TOTAL += 1;
        BANK -= 1;
        Hard8Bet += 1;
        updateCash();
        Hard8BetLabel.setText("$" + Integer.toString(Hard8Bet));
        Hard8BetLabel.setTextFill(Color.GREEN);
        Hard8BetMB.setOpacity(1);
        Hard8BetMB.setText("$" + Integer.toString(Hard8Bet));
    }
    
    @FXML void Hard8BetMBONOFF(ActionEvent event) {   
        if(Hard8Bet < 1) return;
        if(Hard8OFF == false){
            Hard8OFF = true;
            Hard8BetMB.setOpacity(0.5);
            Hard8BetMB.setText("OFF");
        }else{
            Hard8OFF = false;
            Hard8BetMB.setOpacity(1);
            Hard8BetMB.setText("$" + Integer.toString(Hard8Bet));
        }
    }
    
    @FXML void Hard8BetMBMinus(ActionEvent event) {   
        if(Hard8Bet == 0) return;
        TOTAL -= 1;
        BANK += 1;
        Hard8Bet -= 1;
        updateCash();
        Hard8BetLabel.setText("$" + Integer.toString(Hard8Bet));
        Hard8BetMB.setText("$" + Integer.toString(Hard8Bet));
        if(Hard8Bet == 0) Hard8BetMB.setOpacity(0);
    }
    
    @FXML void Hard8BetMBClear(ActionEvent event) {   
        if(Hard8Bet == 0) return;
        TOTAL -= Hard8Bet;
        BANK += Hard8Bet;
        Hard8Bet = 0;
        updateCash();
        Hard8BetLabel.setText("$" + Integer.toString(Hard8Bet));
        Hard8BetMB.setText("$" + Integer.toString(Hard8Bet));
        Hard8BetMB.setOpacity(0);
    }
    
    @FXML void Hard4BetButtonAction(ActionEvent event) {   
        if(Hard4Bet > 449) return;
        if(BANK < 1){
            broke();
            return;
        }
        Hard4OFF = false;
        TOTAL += 1;
        BANK -= 1;
        Hard4Bet += 1;
        updateCash();
        Hard4BetLabel.setText("$" + Integer.toString(Hard4Bet));
        Hard4BetLabel.setTextFill(Color.GREEN);
        Hard4BetMB.setOpacity(1);
        Hard4BetMB.setText("$" + Integer.toString(Hard4Bet));
    }
    
    @FXML void Hard4BetMBONOFF(ActionEvent event) {   
        if(Hard4Bet < 1) return;
        if(Hard4OFF == false){
            Hard4OFF = true;
            Hard4BetMB.setOpacity(0.5);
            Hard4BetMB.setText("OFF");
        }else{
            Hard4OFF = false;
            Hard4BetMB.setOpacity(1);
            Hard4BetMB.setText("$" + Integer.toString(Hard4Bet));
        }
    }
    
    @FXML void Hard4BetMBMinus(ActionEvent event) {   
        if(Hard4Bet == 0) return;
        TOTAL -= 1;
        BANK += 1;
        Hard4Bet -= 1;
        updateCash();
        Hard4BetLabel.setText("$" + Integer.toString(Hard4Bet));
        Hard4BetMB.setText("$" + Integer.toString(Hard4Bet));
        if(Hard4Bet == 0) Hard4BetMB.setOpacity(0);
    }
    
    @FXML void Hard4BetMBClear(ActionEvent event) {   
        if(Hard4Bet == 0) return;
        TOTAL -= Hard4Bet;
        BANK += Hard4Bet;
        Hard4Bet = 0;
        updateCash();
        Hard4BetLabel.setText("$" + Integer.toString(Hard4Bet));
        Hard4BetMB.setText("$" + Integer.toString(Hard4Bet));
        Hard4BetMB.setOpacity(0);
    }
    
    @FXML void Hard10BetButtonAction(ActionEvent event) {   
        if(Hard4Bet > 449) return;
        if(BANK < 1){
            broke();
            return;
        }
        Hard10OFF = false;
        TOTAL += 1;
        BANK -= 1;
        Hard10Bet += 1;
        updateCash();
        Hard10BetLabel.setText("$" + Integer.toString(Hard10Bet));
        Hard10BetLabel.setTextFill(Color.GREEN);
        Hard10BetMB.setOpacity(1);
        Hard10BetMB.setText("$" + Integer.toString(Hard10Bet));
    }
    
    @FXML void Hard10BetMBONOFF(ActionEvent event) {   
        if(Hard10Bet < 1) return;
        if(Hard10OFF == false){
            Hard10OFF = true;
            Hard10BetMB.setOpacity(0.5);
            Hard10BetMB.setText("OFF");
        }else{
            Hard10OFF = false;
            Hard10BetMB.setOpacity(1);
            Hard10BetMB.setText("$" + Integer.toString(Hard10Bet));
        }
    }
    
    @FXML void Hard10BetMBMinus(ActionEvent event) {   
        if(Hard10Bet == 0) return;
        TOTAL -= 1;
        BANK += 1;
        Hard10Bet -= 1;
        updateCash();
        Hard10BetLabel.setText("$" + Integer.toString(Hard10Bet));
        Hard10BetMB.setText("$" + Integer.toString(Hard10Bet));
        if(Hard10Bet == 0) Hard10BetMB.setOpacity(0);
    }
    
    @FXML void Hard10BetMBClear(ActionEvent event) {   
        if(Hard10Bet == 0) return;
        TOTAL -= Hard10Bet;
        BANK += Hard10Bet;
        Hard10Bet = 0;
        updateCash();
        Hard10BetLabel.setText("$" + Integer.toString(Hard10Bet));
        Hard10BetMB.setText("$" + Integer.toString(Hard10Bet));
        Hard10BetMB.setOpacity(0);
    }
// END    
}
