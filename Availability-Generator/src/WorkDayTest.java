import static org.junit.Assert.*;

/**
 * @author Steven Gantz
 * @version 1.0 -
 * This file handles all likely test
 * cases regarding the WorkDay container class.
 */
public class WorkDayTest {

    @org.junit.Test
    public void testSetTrue() throws Exception {
        WorkDay Sunday = new WorkDay("Sunday");
        int testValue = 5;
        assertEquals(false, Sunday.checkBooleanValue(testValue));
        Sunday.setTrue(testValue);
        assertNotEquals(false, Sunday.checkBooleanValue(testValue));
    }

    @org.junit.Test
    public void testSetFalse() throws Exception {
        WorkDay Sunday = new WorkDay("Sunday");
        int testValue = 10;
        Sunday.setTrue(testValue);
        assertNotEquals(false, Sunday.checkBooleanValue(testValue));
        Sunday.setFalse(testValue);
        assertEquals(false, Sunday.checkBooleanValue(testValue));
    }

    @org.junit.Test
    public void testGetWorkDayName() throws Exception {
        WorkDay Sunday = new WorkDay("Sunday");
        assertEquals("Sunday", Sunday.getWorkDayName());
    }

    @org.junit.Test
    public void testSetWorkDayName() throws Exception {
        WorkDay Sunday = new WorkDay("Sunday");
        assertEquals("Sunday", Sunday.getWorkDayName());
        Sunday.setWorkDayName("Monday");
        assertEquals("Monday", Sunday.getWorkDayName());
    }

    @org.junit.Test
    public void testToString() throws Exception {
        WorkDay Sunday = new WorkDay("Sunday");
        String expected = "Sunday:falsefalsefalse" +
                "falsefalsefalsefalsefalsefalsefal" +
                "sefalsefalsefalsefalsefalsefalsef" +
                "alsefalsefalsefalsefalsefalsefals" +
                "efalsefalsefalsefalsefalsefalsefalsefalse";
        assertEquals(expected, Sunday.toString());
    }
}