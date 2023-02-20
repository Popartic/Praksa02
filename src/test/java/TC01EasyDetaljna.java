import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DetaljnaPretragaPage;
import pages.IndexPage;
import testingData.StandardData;

public class TC01EasyDetaljna extends BaseTestClass{

    private WebDriver driver;
    private String minCena;
    private String maxCena;
    //private String pretraziModel;

    @BeforeMethod
    public void setUpTest(){
        driver = setUpDriver();
        minCena = StandardData.MIN_CENA;
        maxCena = StandardData.MAX_CENA;
        //pretraziModel = "A4";
    }

    @Test
    public void TC01(){

        IndexPage zatvoriTab = new IndexPage(driver);
        IndexPage indexPage = new IndexPage(driver).open();
        DetaljnaPretragaPage detaljnaPretraga = new DetaljnaPretragaPage(driver);

        detaljnaPretraga.detaljnaPretragaClick();

        detaljnaPretraga.clickMarka().selectAudi();
        detaljnaPretraga.clickModel().selectA4();
        detaljnaPretraga.clickMinCena().upisiMinCenu(minCena).clickMaxCena().upisiMaxCenu(maxCena);
        detaljnaPretraga.clickKaroserija().selectLimuzina();
        detaljnaPretraga.clickVrstaGoriva().selectBenzin();
        detaljnaPretraga.clickRegion().selectRegion();
        detaljnaPretraga.clickGodinaOd().selectGodinaOd();
        detaljnaPretraga.clickGodinaDo().selectGodinaDo();
        detaljnaPretraga.clickBrojVrata().selectBrojVrata();
        detaljnaPretraga.pretrazi();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownTest(){
        quitDriver(driver);
    }
}
