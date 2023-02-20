package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingData.StandardData;

public class PlovilaPage extends BasePageClass{

    private final String plovilaURL = StandardData.PLOVILA_URL;

    private final By markaPlovilaLocator = By.xpath("//div[@class='SumoSelect sumo_brand']");
    private final By selectMarka = By.xpath("//div[@class='SumoSelect sumo_brand open']//label[text()='Bavaria']");
    private final By tipPlovilaLocator = By.xpath("//div[@class='SumoSelect sumo_type']");
    private final By selectTipPlovila = By.xpath("//div[@class='SumoSelect sumo_type open']//label[text()='Čamac']");
    private final By pretragaPlovila = By.xpath("//button[@name='submit_1']");
    private final By clickSaxdor200 = By.cssSelector("section:nth-of-type(7) .overlay");
    private final By clickBroj = By.xpath("//div[text()='KLIK DA VIDIŠ BROJ']");
    private final By clickSliku = By.cssSelector(".lSGallery.lSPager > li:nth-of-type(3)  img");
    private final By clickSlikuUvecaj = By.xpath("/html//ul[@id='image-gallery']/li[3]/div/i");
    private final By closeSliku = By.xpath("//span[@class='lg-close lg-icon']");



    public PlovilaPage (WebDriver driver) {super(driver);}

    /*public PlovilaPage open(){
        openUrl(plovilaURL);
        return this;
    }*/
    public PlovilaPage clickMarka(){
        clickButton(markaPlovilaLocator);
        return this;
    }
    public PlovilaPage selectBavaria(){
        clickButton(selectMarka);
        return this;
    }
    public PlovilaPage clickTipPlovila(){
        clickButton(tipPlovilaLocator);
        return this;
    }
    public PlovilaPage selectCamac(){
        clickButton(selectTipPlovila);
        return this;
    }
    public PlovilaPage pretrazi(){
        clickButton(pretragaPlovila);
        return this;
    }
    public PlovilaPage Saxdor200(){
        clickButton(clickSaxdor200);
        return this;
    }
    public PlovilaPage open(){
        openUrl(StandardData.SAXDOR200_URL);
        return this;
    }
    public PlovilaPage clickDaVidisBr(){
        clickButton(clickBroj);
        return this;
    }
    public PlovilaPage clickSliku(){
        clickButton(clickSliku);
        return this;
    }
    public PlovilaPage clickSlikuUvecaj(){
        clickButton(clickSlikuUvecaj);
        return this;
    }
    public PlovilaPage zatvoriSliku(){
        clickButton(closeSliku);
        return this;
    }

}



