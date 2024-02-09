package com.solvd.automation.api;

import com.solvd.automation.api.carts.DeleteCartById;
import com.solvd.automation.api.carts.GetCartById;
import com.solvd.automation.api.carts.PostCart;
import com.solvd.automation.api.carts.PutCartById;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;

public class APICartTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "nazareno")
    public void getCartByIdTest() {
        GetCartById getCartById = new GetCartById();
        getCartById.setId(2L);
        getCartById.callAPIExpectSuccess();
        getCartById.validateResponseAgainstSchema("api/carts/_get/rs.schema");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void deleteCartByIdTest() {
        DeleteCartById deleteCartById = new DeleteCartById();
        deleteCartById.setId(3L);
        deleteCartById.callAPIExpectSuccess();
        deleteCartById.validateResponseAgainstSchema("api/carts/_delete/rs.schema");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void putCartByIdTest() {
        PutCartById putCartById = new PutCartById();
        putCartById.setId(10L);
        putCartById.setProperties("api/carts/cart.properties");
        putCartById.callAPIExpectSuccess();
        putCartById.validateResponseAgainstSchema("api/carts/_put/rs.schema");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void postCartTest() {
        PostCart postCart = new PostCart();
        postCart.setProperties("api/carts/cart.properties");
        postCart.callAPIExpectSuccess();
        postCart.validateResponseAgainstSchema("api/carts/_post/rs.schema");
    }
}
