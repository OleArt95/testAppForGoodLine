import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Main {
    //Объявление переменной для веб-драйвера
    private static WebDriver chromeDriver;

    //Объявление переменной для драйвера ожидания
    private static WebDriverWait waitDriver;

    //Объявление константы для вкладки "Городская доставка"
    private static final int TAB_CITY_DELIVERY = 1;

    //Объявление константы для драйвера
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";

    //Объявление константы  для сайта "Цифровой город"
    private static final String URL_FOR_DIGITAL_CITY = "http://цг.рф";

    //Объявление константы, которая обозначает относительный путь до chrome драйвера
    private static final String PATH_TO_CHROME_DRIVER = ".\\selen\\chromedriver.exe";

    public static void main(String[] args) {
        System.setProperty(WEBDRIVER_CHROME_DRIVER, PATH_TO_CHROME_DRIVER);

        chromeDriver = new ChromeDriver();
        chromeDriver.get(URL_FOR_DIGITAL_CITY);

        //Объявление переменной для драйвера ожидания
        waitDriver = new WebDriverWait(chromeDriver, 60);

        clickOnIconCityDelivery();
        clickOnLinkKnowMoreCityDelivery();
        clickOnLinkDigitalCityInfoBlockCityDelivery();
        clickOnCloseButtonOnModalWindowCityDelivery();
        clickOnButtonLentaCatalogCityDelivery();
    }

    /**
     * Метод для нажатия на иконку "Городская доставка" на сайте "Цифровой город".
     */
    private static void clickOnIconCityDelivery() {
        WebElement iconCityDelivery = chromeDriver.findElement(By.cssSelector("[data-id=\"3\"] button.switcher__button"));
        iconCityDelivery.click();
    }

    /**
     * Метод для нажатия на кнопку "Узнать больше" на сайте "Цифровой город".
     */
    private static void clickOnLinkKnowMoreCityDelivery() {
        WebElement linkContentMore = chromeDriver.findElement(By.cssSelector("[href=\"#food\"]"));
        linkContentMore.click();
    }

    /**
     * Метод для нажатия на кнопку "Узнать больше" на сайте "Цифровой город" в разделе "Городская доставка".
     */
    private static void clickOnLinkDigitalCityInfoBlockCityDelivery() {
        long timeToWait = 1000L;

        WebElement linkContentMoreAboutExternalSite = chromeDriver.findElement(By.cssSelector("[href=\"https://dostavka.a42.ru/?utm_source=digitalcity\"]"));

        sleepGeneralThread(timeToWait);

        linkContentMoreAboutExternalSite.click();
    }

    /**
     * Метод для нажатия на кнопку закрытия на модальном окне на сайте "Городская доставка"
     */
    private static void clickOnCloseButtonOnModalWindowCityDelivery() {
        long timeToWait = 5000L;

        switchToTabCityDelivery();

        WebElement closeButtonOnModalWindow = waitDriver.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class=\"sendpulse-prompt-close\"]")));

        sleepGeneralThread(timeToWait);

        closeButtonOnModalWindow.click();
    }

    private static void clickOnButtonLentaCatalogCityDelivery() {
        WebElement buttonLentaCatalog = chromeDriver.findElement(By.cssSelector("[href=\"/catalog/2\"] div.button"));
        buttonLentaCatalog.click();
    }

    /**
     * Вспомогательный метод для переключения на вкладку "Городская доставка" в основном окне браузера
     */
    private static void switchToTabCityDelivery(){
        ArrayList<String> tabs = new ArrayList<String>(chromeDriver.getWindowHandles());
        chromeDriver.switchTo().window(tabs.get(TAB_CITY_DELIVERY));
    }

    /**
     * Вспомогательный метод ожидания основного потока
     * @param millisecondsOfWait временная задержка
     */
    private static void sleepGeneralThread(long millisecondsOfWait){
        try {
            Thread.sleep(millisecondsOfWait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }
        //[class="search-bar__input"]
        //[class="search-bar__submit"]
    }

