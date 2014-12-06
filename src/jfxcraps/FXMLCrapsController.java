
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

public class FXMLCrapsController {

    @FXML private Label OddsBetLabel;
    @FXML private Label EightBetLabel;
    @FXML private Label FieldBetLabel;
    @FXML private Label SixBetLabel;
    @FXML private Label Die2Label;
    @FXML private Label PointLabel;    
    @FXML private Label DPBetLabel;
    @FXML private Label TenBetLabel;
    @FXML private Label DCBetLabel;    
    @FXML private Label DCLayBetLabel;
    @FXML private Label PassBetLabel;
    @FXML private Label TotalBetLabel;
    @FXML private Label DPLayBetLabel;
    @FXML private Label BankLabel;
    @FXML private Label FourBetLabel;
    @FXML private Label NineBetLabel;
    @FXML private Label ComeBetLabel;
    @FXML private Label FiveBetLabel;
    @FXML private Label Die1Label;
 
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
    @FXML private MenuButton DCMB;
    
    @FXML private Button DPLayBetButton;
    @FXML private Button TenBetButton;
    @FXML private Button FieldBetButton;   
    @FXML private Button FourBetButton;
    @FXML private Button FiveBetButton;
    @FXML private Button DCLayBetButton;   
    @FXML private Button ComeBetButton;
    @FXML private Button PassBetButton;
    @FXML private Button SixBetButton;
    @FXML private Button DCBetButton;  
    @FXML private Button NineBetButton;
    @FXML private Button EightBetButton;
    @FXML private Button DPBetButton;
    @FXML private Button OddsBetButton;
    @FXML private Button RollButton;

    static int PassBet,OddsBet,FieldBet,ComeBet,FourBet,FiveBet,SixBet,EightBet,NineBet,
            TenBet,DPBet,DPLayBet,DCBet,DCLayBet,Die1,Die2,ROLL,POINT,BANK,TOTAL = 0;   
    
    boolean point = false;   
        
    Image ONE,TWO,THREE,FOUR,FIVE,SIX,ON,OFF;
 
    public FXMLCrapsController(){
        BANK = 100;
        
        ONE     = new Image(FXMLCrapsController.class.getResourceAsStream("1.png"));
        TWO     = new Image(FXMLCrapsController.class.getResourceAsStream("2.png"));
        THREE   = new Image(FXMLCrapsController.class.getResourceAsStream("3.png"));
        FOUR    = new Image(FXMLCrapsController.class.getResourceAsStream("4.png"));
        FIVE    = new Image(FXMLCrapsController.class.getResourceAsStream("5.png"));
        SIX     = new Image(FXMLCrapsController.class.getResourceAsStream("6.png"));
        ON      = new Image(FXMLCrapsController.class.getResourceAsStream("on.png"));
        OFF     = new Image(FXMLCrapsController.class.getResourceAsStream("off.png"));
    }
    
    Random r = new Random();
    
    @FXML void PassButtonAction(ActionEvent event) { 
        if(BANK < 1) return;
        if(point == true) return;
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
        if(point == true) return;
        TOTAL -= 5;
        BANK += 5;
        PassBet -= 5;
        updateCash();
        PassBetLabel.setText("$" + Integer.toString(PassBet));
        PassMB.setText(Integer.toString(PassBet));
        if(PassBet == 0) PassMB.setOpacity(0);
    }
    
    @FXML void PassMBClear(ActionEvent event) { 
        if(point == true) return;
        TOTAL -= PassBet;
        BANK += PassBet;
        PassBet = 0;
        updateCash();
        PassBetLabel.setText("$" + Integer.toString(PassBet));
        PassBetLabel.setTextFill(Color.BLACK);
        PassMB.setOpacity(0);
    }
    
    @FXML void OddsButtonAction(ActionEvent event) {
        if(BANK < 1) return;
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
        TOTAL -= 5;
        BANK += 5;
        OddsBet -= 5;
        updateCash();
        OddsBetLabel.setText("$" + Integer.toString(OddsBet));
        OddsMB.setText(Integer.toString(OddsBet));
        if(OddsBet == 0) OddsMB.setOpacity(0);
    }
    
    @FXML void OddsMBClear(ActionEvent event) { 
        TOTAL -= OddsBet;
        BANK += OddsBet;
        OddsBet = 0;
        updateCash();
        OddsBetLabel.setText("$" + Integer.toString(OddsBet));
        OddsBetLabel.setTextFill(Color.BLACK);
        OddsMB.setOpacity(0);
    }   
   
    @FXML void FieldButtonAction(ActionEvent event) {
        if(BANK < 1) return;
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
        TOTAL -= 5;
        BANK += 5;
        FieldBet -= 5;
        updateCash();
        FieldBetLabel.setText("$" + Integer.toString(FieldBet));
        FieldMB.setText(Integer.toString(FieldBet));
        if(FieldBet == 0) FieldMB.setOpacity(0);
    }
    
    @FXML void FieldMBClear(ActionEvent event) { 
        TOTAL -= FieldBet;
        BANK += FieldBet;
        FieldBet = 0;
        updateCash();
        FieldBetLabel.setText("$" + Integer.toString(FieldBet));
        FieldMB.setOpacity(0);
    }
    
    @FXML void ComeButtonAction(ActionEvent event) {
        if(BANK < 1) return;
        ComeBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        ComeBetLabel.setText("$" + Integer.toString(ComeBet));
        ComeBetLabel.setTextFill(Color.GREEN);
        TenMB.setOpacity(1);
        ComeMB.setText(Integer.toString(ComeBet));
    }

    @FXML void ComeMBMinus(ActionEvent event) { 
        TOTAL -= 5;
        BANK += 5;
        ComeBet -= 5;
        updateCash();
        ComeBetLabel.setText("$" + Integer.toString(ComeBet));
        ComeMB.setText(Integer.toString(ComeBet));
        if(ComeBet == 0) ComeMB.setOpacity(0);
    }
    
    @FXML void ComeMBClear(ActionEvent event) { 
        TOTAL -= ComeBet;
        BANK += ComeBet;
        ComeBet = 0;
        updateCash();
        ComeBetLabel.setText("$" + Integer.toString(ComeBet));
        ComeBetLabel.setTextFill(Color.BLACK);
        ComeMB.setOpacity(0);
    }
    
    @FXML void FourBetButtonAction(ActionEvent event) {
        if(BANK < 1) return;
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
        TOTAL -= 5;
        BANK += 5;
        FourBet -= 5;
        updateCash();
        FourBetLabel.setText("$" + Integer.toString(FourBet));
        FourMB.setText(Integer.toString(FourBet));
        if(FourBet == 0) FourMB.setOpacity(0);
    }
    
    @FXML void FourMBClear(ActionEvent event) { 
        TOTAL -= FourBet;
        BANK += FourBet;
        FourBet = 0;
        updateCash();
        FourBetLabel.setText("$" + Integer.toString(FourBet));
        FourBetLabel.setTextFill(Color.BLACK);
        FourMB.setOpacity(0);
    }
    
    @FXML void FiveBetButtonAction(ActionEvent event) {
        if(BANK < 1) return;
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
        TOTAL -= FiveBet;
        BANK += FiveBet;
        FiveBet = 0;
        updateCash();
        FiveBetLabel.setText("$" + Integer.toString(FiveBet));
        FiveMB.setOpacity(0);
    }
    
    @FXML void SixBetButtonAction(ActionEvent event) {
        if(BANK < 1) return;
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
        TOTAL -= 6;
        BANK += 6;
        SixBet -= 6;
        updateCash();
        SixBetLabel.setText("$" + Integer.toString(SixBet));
        SixMB.setText(Integer.toString(SixBet));
        if(SixBet == 0) SixMB.setOpacity(0);
    }
    
    @FXML void SixMBClear(ActionEvent event) { 
        TOTAL -= SixBet;
        BANK += SixBet;
        SixBet = 0;
        updateCash();
        SixBetLabel.setText("$" + Integer.toString(SixBet));
        SixBetLabel.setTextFill(Color.BLACK);
        SixMB.setOpacity(0);
    }
    
    @FXML void EightBetButtonAction(ActionEvent event) {
        if(BANK < 1) return;
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
        TOTAL -= 6;
        BANK += 6;
        EightBet -= 6;
        updateCash();
        EightBetLabel.setText("$" + Integer.toString(EightBet));
        EightMB.setText(Integer.toString(EightBet));
        if(EightBet == 0) EightMB.setOpacity(0);
    }
    
    @FXML void EightMBClear(ActionEvent event) { 
        TOTAL -= EightBet;
        BANK += EightBet;
        EightBet = 0;
        updateCash();
        EightBetLabel.setText("$" + Integer.toString(EightBet));
        EightBetLabel.setTextFill(Color.BLACK);
        EightMB.setOpacity(0);
    }
    
    @FXML void NineBetButtonAction(ActionEvent event) {
        if(BANK < 1) return;
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
        TOTAL -= 5;
        BANK += 5;
        NineBet -= 5;
        updateCash();
        NineBetLabel.setText("$" + Integer.toString(NineBet));
        NineMB.setText(Integer.toString(NineBet));
        if(NineBet == 0) NineMB.setOpacity(0);
    }
    
    @FXML void NineMBClear(ActionEvent event) { 
        TOTAL -= NineBet;
        BANK += NineBet;
        NineBet = 0;
        updateCash();
        NineBetLabel.setText("$" + Integer.toString(NineBet));
        NineBetLabel.setTextFill(Color.BLACK);
        NineMB.setOpacity(0);
    }
 
        @FXML void TenBetButtonAction(ActionEvent event) {
        if(BANK < 1) return;
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
        TOTAL -= TenBet;
        BANK += TenBet;
        TenBet = 0;
        updateCash();
        TenBetLabel.setText("$" + Integer.toString(TenBet));
        TenMB.setOpacity(0);
    }
    
    @FXML void DPBetButtonAction(ActionEvent event) {
        if(BANK < 1) return;
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
        TOTAL -= 5;
        BANK += 5;
        DPBet -= 5;
        updateCash();
        DPBetLabel.setText("$" + Integer.toString(DPBet));
        DPMB.setText(Integer.toString(DPBet));
        if(DPBet == 0) DPMB.setOpacity(0);
    }
    
    @FXML void DPMBClear(ActionEvent event) { 
        TOTAL -= DPBet;
        BANK += DPBet;
        DPBet = 0;
        updateCash();
        DPBetLabel.setText("$" + Integer.toString(DPBet));
        DPMB.setOpacity(0);
    }
        
    @FXML void DPLayButtonAction(ActionEvent event) {
        if(BANK < 1) return;
        if(POINT == 0 || DPBet == 0) return;
        int var = 0;
        if(POINT == 4 || POINT == 10) var = 10;
        if(POINT == 5 || POINT == 9) var = 8;
        if(POINT == 6 || POINT == 8) var = 6;
        DPLayBet += var; 
        BANK -= DPLayBet;
        TOTAL += DPLayBet;        
        updateCash();
        DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
        DPLayBetLabel.setTextFill(Color.GREEN);
        DPLayMB.setOpacity(1);
        DPLayMB.setText(Integer.toString(DPLayBet));
    }

    @FXML void DPLayMBMinus(ActionEvent event) { 
        int var = 0;
        if(POINT == 4 || POINT == 10) var = 10;
        if(POINT == 5 || POINT == 9) var = 8;
        if(POINT == 6 || POINT == 8) var = 6;
        TOTAL -= var;
        BANK += var;
        DPLayBet -= var;
        updateCash();
        DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
        DPLayMB.setText(Integer.toString(DPLayBet));
        if(DPLayBet == 0) DPLayMB.setOpacity(0);
    }
    
    @FXML void DPLayMBClear(ActionEvent event) { 
        TOTAL -= DPLayBet;
        BANK += DPLayBet;
        DPLayBet = 0;
        updateCash();
        DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
        DPLayMB.setOpacity(0);
    }
    
    @FXML void DCBetButtonAction(ActionEvent event) {
        if(BANK < 1) return;
        if(point == false) return;
        DCBet += 5;
        BANK -= 5;
        TOTAL += 5;        
        updateCash();
        DCBetLabel.setText("$" + Integer.toString(DCBet));
        DCBetLabel.setTextFill(Color.GREEN);
    }

    @FXML void DCLayButtonAction(ActionEvent event) {
        // CHANGE THIS TO ENABLE (BANK < 1)
        if(BANK > 0) return;
        if(POINT == 0 || DPBet == 0) return;
        int var = 0;
        if(POINT == 4 || POINT == 10) var = 10;
        if(POINT == 5 || POINT == 9) var = 8;
        if(POINT == 6 || POINT == 8) var = 6;
        DCLayBet += var;
        BANK -= DCLayBet;
        TOTAL += DCLayBet;        
        updateCash();
        DCLayBetLabel.setText("$" + Integer.toString(DCLayBet));
        DCLayBetLabel.setTextFill(Color.GREEN);
    }
    
    @FXML void RollButtonAction(ActionEvent event) {
        if(BANK <= 1 && TOTAL == 0) return;
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
        DCLayBetLabel.setTextFill(Color.BLACK);
        
        work();       
        updateCash(); // Needed?
    }
    
    private void updateCash(){
        BankLabel.setText("$" + Integer.toString(BANK));
        TotalBetLabel.setText("$" + Integer.toString(TOTAL));
     
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
        
    }
    
    private int rollDie(){
        return r.nextInt(6)+1;
    }
    
    private void work(){
        if(TOTAL == 0) {
            System.out.println("No Bets!");
            return;
        }
        Die1 = rollDie();
        Die2 = rollDie();
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
        
        ROLL = Die1 + Die2;
        System.out.println("Roll is: " + ROLL);
        System.out.println("point is: " + point);
        System.out.println("POINT is: " + POINT);
        if(point == false){
            switch(ROLL){
                
                case 2: TOTAL -= PassBet;
                        PassBet = 0;
                        PassBetLabel.setText("$" + Integer.toString(PassBet));
                        PassBetLabel.setTextFill(Color.RED);
                        BANK += DPBet;
                        BANK += DCBet;
                        BANK += FieldBet*2;
                        break;
                
                case 3: TOTAL -= PassBet;
                        PassBet = 0;
                        PassBetLabel.setText("$" + Integer.toString(PassBet));
                        PassBetLabel.setTextFill(Color.RED);
                        BANK += DPBet;
                        BANK += DCBet;
                        BANK += FieldBet;
                        break;
                
                case 4: POINT = 4;
                        point = true;
                        PointLabel.setText(Integer.toString(POINT));
                        BANK += FieldBet;
                        // Come Bets on 4 Win
                        // DC bets on 4 lose
                        PuckPic.setX(78);
                        PuckPic.setImage(ON);
                        break;
                
                case 5: POINT = 5;
                        point = true;
                        PointLabel.setText(Integer.toString(POINT));
                        if(FieldBet>0) {
                            TOTAL -= FieldBet;
                            FieldBetLabel.setTextFill(Color.RED);                        
                            FieldBet = 0;
                            FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                        }
                        // Come Bets on 5 Win
                        // DC bets on 5 lose
                        PuckPic.setX(156);
                        PuckPic.setImage(ON);
                        break;
                
                case 6: POINT = 6;
                        point = true;
                        PointLabel.setText(Integer.toString(POINT));                        
                        if(FieldBet>0) {
                            TOTAL -= FieldBet;
                            FieldBetLabel.setTextFill(Color.RED);                        
                            FieldBet = 0;
                            FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                        }
                        // Come Bets on 6 Win
                        // DC bets on 6 lose
                        PuckPic.setX(231);
                        PuckPic.setImage(ON);
                        break;

                case 8: POINT = 8;
                        point = true;
                        PointLabel.setText(Integer.toString(POINT));
                        if(FieldBet>0) {
                            TOTAL -= FieldBet;
                            FieldBetLabel.setTextFill(Color.RED);                        
                            FieldBet = 0;
                            FieldBetLabel.setText("$" + Integer.toString(FieldBet));
                        }
                        // Come Bets on 8 Win
                        // DC bets on 8 lose
                        PuckPic.setX(311);
                        PuckPic.setImage(ON);
                        break;
                   
                case 9: POINT = 9;
                        point = true;
                        PointLabel.setText(Integer.toString(POINT));
                        BANK += FieldBet;
                        // Come Bets on 9 Win
                        // DC bets on 9 lose
                        PuckPic.setX(388);
                        PuckPic.setImage(ON);
                        break;
                         
                case 10: POINT = 10;
                         point = true;
                         PointLabel.setText(Integer.toString(POINT));
                         BANK += FieldBet;
                         // Come Bets on 10 Win
                         // DC bets on 10 lose
                         PuckPic.setX(465);
                         PuckPic.setImage(ON);
                         break;                        
 
                case 11: TOTAL -= DPBet;
                         DPBet = 0;
                         DPBetLabel.setText("$" + Integer.toString(DPBet));
                         DPBetLabel.setTextFill(Color.RED);
                         BANK += PassBet;
                         BANK += FieldBet;
                         break;    
 
                case 12: TOTAL -= PassBet;
                         PassBet = 0;
                         PassBetLabel.setText("$" + Integer.toString(PassBet));
                         PassBetLabel.setTextFill(Color.RED);
                         BANK += FieldBet*2;
                         break;
                                   
                case 7:  TOTAL -= DCBet;
                         TOTAL -= DCLayBet;
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
                         if(ComeBet>0) { 
                            TOTAL -= ComeBet;
                            ComeBetLabel.setTextFill(Color.RED);                        
                            ComeBet = 0;
                            ComeBetLabel.setText("$" + Integer.toString(ComeBet));
                         }
                         //Save Odds
                         BANK += PassBet;
                         BANK += DCBet;
                         DCBet = 0;
                         if(POINT == 4 || POINT == 10) BANK += DCLayBet/2;
                         if(POINT == 5 || POINT == 9) BANK += DCLayBet/3;        
                         if(POINT == 6 || POINT == 8) BANK += (DCLayBet/6*5);
                         DCLayBet = 0;
                         DCBetLabel.setText("$" + Integer.toString(DCBet));
                         DCLayBetLabel.setText("$" + Integer.toString(DCLayBet));
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
                        break;
                    
                case 3: if(ComeBet>0) {
                            TOTAL -= ComeBet;
                            ComeBetLabel.setTextFill(Color.RED);                        
                            ComeBet = 0;
                            ComeBetLabel.setText("$" + Integer.toString(ComeBet));
                        }
                        BANK += FieldBet;
                        BANK += DCBet;
                        break;
                    
                case 4: // DC bets on 4 lose
                        // DC bets go to 4
                        if(POINT == 4) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
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
                        // ComeBets move to 4
                        BANK += FourBet/5*9;                       
                        break;
                    
                case 5: // DC bets on 5 lose
                        // DC bets go to 5
                        if(POINT == 5) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
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
                        // ComeBets move to 5
                        BANK += FiveBet/5*7;
                        break;
                    
                case 6: // DC bets on 6 lose
                        // DC bets go to 6
                        if(POINT == 6) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
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
                        // ComeBets move to 6
                        BANK += SixBet/5*6;
                        break;
                    
                case 8: // DC bets on 8 lose
                        // DC bets go to 8
                        if(POINT == 8) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
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
                        // ComeBets move to 8
                        BANK += EightBet/5*6;
                        break;
                    
                case 9: // DC bets on 9 lose
                        // DC bets go to 9
                        if(POINT == 9) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
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
                        // ComeBets move to 9
                        BANK += NineBet/5*7;                       
                        break;
                    
               case 10: // DC bets on 10 lose
                        // DC bets go to 10
                        if(POINT == 10) {
                            if(DPBet > 0){
                                TOTAL -= DPBet;
                                DPBet = 0;
                                DPBetLabel.setText("$" + Integer.toString(DPBet));
                                DPBetLabel.setTextFill(Color.RED);
                            }
                            if(DPLayBet > 0){
                                TOTAL -= DPLayBet;
                                DPLayBet = 0;
                                DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                                DPLayBetLabel.setTextFill(Color.RED);
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
                        // ComeBets move to 10
                        BANK += TenBet/5*9;                       
                        break;
                    
                case 11: if(DCBet>0) {
                            TOTAL -= DCBet;
                            DCBetLabel.setTextFill(Color.RED);                        
                            DCBet = 0;
                            DCBetLabel.setText("$" + Integer.toString(DCBet));
                         }
                         BANK += FieldBet;
                         BANK += ComeBet;
                         break;
                    
               case 12: if(ComeBet>0) {
                            TOTAL -= ComeBet;
                            ComeBetLabel.setTextFill(Color.RED);                        
                            ComeBet = 0;
                            ComeBetLabel.setText("$" + Integer.toString(ComeBet));
                        }
                        BANK += FieldBet*2;
                        break;   
                    
                case 7: if(DCBet > 0){
                             TOTAL -= DCBet;
                             DCBet = 0;
                             DCBetLabel.setText("$" + Integer.toString(DCBet));
                             DCBetLabel.setTextFill(Color.RED);
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
                        if(POINT == 4 || POINT == 10) BANK += DPLayBet * 1.5;
                        if(POINT == 5 || POINT == 9) BANK += (DPLayBet/3*2 + DPLayBet);
                        if(POINT == 6 || POINT == 8) BANK += (DPLayBet/6*5 + DPLayBet);
                        DPLayBet = 0;
                        DPLayBetLabel.setText("$" + Integer.toString(DPLayBet));
                        TOTAL -= ComeBet;
                        BANK += ComeBet*2;
                        ComeBet = 0;
                        ComeBetLabel.setText("$" + Integer.toString(ComeBet));
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
                        POINT = 0;
                        if(POINT == 0) PointLabel.setText("NONE");
                        point = false;
                        PuckPic.setX(0);
                        PuckPic.setImage(OFF);
                        break;   
            }
        // End If
            
        }
        
        updateCash();
    }
}
