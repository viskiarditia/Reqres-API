package step_definitions;

import Utils.Constant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;

public class updateStepDefs {
    @Given("User Set Paramater API reqres Patch UPDATE")
    public void userSetParamaterAPIReqresPatchUPDATE() {
        SerenityRest.given().get(Constant.update);
    }

    @And("Validate Post UPDATE json schema")
    public void validatePostUPDATEJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/patchUpdate.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }
}
