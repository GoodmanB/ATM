public class Deposit extends Transactions {


   public Deposit(int amount)
   {
       super(amount);
   }

    @Override
    public int charge(int crg) {
        return amount-crg;
    }
}
