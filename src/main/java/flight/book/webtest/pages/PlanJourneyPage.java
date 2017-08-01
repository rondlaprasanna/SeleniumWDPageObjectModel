package flight.book.webtest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.yecht.Data;

import java.util.List;


/**
 * Created by RondlaP on 1/08/2017.
 */

public class PlanJourneyPage extends PageObject {

    @FindBy(name = "fromPort")
    WebElement fromPort;

    @FindBy(name = "toPort")
    WebElement toPort;

    @FindBy(name = "findFlights")
    WebElement findFlights;

    @FindBy(name = "reserveFlights")
    WebElement continueBtn;

    @FindBy(name = "passFirst0")
    WebElement firstNameField;

    @FindBy(name = "passLast0")
    WebElement lastNameField;

    @FindBy(name = "creditnumber")
    WebElement creditCardNumberField;

    @FindBy(name = "ticketLess")
    WebElement checkTicketLess;

    @FindBy(name = "buyFlights")
    WebElement securePurchaseBtn;

    public void plan_journey(String journeyType, String depart, String arrive, String classType) {

        selectTripTypeRadioButton(journeyType);
        new Select(fromPort).selectByVisibleText(depart);
        new Select(toPort).selectByVisibleText(arrive);
        selectServiceTypeRadioButton(classType);
        findFlights.click();
        continueBtn.click();

    }


    public void selectTripTypeRadioButton(String journeyType) {
        List<WebElement> tripTypeRadioButton = getDriver().findElements(By.name("tripType"));
        // int size = tripTypeRadioButton.size();

        for (int i = 0; i < tripTypeRadioButton.size(); i++) {
            if (tripTypeRadioButton.equals(journeyType)) {
                tripTypeRadioButton.get(i).click();
            }
        }
    }

    public void selectServiceTypeRadioButton(String classType) {

        List<WebElement> serviceTyperadioButton = getDriver().findElements(By.name("servClass"));
        //  int Isize = serviceTyperadioButton.size();
        for (int i = 0; i < serviceTyperadioButton.size(); i++) {
            if (serviceTyperadioButton.equals(classType)) {
                serviceTyperadioButton.get(i).click();
            }
        }
    }

    public void provide_personal_card_details(String firstName, String lastName, String creditCardNumber) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        creditCardNumberField.sendKeys(creditCardNumber);
        checkTicketLess.click();
        securePurchaseBtn.click();
    }
}