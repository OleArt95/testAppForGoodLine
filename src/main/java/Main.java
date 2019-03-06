import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Артюхов Олег\\IdeaProjects\\testAppForGoodLine\\selen\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://цг.рф");

    }
}
