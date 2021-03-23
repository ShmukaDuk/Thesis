package com.General_Skills.Main;

import com.General_Skills.Main.Users.User;
import com.General_Skills.Main.Users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller // This means that this class is a Controller
@RequestMapping(path="/main")  // This means URL's start with /main (after Application path)

@CrossOrigin(origins = "http:/127.0.0.1", allowedHeaders = "*", allowCredentials = "true")
public class MainController {
    @Autowired
    UserRepository userRepository;

    @CrossOrigin(origins = "http:/127.0.0.1", allowedHeaders = "*", allowCredentials = "true")
    @PostMapping(path = "/user/find/{username}")
    public @ResponseBody
    User getUser(@PathVariable String username) {
            User user = userRepository.findByUserName(username);
            return user;
    }
}
