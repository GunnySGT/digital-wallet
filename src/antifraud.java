// example of program that detects suspicious transactions
// fraud detection algorithm
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymowalletsecurity;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;

/**
 *
 * @author blair_000
 */
class WalletRecord {
    
    private String Time;
    private int ID1;
    private int ID2;
    private double Amount;
    private String Message;
    private String timeoftrans;
    private int accountID1;
    private int accountID2;
    private double AmountTransfer;
    private String TransactionMessage;
    
    public WalletRecord()
    { this("",0,0,0.0,"");
    
    }
//initialize
    public WalletRecord(String Time, int ID1, int ID2,double Amount, String Message)
    { setTime(Time);
      setID1(ID1);
      setID2(ID2);
      setAmount(Amount);
      setMessage(Message);
    }//end construct

    public void setTime(String Time) {
        timeoftrans = Time;
        throw new UnsupportedOperationException("Not supported yet.");
    }//end method time

    public void setID1(int ID1) {
        accountID1 = ID1;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setID2(int ID2) {
        accountID2 = ID2;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAmount(double Amount) {
        AmountTransfer = Amount;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMessage(String Message) {
         TransactionMessage = Message;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getTime(String Time){
        return timeoftrans;
    }
    public int getID1(int ID1){
        return accountID1;
    }
    public int getID2(int ID2){
        return accountID2;
    }
    
    public double getAmount(double Amount){
        return AmountTransfer;
    }
    
    public String getMessage(String Message){
        return TransactionMessage;
    }
            }
