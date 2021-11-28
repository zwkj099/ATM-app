package test;

public class Account {
    //账户类
    private  String cardID;
    private  String userName;
    private String passWord;
    private  double money;
    private  double quotaMoney;

    public Account() {
    }
    /**
     * @author: huwen
     * @description: TODO
     * @date: 2021/11/28 22:50
     * @param cardID
     * @param userName
     * @param passWord
     * @param money
     * @param quotaMoney
     * @return
     */

    public Account(String cardID, String userName, String passWord, double money, double quotaMoney) {
        this.cardID = cardID;
        this.userName = userName;
        this.passWord = passWord;
        this.money = money;
        this.quotaMoney = quotaMoney;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
