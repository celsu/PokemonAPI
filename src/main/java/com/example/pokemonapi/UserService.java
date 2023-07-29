package com.example.pokemonapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private final String API_URL = "https://jsonplaceholder.typicode.com/users";

   /* public User[] getUsers() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, User[].class);
    }*/

    public List<User> getUsers() {
        RestTemplate restTemplate = new RestTemplate();
        User[] users = restTemplate.getForObject(API_URL, User[].class);
        return Arrays.asList(users);
    }
}
