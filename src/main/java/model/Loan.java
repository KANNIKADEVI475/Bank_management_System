package model;

public class Loan {
     static private int autoIncrement=1;
    private int loanId;
    private String status;
    private int customer_id;
    private String type;

    public Loan( String status, int customer_id, String type) {
        this.loanId = autoIncrement++;
        this.status = status;
        this.customer_id = customer_id;
        this.type = type;
    }

    public int getLoadId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
