package com.APIMysql.Controller;

import com.APIMysql.Model.UserModel;
import com.APIMysql.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path = "/{id}")
    public ResponseEntity<UserModel> FindUser(@PathVariable("id") Integer id) {

        return userRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());


    }
    @PostMapping()
    public UserModel save(@RequestBody UserModel user){
        return userRepository.save(user);
    }
}
