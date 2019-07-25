import dealership.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void setup(){
        till = new Till(4000);
    }

    @Test
    public void hasCash() {
        assertEquals(4000, till.getCash());
    }

    @Test
    public void canRemoveCash(){
        till.removeCash(200);
        assertEquals(3800, till.getCash());
    }

    @Test
    public void canAddCash(){
        till.addCash(200);
        assertEquals(4200, till.getCash());
    }
}
