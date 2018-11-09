package org.mvnsearch.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * person controller
 *
 * @author linux_china
 */
@RestController
@RequestMapping("/person")
@Api(value = "PersonRestAPI", description = "Person RestAPI", tags = "person")
public class PersonController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name) {
        return "hi " + name;
    }

    @GetMapping("/show")
    @ApiOperation(value = "personDetail", tags = {"show", "10%"}, notes = "10%")
    public String show() {
        return "detail ";
    }
}
