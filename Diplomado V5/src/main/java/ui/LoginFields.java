package ui;

import org.openqa.selenium.By;

public class LoginFields {
    public static By email = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]");
    public static By password = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]");
    public static By checkRememberMe = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_CbRemember\"]");
    public static By bottomLogin = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]");
}
