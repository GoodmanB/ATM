public abstract class Transactions implements Charges {

    int amount;

    public Transactions()
    {}
    public Transactions(int amt)
    {
        this.amount=amt;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
