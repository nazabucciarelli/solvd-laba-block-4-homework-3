package com.solvd.automation.api.carts;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.api_url}/carts/${id}", methodType = HttpMethodType.DELETE)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeleteCartById extends AbstractApiMethodV2 {

    public DeleteCartById() {

    }

    public void setId(Long id) {
        replaceUrlPlaceholder("id", String.valueOf(id));
    }

}
