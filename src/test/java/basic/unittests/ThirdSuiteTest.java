package basic.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.fail;

public class ThirdSuiteTest {
    @Disabled
    @Test
    public void skippedTest1() {
        System.out.println("thirdTest1 successful!");
    }

    @Test
    public void failedTest2() throws Exception {
        fail("Forcing a test failure");
    }

    @Test
    public void errorTest3() throws Exception {
        throw new Exception("Throwing an error");
    }
}
