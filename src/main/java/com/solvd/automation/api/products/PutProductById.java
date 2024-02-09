package com.solvd.automation.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(methodType = HttpMethodType.PUT, url = "${config.api_url}/products/${id}")
@RequestTemplatePath(path = "api/products/_put/rq.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutProductById extends AbstractApiMethodV2 {

    public PutProductById() {
    }

    public void setId(Long id) {
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}
