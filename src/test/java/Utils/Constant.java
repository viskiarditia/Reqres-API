package Utils;

public class Constant {
    public static final String URL = "https://reqres.in";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REQ_BODY = DIR+"/src/test/resources/JSON/JSONReqBody/";
    public static final String JSON_REQ_SCHEMA = DIR+"/src/test/resources/JSON/JSONSchemaValidator/";

    //Initial Variable API stepdefs

    //GET
    public static final String getListUser = URL+"/api/users?page=2";
    public static final String getSingleUser = URL+"/api/users/2";
    public static final String getSingleUserNotFound = URL+"/api/users/23";
    public static final String getListUserResource = URL+"/api/unknown";
    public static final String getSingleResource = URL+"/api/unknown/2";
    public static final String getSingleResourceNotFound = URL+"/api/unknown/23";
    public static final String getDelayedResponse = URL+"/api/users?delay=3";

    //DELETE
    public static final String delete = URL+"/api/users/2";

    //UPDATE
    public static final String update = URL+"/api/users?page=2";

    //POST
    public static final String postCreate = URL+"/api/users";
    public static final String postRegister = URL+"/api/register";
    public static final String postLogin = URL+"/api/login";

    //PUT
    public static final String putUpdate = URL+"/api/users/2";

}