package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingData.StandardData;

public class DeloviPage extends BasePageClass{

    private final String deloviURL = StandardData.DELOVI_URL;

    private final By markaVozilaClick = By.xpath("//div[@class='SumoSelect sumo_brand'][1]");
    private final By markaVozilaSelect = By.xpath ("//div[@class='SumoSelect sumo_brand open']//label[text()='Chrysler']");
    private final By modelVozilaClick = By.xpath("//div[@class='SumoSelect sumo_model']");
    private final By modelVozilaSelect = By.cssSelector(".SumoSelect.sumo_model  .options > li:nth-of-type(4) > label");
    private final By godisteVozilaClick = By.xpath("//div[@class='SumoSelect sumo_year']");
    private final By godisteVozilaSelect = By.xpath("//div[@class='SumoSelect sumo_year open']//label[text()='2006 god.']");
    private final By pretraziDelove = By.xpath("//button[@name='submit']");

    public DeloviPage (WebDriver driver) {super(driver);}

    public DeloviPage open(){
        openUrl(deloviURL);
        return this;
    }
    public DeloviPage clickMarka(){
        clickButton(markaVozilaClick);
        return this;
    }
    public DeloviPage selectMarka(){
        clickButton(markaVozilaSelect);
        return this;
    }
    public DeloviPage clickModel(){
        clickButton(modelVozilaClick);
        return this;
    }
    public DeloviPage selectModel(){
        clickButton(modelVozilaSelect);
        return this;
    }
    public DeloviPage clickGodiste(){
        clickButton(godisteVozilaClick);
        return this;
    }
    public DeloviPage selectGodiste(){
        clickButton(godisteVozilaSelect);
        return this;
    }
    public DeloviPage pretraziDelove(){
        clickButton(pretraziDelove);
        return this;
    }

}
