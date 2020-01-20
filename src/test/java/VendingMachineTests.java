import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class VendingMachineTests {
    VendingMachine vendingMachine;
    ArrayList<Coins> insertCoins ;
   @Before
   public void before() {
      insertCoins = new ArrayList<Coins>();
      vendingMachine = new VendingMachine(insertCoins);
   }
    @Test
    public void hasZeroBalanceWhenSwitchedOn() {
        vendingMachine = new VendingMachine();
        assertEquals(0.0, vendingMachine.getBalance());
    }
    @Test
    public void tracksTheValueOfSingleCoinInserted() {
        insertCoins.add(Coins.DOLLAR);
        vendingMachine = new VendingMachine(insertCoins);
        assertEquals(1.0, vendingMachine.getBalance());
    }

    @Test
    public void tracksTheValueIfMultipleSameCoinsInserted() {
        insertCoins.add(Coins.DOLLAR);
        insertCoins.add(Coins.DOLLAR);
        vendingMachine = new VendingMachine(insertCoins);
        assertEquals(2.0, vendingMachine.getBalance());
    }
    @Test
    public void tracksTheValueIfMixedCoinsInserted() {
        insertCoins.add(Coins.DOLLAR);
        insertCoins.add(Coins.DOLLAR);
        insertCoins.add(Coins.DIME);
        vendingMachine = new VendingMachine(insertCoins);
        assertEquals(2.10, vendingMachine.getBalance());
    }
    @Test
    public void ReturnTheInsertedCoins() {
        insertCoins.add(Coins.DOLLAR);
        insertCoins.add(Coins.DOLLAR);
        insertCoins.add(Coins.DIME);
        vendingMachine = new VendingMachine(insertCoins);
        assertEquals(2.10,  vendingMachine.getReturn());
    }
    @Test
    public void EmptyMachineAfterReturn() {
        insertCoins.add(Coins.DOLLAR);
        insertCoins.add(Coins.DOLLAR);
        insertCoins.add(Coins.DIME);
        vendingMachine = new VendingMachine(insertCoins);
        vendingMachine.getReturn();
        assertEquals(0.0,vendingMachine.getBalance() );
    }
    @Test
    public void ReturnsNoCoinsWhenZero() {
        vendingMachine = new VendingMachine();
        vendingMachine.getReturn();
        assertEquals(0.0,vendingMachine.getBalance() );
    }
}
