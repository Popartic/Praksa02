package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testingData.StandardData;
import testingData.TimeDelay;

public class DetaljnaPretragaPage extends BasePageClass{

    private final By detaljnaPretragaButton = By.xpath("//button[text()='DETALJNA PRETRAGA']");
    private final By markaClickLocator = By.xpath("//div[@class='SumoSelect sumo_brand']");
    private final By markaAudiLocator = By.xpath("//div[@class='SumoSelect sumo_brand open']//label[text()='Audi']");
    private final By modelClickLocator = By.xpath("//div[@class='SumoSelect sumo_model']");
    private final By a4Locator = By.xpath("//*[contains(@class,'SumoSelect sumo_model')]//ul[@class='options']/li[8]/label");
    private final By karoserijaClickLocator = By.xpath("//div[@class='SumoSelect sumo_chassis']");
    private final By limuzinaLocator = By.xpath("//*[contains(@class,'SumoSelect sumo_chassis')]//ul[@class='options']/li[1]");
    private final By minCenaLocator = By.id("price_from");
    private final By maxCenaLocator = By.id("price_to");
    private final By fuelClickLocator = By.xpath("//*[contains(@class, 'sumo_fuel')]");
    private final By benzinLocator = By.xpath("//*[contains(@class, 'sumo_fuel')]//*[contains(@class, 'options')]/li/span/i");
    private final By regionClick = By.xpath("//*[@title=' Region']//*[contains(@class, 'placeholder')]");
    private final By selectBeograd = By.xpath("//*[contains(@class, 'sumo_region')]//label[text()='Beograd']");
    private final By godinaOdClick = By.xpath("//div[@class='SumoSelect sumo_year_from']");
    private final By selectGodina2005 = By.xpath("//div[@class='SumoSelect sumo_year_from open']//label[text()='2005 god.']");
    private final By godinaDoClick = By.xpath("//div[@class='SumoSelect sumo_year_to']");
    private final By selectGodina2020 = By.xpath("//div[@class='SumoSelect sumo_year_to open']//label[text()='2020 god.']");
    private final By brojVrataClick = By.xpath("//div[@class='SumoSelect sumo_door_num']");
    private final By selectVrata45 = By.xpath("//div[@class='SumoSelect sumo_door_num open']//label[text()='4/5 vrata']");
    private final By pretrazi = By.id("submit_1");

    public DetaljnaPretragaPage (WebDriver driver) {super(driver);}

    public DetaljnaPretragaPage detaljnaPretragaClick(){
        clickButton(detaljnaPretragaButton);
        return this;
    }
    public DetaljnaPretragaPage clickMarka(){
        clickButton(markaClickLocator);
        return this;
    }
    public DetaljnaPretragaPage selectAudi(){
        clickButton(markaAudiLocator);
        return this;
    }
    public DetaljnaPretragaPage clickModel(){
        clickButton(modelClickLocator);
        return this;
    }
    public DetaljnaPretragaPage selectA4(){
        clickButton(a4Locator);
        return this;
    }
    public DetaljnaPretragaPage clickMinCena(){
        clickButton(minCenaLocator);
        return this;
    }
    public DetaljnaPretragaPage upisiMinCenu(String minCena){
        WebElement minCenaTextField = waitForWebElementToBeVisible(minCenaLocator, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(minCenaTextField, minCena);
        return this;
    }
    public DetaljnaPretragaPage clickMaxCena(){
        clickButton(maxCenaLocator);
        return this;
    }
    public DetaljnaPretragaPage upisiMaxCenu(String maxCena){
        WebElement maxCenaTextField = waitForWebElementToBeVisible(maxCenaLocator, TimeDelay.DELAY_3_SEC);
        clearAndTypeTextToWebElement(maxCenaTextField, maxCena);
        return this;
    }
    public DetaljnaPretragaPage clickKaroserija(){
        clickButton(karoserijaClickLocator);
        return this;
    }
    public DetaljnaPretragaPage selectLimuzina(){
        clickButton(limuzinaLocator);
        return this;
    }
    public DetaljnaPretragaPage clickVrstaGoriva(){
        clickButton(fuelClickLocator);
        return this;
    }
    public DetaljnaPretragaPage selectBenzin(){
        clickButton(benzinLocator);
        return this;
    }
    public DetaljnaPretragaPage clickRegion(){
        clickButton(regionClick);
        return this;
    }
    public DetaljnaPretragaPage selectRegion(){
        clickButton(selectBeograd);
        return this;
    }
    public DetaljnaPretragaPage clickGodinaOd(){
        clickButton(godinaOdClick);
        return this;
    }
    public DetaljnaPretragaPage selectGodinaOd(){
        clickButton(selectGodina2005);
        return this;
    }
    public DetaljnaPretragaPage clickGodinaDo(){
        clickButton(godinaDoClick);
        return this;
    }
    public DetaljnaPretragaPage selectGodinaDo(){
        clickButton(selectGodina2020);
        return this;
    }
    public DetaljnaPretragaPage clickBrojVrata(){
        clickButton(brojVrataClick);
        return this;
    }
    public DetaljnaPretragaPage selectBrojVrata(){
        clickButton(selectVrata45);
        return this;
    }
    public DetaljnaPretragaPage pretrazi(){
        clickButton(pretrazi);
        return this;
    }









}
