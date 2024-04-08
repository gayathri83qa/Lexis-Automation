package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        // Code to execute before each scenario
        System.out.println("Before scenario: Setup");
    }

    @After
    public void teardown() {
        // Code to execute after each scenario
        System.out.println("After scenario: Teardown");
    }
}
