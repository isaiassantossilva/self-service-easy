package com.code.api.controller.user;

import com.code.api.controller.user.request.UserRequest;
import com.code.api.controller.user.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ports.driver.CreateNewUserPort;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private CreateNewUserPort createNewUserPort;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse create(@RequestBody UserRequest userRequest){
        var userSaved = createNewUserPort.execute(userRequest.toUser());
        return new UserResponse(userSaved);
    }

}
