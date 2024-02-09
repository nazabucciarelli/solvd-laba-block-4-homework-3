package com.solvd.automation.api;

import com.solvd.automation.api.auth.GetAuthUser;
import com.solvd.automation.api.auth.PostLoginUser;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APIAuthTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "nazareno")
    public void loginGetTokenTest() {
        PostLoginUser postLoginUser = new PostLoginUser();
        postLoginUser.setProperties("api/auth/auth.properties");
        Response response = postLoginUser.callAPIExpectSuccess();
        postLoginUser.validateResponseAgainstSchema("api/auth/_post/rs.schema");

        String token = JsonPath.from(response.asString()).getString("token");
        getAuthUserTest(token);
    }

    @MethodOwner(owner = "nazareno")
    public void getAuthUserTest(String token) {
        GetAuthUser getAuthUser = new GetAuthUser(token);
        getAuthUser.callAPIExpectSuccess();
        getAuthUser.validateResponseAgainstSchema("api/auth/_get/rs.schema");
    }
}
