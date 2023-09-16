package step_definitions;

import Utils.Constant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;

public class postStepDef {
    @Given("User Set Paramater API reqres Post CREATE")
    public void userSetParamaterAPIReqresPostCREATE() {
        new File(Constant.JSON_REQ_BODY+"postCreate.json");
        SerenityRest.given().get(Constant.postCreate);
    }

    @And("Validate Post CREATE json schema")
    public void validatePostCREATEJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/postCreate.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }

    @Given("User Set Paramater API reqres Post REGISTER - SUCCESSFUL")
    public void userSetParamaterAPIReqresPostREGISTERSUCCESSFUL() {
        new File(Constant.JSON_REQ_BODY+"postRegister.json");
        SerenityRest.given().get(Constant.postRegister);
    }

    @And("Validate Post REGISTER - SUCCESSFUL json schema")
    public void validatePostREGISTERSUCCESSFULJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/postRegister.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }

    @Given("User Set Paramater API reqres Post REGISTER - UNSUCCESSFUL")
    public void userSetParamaterAPIReqresPostREGISTERUNSUCCESSFUL() {
        new File(Constant.JSON_REQ_BODY+"postRegisterUnsuccessful.json");
        SerenityRest.given().get(Constant.postRegister);
    }

    @And("Validate Post REGISTER - UNSUCCESSFUL json schema")
    public void validatePostREGISTERUNSUCCESSFULJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/postRegisterUnsuccessfull.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }

    @Given("User Set Paramater API reqres Post LOGIN - SUCCESSFUL")
    public void userSetParamaterAPIReqresPostLOGINSUCCESSFUL() {
        new File(Constant.JSON_REQ_BODY+"postLogin.json");
        SerenityRest.given().get(Constant.postLogin);
    }

    @And("Validate Post LOGIN - SUCCESSFUL json schema")
    public void validatePostLOGINSUCCESSFULJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/postLogin.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }

    @Given("User Set Paramater API reqres Post LOGIN - UNSUCCESSFUL")
    public void userSetParamaterAPIReqresPostLOGINUNSUCCESSFUL() {
        new File(Constant.JSON_REQ_BODY+"postLogin.json");
        SerenityRest.given().get(Constant.postLogin);
    }

    @And("Validate Post LOGIN - UNSUCCESSFUL json schema")
    public void validatePostLOGINUNSUCCESSFULJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/postLoginUnsuccessful.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }
}
