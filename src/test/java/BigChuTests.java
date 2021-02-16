import org.junit.Test;
import org.junit.Assert;

import java.text.ParseException;

import static org.junit.Assert.fail;

public class BigChuTests {

    @Test
    public void testIfChungyBoiIsDead() {
        BigChungus bugs = new BigChungus("I ain't dead yet you cunt!");
        Assert.assertEquals("I ain't dead yet you cunt!", bugs.getMemeStatus());
    }
    @Test
    public void testMarketValuePositive() throws ParseException {
        BigChungus bugs = new BigChungus("I ain't dead yet you cunt!");
        bugs.setMarketValue(10);
        Assert.assertEquals(10,bugs.getMarketValue());
    }

    @Test(expected = ParseException.class)
    public void testMarketValueNegative() throws ParseException {
        BigChungus bugs = new BigChungus("I ain't dead yet you cunt!");
        bugs.setMarketValue(-10);
        fail("Shouldve been positive");
    }

}