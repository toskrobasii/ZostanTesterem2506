import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

// klasy / interfejs / enum / klasa abstrakcyjna / adnotacja
// modyfikatory dostepu (hermetyzacja / enkapsulacja): public / private / package-private / protected
public class UltimateQATest extends PageSetup {


    @Test
    public void testOne() {
        WebElement button = driver.findElementById("idExample");
        // sposoby nacisniecia na element: .click() / Actions .perform  / executor javascript
        button.click();

        WebElement text = driver.findElementByClassName("entry-title");
        Assertions.assertEquals("Button success", text.getText());
    }

    @Test
    public void testTwo() {

//        WebElement textField = driver.findElementById("");
//        textField.sendKeys("Tester");

    }

}
