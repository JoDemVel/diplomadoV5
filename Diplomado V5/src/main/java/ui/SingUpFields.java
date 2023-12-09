package ui;

import org.openqa.selenium.By;

public class SingUpFields {
    public static By fullName = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]");
    public static By email = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]");
    public static By password = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]");
    public static By timeZone = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_DropDownTimezone\"]");
    public static String timeZoneLaPazValue = "Mountain Standard Time (Mexico)";
    public static By checkBox = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_CheckBoxTerms\"]");
    public static By signUpButtom = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]");
}