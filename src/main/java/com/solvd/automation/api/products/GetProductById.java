package com.solvd.automation.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(methodType = HttpMethodType.GET, url = "${config.api_url}/products/${id}")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductById extends AbstractApiMethodV2 {

    public GetProductById() {
    }

    public void setId(Long id) {
        replaceUrlPlaceholder("id", String.valueOf(id));
    }

}
