package Utils;

public class Constant {
    public static final String URL = "https://reqres.in";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REQ_BODY = DIR+"/src/test/resources/JSON/JSONReqBody/";
    public static final String JSON_REQ_SCHEMA = DIR+"/src/test/resources/JSON/JSONSchemaValidator/";

    //Initial Variable API stepdefs
    public static final String getListUser = URL+"/api/users?page=2";
    public static final String getSingleUser = URL+"/api/users/2";
    public static final String getSingleUserNotFound = URL+"/api/users/23";
    public static final String getListUserResource = URL+"/api/unknown";
    public static final String getSingleResource = URL+"/api/unknown/2";
    public static final String getSingleResourceNotFound = URL+"/api/unknown/23";
    public static final String getDelayedResponse = URL+"/api/users?delay=3";
}