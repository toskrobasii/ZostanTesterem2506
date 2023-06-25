import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

// klasy / interfejs / enum / klasa abstrakcyjna / adnotacja
// modyfikatory dostepu (hermetyzacja / enkapsulacja): public / private / package-private / protected
public class UltimateQATest extends PageSetup {


    @Test
    public void testOne() {
        WebElement button = driver.findElementById("idExample");
        button.click();

        WebElement text = driver.findElementByClassName("entry-title");
        Assertions.assertEquals("Button success", text.getText());
    }


}
