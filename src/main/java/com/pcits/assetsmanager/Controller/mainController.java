package com.pcits.assetsmanager.Controller;

import com.pcits.assetsmanager.Model.userDetails;
import com.pcits.assetsmanager.repo.mongoDBRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "/usersDetails")
public class mainController {
    @Autowired
    private mongoDBRepo userRepo;

    @PostMapping("/")
    public ResponseEntity<?> addUser(userDetails users) {
        userDetails saved = this.userRepo.save(users);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/")
    public ResponseEntity<?> getUser() {
        return ResponseEntity.ok(this.userRepo.findAll());
    }
}
