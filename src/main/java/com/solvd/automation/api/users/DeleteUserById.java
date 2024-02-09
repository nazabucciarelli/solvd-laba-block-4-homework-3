package com.solvd.automation.api.users;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.api_url}/users/${id}", methodType = HttpMethodType.DELETE)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeleteUserById extends AbstractApiMethodV2 {

    public DeleteUserById() {

    }

    public void setId(Long id) {
        replaceUrlPlaceholder("id", String.valueOf(id));
    }

}
