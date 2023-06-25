import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

// PO: dziedziczenie - extends
public class PageSetup {

    // typy danych w Java: proste i zlozone (obiektowe)
    String projectLocation = System.getProperty("user.dir");
    ChromeDriver driver;

    // biblioteka JUnit: alternatywa to biblioteka TestNG
    // zwracanie z funkcji: void nie zwraca nic

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
    }


    @AfterEach
    public void teardown() {
        // roznica driver.close() a driver.quit()
        driver.close();
    }
}
