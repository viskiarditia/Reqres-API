package step_definitions;

import Utils.Constant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;

public class deleteStepDef {
    @Given("User Set Paramater API reqres DELETE data")
    public void userSetParamaterAPIReqresDELETEData() {
        SerenityRest.given().get(Constant.delete);
    }

    @And("Validate DELETE data json schema")
    public void validateDELETEDataJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/getDelayedResponse.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }
}
