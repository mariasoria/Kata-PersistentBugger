import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersistentBuggerTest {

    @Test
    public void ifThereOneDigitReturns0 (){
        assertEquals(0, PersistentBugger.persistence(4));
    }

    @Test
    public void returnsOnePersistence() {
        assertEquals(1, PersistentBugger.persistence(23));
    }

    @Test
    public void returnsTwoPersistence() {
        assertEquals(2, PersistentBugger.persistence(25));
    }

    @Test
    public void returnsThreePersistence() {
        assertEquals(3, PersistentBugger.persistence(39));
    }

    @Test
    public void returnFourPersistence() {
        assertEquals(4, PersistentBugger.persistence(999));
    }
}
