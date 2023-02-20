import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PlovilaPage;
import testingData.StandardData;

public class TC03Plovila extends BaseTestClass{

    private WebDriver driver;

    @BeforeMethod
    public void setUpTest(){
        driver = setUpDriver();
    }

    @Test (priority = 2)
    public void TC03(){
        PlovilaPage plovilaPage = new PlovilaPage(driver).open();

        plovilaPage.clickMarka().selectBavaria();
        plovilaPage.clickTipPlovila().selectCamac();
        plovilaPage.pretrazi();
    }

    @Test (priority = 1)
    public void TC04(){
        PlovilaPage plovilaPage = new PlovilaPage(driver).open();

        //plovilaPage.Saxdor200();
        plovilaPage.clickDaVidisBr();
        plovilaPage.clickSliku();
        plovilaPage.clickSlikuUvecaj();
        plovilaPage.zatvoriSliku();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownTest(){
        quitDriver(driver);
    }
}
