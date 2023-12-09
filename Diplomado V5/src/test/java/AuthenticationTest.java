import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Logout;
import task.tasking.SingUp;
import task.validators.IsSigned;

public class AuthenticationTest extends BaseTest {
    @Test
    public void singUpTest(){
        SingUp.as(webDriver, "Josue Veliz", "josue.test1@gmail.com", "Passwd123");
        Assert.assertTrue(IsSigned.isSigned(webDriver));
    }

    @Test
    public void loginTest(){
        Login.as(webDriver, "josue.test1@gmail.com", "Passwd123");
        Assert.assertTrue(IsSigned.isSigned(webDriver));
    }

    @Test
    public void logoutTest(){
        Logout.as(webDriver, "josue.test1@gmail.com", "Passwd123");
        Assert.assertFalse(IsSigned.isSigned(webDriver));
    }
}
