package com.solvd.automation.api.carts;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.api_url}/carts/${id}", methodType = HttpMethodType.PUT)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@RequestTemplatePath(path = "api/carts/_put/rq.json")
public class PutCartById extends AbstractApiMethodV2 {

    public PutCartById() {

    }

    public void setId(Long id) {
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}
