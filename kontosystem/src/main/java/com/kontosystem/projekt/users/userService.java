package com.kontosystem.projekt.users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    public List < user > getUser() {
        return List.of(new user
                (1 , "Kontoprojekt" ,13, "hello@kontoprojekt.com", "hellose")

        );

    }
    }
