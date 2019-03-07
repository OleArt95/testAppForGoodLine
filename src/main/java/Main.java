import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String URL_FOR_DIGITAL_CITY = "http://цг.рф";
    private static final String PATH_TO_CHROME_DRIVER = ".\\selen\\chromedriver.exe";

    public static void main(String[] args) {

        System.setProperty(WEBDRIVER_CHROME_DRIVER, PATH_TO_CHROME_DRIVER);
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get(URL_FOR_DIGITAL_CITY);

    }
}
