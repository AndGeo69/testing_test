import org.junit.Test;
import org.junit.Assert;

public class BigChungusTests {

    public class BigChugTests {

        @Test
        public void testIfChungyBoiIsDead() {
            BigChungus bugs = new BigChungus("i not dead");
            Assert.assertEquals("i not dead",bugs.getMemeStatus());
        }
    }

}
