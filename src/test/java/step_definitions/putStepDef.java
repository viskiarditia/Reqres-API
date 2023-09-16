package step_definitions;

import Utils.Constant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;

public class putStepDef {
    @Given("User Set Paramater API reqres Post UPDATE")
    public void userSetParamaterAPIReqresPostUPDATE() {
        new File(Constant.JSON_REQ_BODY+"putUpdate.json");
        SerenityRest.given().get(Constant.putUpdate);
    }

    @And("Validate Put UPDATE json schema")
    public void validatePutUPDATEJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/putUpdate.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }
}
