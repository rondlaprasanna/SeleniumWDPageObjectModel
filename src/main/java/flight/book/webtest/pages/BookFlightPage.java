package flight.book.webtest.pages;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by RondlaP on 1/08/2017.
 */
@DefaultUrl("http://newtours.demoaut.com/mercurywelcome.php")

public class BookFlightPage extends PageObject {

    @FindBy(name = "userName")
    WebElement Username;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(name = "login")
    WebElement LoginBtn;

    public void userLogsIn(String username, String password) {
        Username.sendKeys(username);
        Password.sendKeys(password);
        LoginBtn.click();
    }
}
