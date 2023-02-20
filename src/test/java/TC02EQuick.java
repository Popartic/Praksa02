import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DetaljnaPretragaPage;
import pages.IndexPage;
import testingData.StandardData;

public class TC02EQuick extends BaseTestClass{

    private WebDriver driver;
    private String cena;

    @BeforeMethod
    public void setUpTest(){
        driver = setUpDriver();
        cena = StandardData.MIN_CENA;
    }

    @Test
    public void TC02(){


        IndexPage indexPage = new IndexPage(driver).open();

        indexPage.clickMarka().selectFord();
        indexPage.clickModel().selectFiesta();
        indexPage.clickCena().upisiCenu(cena);
        indexPage.clickOdGodiste().selectGodiste2004();
        indexPage.clickDoGodiste().selectGodiste2020();
        indexPage.clickKaroserija().selectHecbek();
        indexPage.clickGorivo().seleckBenzin();
        indexPage.klikKlik();
        indexPage.pretrazi();
    }
    @Test
    public void TC03(){

        IndexPage indexPage = new IndexPage(driver).open();
        DetaljnaPretragaPage detaljnaPretraga = new DetaljnaPretragaPage(driver);


        indexPage.clickMarka().selectLada();
        indexPage.clickModel().select1500();
        indexPage.klikKlik();
        detaljnaPretraga.clickKaroserija().selectLimuzina();
        indexPage.clickGorivo().selectBenzinTNG();
        indexPage.klikKlik();
        indexPage.pretrazi();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownTest(){
        quitDriver(driver);
    }
}
