package model;

import java.time.LocalDateTime;

public class Transaction {
      private static int auto_increment=1;
    private int transaction_id;
    private String Acc_no;
    private String status;
    private String type;
    private double amt;
    private LocalDateTime dateTime;

    public Transaction(String Acc_no, String status, String type, double amt) {
        this.transaction_id = auto_increment++;
        this.Acc_no = Acc_no;
        this.status = status;
        this.type = type;
        this.amt = amt;
        this.dateTime = LocalDateTime.now();

    }
    
    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getAcc_no() {
        return Acc_no;
    }

    public void setAcc_no(String Acc_no) {
        this.Acc_no = Acc_no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
