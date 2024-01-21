package org.timely.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController {

    private final Logger log = LoggerFactory.getLogger(WebController.class);

    public WebController() {
        log.info("WebController called");
    }

    @GetMapping("admin")
    String getIndex() {
        return "admin";
    }

    @GetMapping("")
    String getHome() {
        return "index";
    }
}
