package com.example.academicadvising.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomcatController
{
    @GetMapping(value="/")
    public String apache()
    {
        return "Hello Dylan, how are you?";
    }
}
