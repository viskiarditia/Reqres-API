package step_definitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;

public class reqresStatusCode {
    // Status 200 OK
    @Then("Status Code Should be {int} OK")
    public void statusCodeShouldBeOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }

    // Status 204 No Content
    @Then("Status Code Should be {int} No_Content")
    public void statusCodeShouldBeNo_Content(int No_Content) {
        SerenityRest.then().statusCode(No_Content);
    }

    // Status 400 Bad_Request
    @Then("Status Code Should be {int} Bad_Request")
    public void statusCodeShouldBeBad_Request(int Bad_Request) {
        SerenityRest.then().statusCode(Bad_Request);
    }

    @Then("Status Code Should be {int} Not_Found")
    public void statusCodeShouldBeNot_Found(int Not_Found) {
        SerenityRest.then().statusCode(Not_Found);
    }

    @Then("Status Code Should be {int} Created")
    public void statusCodeShouldBeCreated(int Created) {
        SerenityRest.then().statusCode(Created);
    }
}
