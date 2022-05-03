package CountMoney;

public class Product extends Money{

    @Override
    public void setMoney(int money) {
        super.setMoney(money);
    }

    public void subtractMoney(int subtractNum){
        int subtracted = getMoney() - subtractNum;
        setMoney(subtracted);
    }

    @Override
    public int getMoney() {
        return super.getMoney();
    }
}
