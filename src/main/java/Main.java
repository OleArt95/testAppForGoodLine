import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        //Задаем конфигурацию для драйвера
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Артюхов Олег\\IdeaProjects\\testAppForGoodLine\\selen\\chromedriver.exe");

        //создаем экземпляр класса
        WebDriver chromeDriver = new ChromeDriver();

        //открываем сайт в браузере
        chromeDriver.get("http://цг.рф");

        //задаем задержку для драйвера
        //chromeDriver.manage().timeouts().implicitlyWait( 60, TimeUnit.SECONDS);

        //перейти на другую страницу
//        chromeDriver.navigate().to("https://dostavka.a42.ru");

        //переход на предыдущую страницу
//        chromeDriver.navigate().back();

        //создаем окно максимальной ширины
        chromeDriver.manage().window().maximize();

        //задаем кастомный размер окна браузера
        //chromeDriver.manage().window().setSize(new Dimension(500, 500));
        //перезагрузка окна браузера
        //chromeDriver.navigate().refresh();

        //закрываем окно браузера
        //chromeDriver.quit();

        //Получаем и выводим на консоль заголовок сайта
       System.out.println("Заголовок сайта: " + chromeDriver.getTitle());
        //получаем и выводим на консоль адрес сайта
        System.out.println("Url сайта: " + chromeDriver.getCurrentUrl());

        //Пробуем получить по тексту содержимого
        WebElement linkDescriptionFromNav = chromeDriver.findElement(By.linkText("ОПИСАНИЕ"));
        System.out.println("Текст элемента: " + linkDescriptionFromNav.getText());

        WebElement linkDescriptionFromNavByClassName = chromeDriver.findElement(By.className("menu__link"));
        System.out.println("Текст элемента по имени класса: " + linkDescriptionFromNavByClassName.getText());


 //     body > div.header > div > div > nav > ul > li:nth-child(1) > a
        WebElement linkDescriptionFromNavByCssSelectorWithInspector = chromeDriver.findElement(By.cssSelector("body > div.header > div > div > nav > ul > li:nth-child(1) > a"));
        System.out.println("Текст элемента по css-селектору, полученному через инспектор: " + linkDescriptionFromNavByCssSelectorWithInspector.getText());

        WebElement linkDescriptionFromNavByCssSelector = chromeDriver.findElement(By.cssSelector("[href=\"#description\"]"));
        System.out.println("Текст элемента по css-селектору, составленному самостоятельно: " + linkDescriptionFromNavByCssSelector.getText());

        WebElement linkDescriptionFromNavByXpathWithInspector = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/nav/ul/li[1]/a"));
        System.out.println("Текст элемента по xpath-селектору, полученному через инспектор: " + linkDescriptionFromNavByXpathWithInspector.getText());

        WebElement linkDescriptionFromNavByXpath = chromeDriver.findElement(By.xpath("//a[@href=\"#description\"]"));
        System.out.println("Текст элемента по xpath-селектору, полученному самостоятельно: " + linkDescriptionFromNavByXpath.getText());

    //
    }
}
