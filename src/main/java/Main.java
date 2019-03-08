import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    /**
     * Объявление 3 констант для обозначения драйвера, сайта "Цифровой город", относительного пути до драйвера
     **/
    private static WebDriver chromeDriver;
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String URL_FOR_DIGITAL_CITY = "http://цг.рф";
    private static final String PATH_TO_CHROME_DRIVER = ".\\selen\\chromedriver.exe";

    /**
     * Вызов 3 методов для нажатия 3 кнопок ("Городская доставка","Узнать больше" и "Узнать больше" в разделе
     * "Городская доставка") на сайте "цг.рф"
     **/
    public static void main(String[] args) {


        System.setProperty(WEBDRIVER_CHROME_DRIVER, PATH_TO_CHROME_DRIVER);
        chromeDriver = new ChromeDriver();
        chromeDriver.get(URL_FOR_DIGITAL_CITY);
        clickOnIconCityDelivery();
        clickOnLinkKnowMoreCityDelivery();
        clickOnLinkDigitalCityInfoBlockCityDelivery();

    }

    /**
     * Метод для нажатия на иконку "Городская доставка" на сайте "Цифровой город". Иконка найдена самостоятельно с
     * помощью CSS-селектора.
     */
    private static void clickOnIconCityDelivery() {
        WebElement iconCityDelivery = chromeDriver.findElement(By.cssSelector("[data-id=\"3\"] button.switcher__button"));
        iconCityDelivery.click();
    }

    /**
     * Метод для нажатия на кнопку "Узнать больше" на сайте "Цифровой город". Кнопка найдена с помощью CSS-селктора
     */
    private static void clickOnLinkKnowMoreCityDelivery() {
        WebElement linkContentMore = chromeDriver.findElement(By.cssSelector("[href=\"#food\"]"));
                linkContentMore.click();
    }

    /**
     * Метод для нажатия на кнопку "Узнать больше" на сайте "Цифровой город" в разделе "Городская доставка". Метод
     * релизован при помощи создания временной задержки для основного потока Thread.sleep()
     */
    private static void clickOnLinkDigitalCityInfoBlockCityDelivery() {
        WebElement linkContentMoreAboutExternalSite = chromeDriver.findElement(By.cssSelector("[href=\"https://dostavka.a42.ru/?utm_source=digitalcity\"]"));
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        linkContentMoreAboutExternalSite.click();

    }
}
