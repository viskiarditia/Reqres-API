package step_definitions.GET;

import Utils.Constant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;

public class getStepdef {

    //GET LIST USER
    @Given("User Set Paramater API reqres get LIST USERS")
    public void userSetParamaterAPIReqresGetLISTUSERS() {
        SerenityRest.given().get(Constant.getListUser);
    }

    @And("Validate get LIST USERS json schema")
    public void validateGetLISTUSERSJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/getListUser.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }

    @Given("User Set Paramater API reqres get SINGLE USER")
    public void userSetParamaterAPIReqresGetSINGLEUSER() {
        SerenityRest.given().get(Constant.getSingleUser);
    }


    @And("Validate get SINGLE USER json schema")
    public void validateGetSINGLEUSERJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/getSingleUser.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }

    @Given("User Set Paramater API reqres get SINGLE USER NOT FOUND")
    public void userSetParamaterAPIReqresGetSINGLEUSERNOTFOUND() {
        SerenityRest.given().get(Constant.getSingleUserNotFound);
    }

    @And("Validate get SINGLE USER NOT FOUND json schema")
    public void validateGetSINGLEUSERNOTFOUNDJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/getSingleUserNotFound.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }

    @Given("User Set Paramater API reqres get LIST RESOURCE")
    public void userSetParamaterAPIReqresGetLISTRESOURCE() {
        SerenityRest.given().get(Constant.getListUserResource);
    }


    @And("Validate get LIST RESOURCE json schema")
    public void validateGetLISTRESOURCEJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/getSingleUserNotFound.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }

    @Given("User Set Paramater API reqres get SINGLE RESOURCE")
    public void userSetParamaterAPIReqresGetSINGLERESOURCE() {
        SerenityRest.given().get(Constant.getSingleResource);
    }

    @And("Validate get SINGLE RESOURCE json schema")
    public void validateGetSINGLERESOURCEJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/getSingleResource.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }

    @Given("User Set Paramater API reqres get SINGLE RESOURCE NOT FOUND")
    public void userSetParamaterAPIReqresGetSINGLERESOURCENOTFOUND() {
        SerenityRest.given().get(Constant.getSingleResourceNotFound);
    }

    @And("Validate get SINGLE RESOURCE NOT FOUND json schema")
    public void validateGetSINGLERESOURCENOTFOUNDJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/getSingleResourceNotFound.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }

    @Given("User Set Paramater API reqres get DELAYED RESPONSE")
    public void userSetParamaterAPIReqresGetDELAYEDRESPONSE() {
        SerenityRest.given().get(Constant.getDelayedResponse);
    }

    @And("Validate get DELAYED RESPONSE json schema")
    public void validateGetDELAYEDRESPONSEJsonSchema() {
        File jsonSchemaValidator = new File(Constant.JSON_REQ_SCHEMA + "/getDelayedResponse.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaValidator));
    }
}
