package model;

public class Customer {
      static private int autoIncrement = 1;
    private int cust_id;
    private String name;
    private String phone;
    private int cibilScore;
    private String email;
    private String pwd;
    private int age;
    private boolean loanAvailed=false;

    public Customer(String name, String phone, int cibilScore, String email, String pwd, int age) {
        this.name = name;
        this.phone = phone;
        this.cibilScore = cibilScore;
        this.email = email;
        this.pwd = pwd;
        this.age = age;
        this.cust_id = autoIncrement++;
    }
     
    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCibilScore() {
        return this.cibilScore;
    }

    public void setCibilScore(int cibilScore) {
        this.cibilScore = cibilScore;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLoanAvailed() {
        return loanAvailed;
    }
    public void setLoanAvailed(boolean loanAvailed) {
        this.loanAvailed = loanAvailed;
    }

}
