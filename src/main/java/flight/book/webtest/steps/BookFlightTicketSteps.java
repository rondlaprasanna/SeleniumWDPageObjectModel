package flight.book.webtest.steps;

import flight.book.webtest.pages.BookFlightPage;
import flight.book.webtest.pages.PlanJourneyPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.yecht.Data;

/**
 * Created by RondlaP on 1/08/2017.
 */
public class BookFlightTicketSteps {
    @Managed
    WebDriver driver;

    @ManagedPages
    Pages pages;

    @Given("a user is on the flight booking application")
    public void open_flight_booking_application(){
        pages.get(BookFlightPage.class).open();
    }

    @Given("the user logs in with $username and $password")
    public void user_logs_in(String username,String password){
        pages.get(BookFlightPage.class).userLogsIn(username,password);
    }
    @When("user selects journey details $journeyType $depart $arrive $classType")
    public void plan_journey(String journeyType, String depart, String arrive, String classType){
        pages.get(PlanJourneyPage.class).plan_journey(journeyType,depart,arrive,classType);
    }
    @When("provide personal and card details $firstname $lastName $creditCardNumber")
    public void provide_personal_card_details(String firstName, String lastName, String creditCardNumber){
        pages.get(PlanJourneyPage.class).provide_personal_card_details(firstName,lastName,creditCardNumber);

    }
}
