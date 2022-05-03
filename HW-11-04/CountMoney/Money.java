package CountMoney;

public class Money {

    private int balance = 0;
    private int money;
    private int pennies;
    private String currency;

    public Money(int money, int pennies, String currency) {
        this.money = money;
        this.pennies = pennies;
        this.currency = currency;
    }

    public Money() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPennies() {
        return pennies;
    }

    public void setPennies(int pennies) {
        this.pennies = pennies;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getSum(){
        double sum;
        double convertToPennies = this.money * 100;

        sum = (convertToPennies + this.pennies) / 100;

        return sum;
    }

}
