package CountMoney;

public class Main {
    public static void main(String[] args) {
        Money money = new Money();
        Product product = new Product();

        money.setMoney(10);
        money.setPennies(3);
        money.setCurrency("Euro");
        System.out.println(money.getSum());

        product.setMoney(100);
        product.subtractMoney(10);
        System.out.println(product.getMoney());
    }
}
