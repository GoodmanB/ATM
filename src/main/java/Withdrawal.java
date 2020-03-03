public class Withdrawal extends Transactions {


    public Withdrawal(int amount)
    {
        super(amount);
    }
    @Override
    public int charge(int crg) {
        return amount-crg;
    }
}
