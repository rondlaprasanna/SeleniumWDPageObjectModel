package flight.book.webtest;

import net.thucydides.jbehave.ThucydidesJUnitStories;

public class MultipleStories extends ThucydidesJUnitStories {
    public MultipleStories() {
        System.setProperty("thucydides.browser.width","1000");
    }
}
