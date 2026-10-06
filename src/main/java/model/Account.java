package model;

public class Account {
    private static int autoIncrement = 1;
     private String Acc_no;
    private double curr_balance;
    private boolean isEligible;
    private double interest_rate;
    private String type;
    private int customer_id;

    public Account( double curr_balance, boolean isEligible, double interest_rate, String type,
            int customer_id) {
        this.Acc_no = "SBI"+autoIncrement; 
        this.curr_balance = curr_balance;
        this.isEligible = isEligible;
        this.interest_rate = interest_rate;
        this.type = type;
        this.customer_id = customer_id;
    }

    public String getAcc_no() {
        return Acc_no;
    }

    public void setAcc_no(String Acc_no) {
        this.Acc_no = Acc_no;
    }

    public double getCurr_balance() {
        return curr_balance;
    }

    public void setCurr_balance(double curr_balance) {
        this.curr_balance = curr_balance;
    }

    public boolean getIsEligible() {
        return isEligible;
    }

    public void isEligible(boolean isEligible) {
        this.isEligible = isEligible;
    }
    
    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(int customer_id) {
        this.customer_id = customer_id;
    }
}
