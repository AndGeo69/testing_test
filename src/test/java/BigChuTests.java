import org.junit.Test;
import org.junit.Assert;

public class BigChuTests {

    @Test
    public void testIfChungyBoiIsDead() {
        BigChungus bugs = new BigChungus("I ain't dead yet you cunt!");
        Assert.assertEquals("I ain't dead yet you cunt!", bugs.getMemeStatus());
    }
}