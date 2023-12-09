import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.SingUp;

public class SingUpTest extends BaseTest {
    @Test
    public void singUpTest(){
        SingUp.as(webDriver, "Josue Veliz", "josue@gmail.com", "Passwd123");
    }
}
