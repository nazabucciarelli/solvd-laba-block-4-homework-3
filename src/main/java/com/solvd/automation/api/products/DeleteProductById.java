package com.solvd.automation.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(methodType = HttpMethodType.DELETE, url = "${config.api_url}/products/${id}")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeleteProductById extends AbstractApiMethodV2 {

    public DeleteProductById() {
    }

    public void setId(Long id) {
        replaceUrlPlaceholder("id", String.valueOf(id));
    }

}
