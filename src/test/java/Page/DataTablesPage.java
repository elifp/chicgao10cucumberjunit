package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {

    WebDriver driver;

    public DataTablesPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy(xpath ="//div[@class='DTE_Body']")
    public WebElement DataDisplay;

    @FindBy(css="#DTE_Field_first_name")
    public WebElement firstName;



}