package com.demo.micrometerspringboot.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class DemoController {

    @Timed(
            value = "demo request",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.35"}
    )
    @GetMapping("/demo")
    public String demo(){
        return "demo ..";
    }

    @Timed(
            value = "demo2 request",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @GetMapping("/demo2")
    public String demo2(){
        return "demo2 ..";
    }
}
