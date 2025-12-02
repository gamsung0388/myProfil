package com.my.profil.controller;

import com.my.profil.domain.SampleUser;
import com.my.profil.mapper.SampleUserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleUserController {

    private final SampleUserMapper mapper;

    public SampleUserController(SampleUserMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/api/sample-users")
    public List<SampleUser> getUsers() {
        return mapper.findAll();
    }
}
