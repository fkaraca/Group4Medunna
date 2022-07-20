package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaMainPage {

    public MedunnaMainPage(){PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath="//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;
    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInRegister;


    @FindBy(xpath="//input[@id='appoDate']") public WebElement appoDate;

    @FindBy(xpath="//span[normalize-space()='Appointment date can not be past date!']") public WebElement appointmentDateCanNotBePa;







}
