import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionsTest {

    @Test
    public void withdraw()
    {
        Withdrawal withdrawal=new Withdrawal(500);
        int amt= withdrawal.charge(20);
        assertEquals(480,amt);
    }
    @Test
    public void deposit()
    {
        Deposit deposit=new Deposit(1500);
        int amt= deposit.charge(40);
        assertEquals(1460,amt);
    }


}