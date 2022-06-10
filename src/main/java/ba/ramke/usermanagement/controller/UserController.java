package ba.ramke.usermanagement.controller;

import ba.ramke.usermanagement.model.User;
import ba.ramke.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
//@CrossOrigin(origins = "http://178.62.253.105:3000/")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "User added!";
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAllUsers();
    }
}
