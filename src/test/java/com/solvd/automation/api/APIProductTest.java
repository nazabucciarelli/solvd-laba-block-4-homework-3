package com.solvd.automation.api;

import com.solvd.automation.api.products.DeleteProductById;
import com.solvd.automation.api.products.GetProductById;
import com.solvd.automation.api.products.PostProduct;
import com.solvd.automation.api.products.PutProductById;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;

public class APIProductTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "nazareno")
    public void getProductByIdTest() {
        GetProductById getProductById = new GetProductById();
        getProductById.setId(20L);
        getProductById.callAPIExpectSuccess();
        getProductById.validateResponseAgainstSchema("api/products/_get/rs.schema");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void postProductTest() {
        PostProduct postProduct = new PostProduct();
        postProduct.setProperties("api/products/product.properties");
        postProduct.callAPIExpectSuccess();
        postProduct.validateResponseAgainstSchema("api/products/_post/rs.schema");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void deleteProductTest() {
        DeleteProductById deleteProductById = new DeleteProductById();
        deleteProductById.setId(90L);
        deleteProductById.callAPIExpectSuccess();
        deleteProductById.validateResponseAgainstSchema("api/products/_delete/rs.schema");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void putProductByIdTest() {
        PutProductById putProductById = new PutProductById();
        putProductById.setId(2L);
        putProductById.setProperties("api/products/product.properties");
        putProductById.callAPIExpectSuccess();
        putProductById.validateResponseAgainstSchema("api/products/_put/rs.schema");
    }
}
