package org.mvnsearch.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.mvnsearch.swagger.domain.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Size;
import java.util.Date;


/**
 * user controller
 *
 * @author linux_china
 */
@RestController
@RequestMapping(value = "/user")
@Api(value = "UserRestAPI", description = "User RestAPI", tags = "user")
public class UserController {

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "getUserInfo", nickname = "getUserInfo", tags = "show")
    public User show(@ApiParam(value = "User ID") @PathVariable(name = "id") Integer id, HttpServletRequest request) {
        User user = new User();
        user.setId(id);
        user.setName("jacky");
        user.setEmail("linux_china@hotmail.com");
        user.setCreatedAt(new Date());
        return user;
    }

    @RequestMapping(path = "/nick/{nick}", method = RequestMethod.GET)
    @ApiOperation(value = "GetUserInfoByNick", nickname = "getUserInfoByNick", tags = "show")
    public User showByNick(@ApiParam(value = "User Nick") @PathVariable(name = "nick") @Size(max = 100) String nick, HttpServletRequest request) {
        User user = new User();
        user.setId(1);
        user.setName(nick);
        user.setEmail("linux_china@hotmail.com");
        user.setCreatedAt(new Date());
        return user;
    }

    @PostMapping(path = "/save")
    @ApiOperation(value = "save user")
    public User save(@RequestBody User user, HttpServletRequest request) {
        user.setId(1);
        return user;
    }
}
