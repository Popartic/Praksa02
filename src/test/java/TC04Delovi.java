import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DeloviPage;

public class TC04Delovi extends BaseTestClass{

    private WebDriver driver;

    @BeforeMethod
    public void setUpTest(){
        driver = setUpDriver();
    }

    @Test
    public void TC04(){
        DeloviPage deloviPage = new DeloviPage(driver).open();

        deloviPage.clickMarka();
        deloviPage.selectMarka();
        deloviPage.clickModel();
        deloviPage.selectModel();
        deloviPage.clickGodiste();
        deloviPage.selectGodiste();
        deloviPage.pretraziDelove();
    }
    @AfterClass(alwaysRun = true)
    public void tearDownTest(){
        quitDriver(driver);
    }
}

