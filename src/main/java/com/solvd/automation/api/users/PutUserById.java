package com.solvd.automation.api.users;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.api_url}/users/${id}", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/users/_put/rq.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutUserById extends AbstractApiMethodV2 {

    public PutUserById() {

    }

    public void setId(Long id) {
        replaceUrlPlaceholder("id", String.valueOf(id));
    }

}
