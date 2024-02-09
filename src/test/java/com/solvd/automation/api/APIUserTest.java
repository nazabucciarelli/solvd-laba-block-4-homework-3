package com.solvd.automation.api;

import com.solvd.automation.api.users.DeleteUserById;
import com.solvd.automation.api.users.GetAllUser;
import com.solvd.automation.api.users.PostUser;
import com.solvd.automation.api.users.PutUserById;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;

public class APIUserTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "nazareno")
    public void getAllUserTest() {
        GetAllUser getAllUser = new GetAllUser();
        getAllUser.callAPIExpectSuccess();
        getAllUser.validateResponseAgainstSchema("api/users/_get/rs.schema");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void postUserTest() {
        PostUser postUser = new PostUser();
        postUser.setProperties("api/users/user.properties");
        postUser.callAPIExpectSuccess();
        postUser.validateResponseAgainstSchema("api/users/_post/rs.schema");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void putUserTest() {
        PutUserById putUserById = new PutUserById();
        putUserById.setId(10L);
        putUserById.setProperties("api/users/user.properties");
        putUserById.callAPIExpectSuccess();
        putUserById.validateResponseAgainstSchema("api/users/_put/rs.schema");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void deleteUserTest() {
        DeleteUserById deleteUserById = new DeleteUserById();
        deleteUserById.setId(5L);
        deleteUserById.callAPIExpectSuccess();
        deleteUserById.validateResponseAgainstSchema("api/users/_delete/rs.schema");
    }
}
