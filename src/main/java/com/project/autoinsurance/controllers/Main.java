package com.project.autoinsurance.controllers;

import com.project.autoinsurance.Services.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Main {

    @Autowired
    PolicyService policyService;

    @GetMapping("/")
    public String index(){
        return "index.jsp";
    }
}
