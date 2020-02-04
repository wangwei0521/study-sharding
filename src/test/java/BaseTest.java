import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class BaseTest {
    @Test
    public void test() {
        Assert.assertTrue("这只是一个测试！", LocalDate.now().getYear() < Integer.MAX_VALUE);
        System.out.println("测试上传到GitHub");
        System.out.println("测试git pull");
        System.out.println("测试用idea上传至github");
	System.out.println("测试git第二次push");
	System.out.println("测试git第三次push");
	System.out.println("测试git第四次push");
    }
}
