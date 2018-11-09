package org.mvnsearch.swagger.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Open API v3 specification
 *
 * @author linux_china
 */
@OpenAPIDefinition
@RequestMapping("/v3")
public class OpenApiV3Controller {

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    @Operation(description = "v3 hi", tags = {"v3"})
    public String hi() {
        return "hi";
    }
}
