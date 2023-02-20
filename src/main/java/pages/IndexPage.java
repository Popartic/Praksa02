package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testingData.StandardData;
import testingData.TimeDelay;

public class IndexPage extends BasePageClass{

    private final String indexURL = StandardData.INDEX_URL;
    private final By markaClickLocator = By.xpath("//div[@class='SumoSelect sumo_brand']");
    private final By markaFordSelect = By.xpath("//div[@class='SumoSelect sumo_brand open']//label[text()='Ford']");
    private final By markaLadaSelect = By.xpath("//div[@class='SumoSelect sumo_brand open']//label[text()='Lada']");
    private final By modelClickLocator = By.xpath("//div[@class='SumoSelect sumo_model']");
    //private final By modelFiestaSelect= By.xpath("//div[@class='SumoSelect sumo_model open']//label[text()='Fiesta']");
    private final By FiestaSelect = By.cssSelector("form > div > div:nth-of-type(2) > div[role='button']  .options > li:nth-of-type(9) > label");
    private final By model1500Select = By.cssSelector("form > div > div:nth-of-type(2) > div[role='button']  .options > li:nth-of-type(6) > label");
    private final By cenaDoLocator = By.xpath("//input[@id='price_to']");
    private final By godisteOdClick = By.xpath("//div[@class='SumoSelect sumo_year_from']");
    private final By godisteOd2004 = By.xpath("//div[@class='SumoSelect sumo_year_from open']//label[text()='2004 god.']");
    private final By godisteDoClick = By.xpath("//div[@class='SumoSelect sumo_year_to']");
    private final By godisteDo2020 = By.xpath( "//div[@class='SumoSelect sumo_year_to open']//label[text()='2020 god.']");
    private final By karoserijaLocator = By.xpath("//div[@class='SumoSelect sumo_chassis']");
    //private final By hecbekSelect = By.xpath("//div[@class='SumoSelect sumo_chassis open']//label[text()='Hečbek']");
    private final By hecbekSelect = By.cssSelector(".uk-width-9-10 > div[role='button']  .options > li:nth-of-type(2)");
    private final By gorivoLocator = By.xpath("//div[@class='SumoSelect sumo_fuel']");
    private final By gorivoSelect = By.xpath("//div[@class='SumoSelect sumo_fuel open']//label[text()='Benzin']");
    private final By BenzinTNGSelect = By.xpath(" //div[@class='SumoSelect sumo_fuel open']//label[text()='Benzin + Gas (TNG)']");
    private final By prazanClick = By.xpath("/html//div[@class='searchFormHolder']/div[2]/h1[@class='home-title uk-text-center-small']");
    private final By pretraga = By.xpath("//button[@name='submit_1']");
    //private final By pretraga = By.id("submit_1");
    //a[@href='/delovi-i-oprema']




    public IndexPage (WebDriver driver) {super(driver);}

    public IndexPage open(){
        openUrl(indexURL);
        return this;
    }
    public IndexPage clickMarka(){
        clickButton(markaClickLocator);
        return this;
    }
    public IndexPage selectFord(){
        clickButton(markaFordSelect);
        return this;
    }
    public IndexPage selectLada(){
        clickButton(markaLadaSelect);
        return this;
    }
    public IndexPage clickModel(){
        clickButton(modelClickLocator);
        return this;
    }
    public IndexPage selectFiesta(){
        clickButton(FiestaSelect);
        return this;
    }
    public IndexPage select1500(){
        clickButton(model1500Select);
        return this;
    }
    public IndexPage clickCena(){
        clickButton(cenaDoLocator);
        return this;
    }
    public IndexPage upisiCenu(String cena){
        WebElement cenaTextField = waitForWebElementToBeVisible(cenaDoLocator, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(cenaTextField, cena);
        return this;
    }
    public IndexPage clickOdGodiste(){
        clickButton(godisteOdClick);
        return this;
    }
    public IndexPage selectGodiste2004(){
        clickButton(godisteOd2004);
        return this;
    }
    public IndexPage clickDoGodiste(){
        clickButton(godisteDoClick);
        return this;
    }
    public IndexPage selectGodiste2020(){
        clickButton(godisteDo2020);
        return this;
    }
    public IndexPage clickKaroserija(){
        clickButton(karoserijaLocator);
        return this;
    }
    public IndexPage selectHecbek(){
        clickButton(hecbekSelect);
        return this;
    }
    public IndexPage clickGorivo(){
        clickButton(gorivoLocator);
        return this;
    }
    public IndexPage seleckBenzin(){
        clickButton(gorivoSelect);
        return this;
    }
    public IndexPage selectBenzinTNG(){
        clickButton(BenzinTNGSelect);
        return this;
    }
    public IndexPage klikKlik(){
        clickButton(prazanClick);
        return this;
    }
    public IndexPage pretrazi(){
        clickButton(pretraga);
        return this;
    }



}
