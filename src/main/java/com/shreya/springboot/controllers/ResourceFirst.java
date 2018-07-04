package com.shreya.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

public class ResourceFirst {
    @RestController
    @RequestMapping(path = "/v1/account")
    public class PrincipalResource {

        @RequestMapping(method = RequestMethod.POST)
        public Principal oauth(Principal principal) {
            return principal;

        }
    }
}
