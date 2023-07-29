package com.example.pokemonapi;

import com.example.pokemonapi.User;
import com.example.pokemonapi.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

   /* @GetMapping("/users")
    public void getUsers() {
        User[] users = userService.getUsers();
        for (User user : users) {
            System.out.println("ID: " + user.getId());
            System.out.println("Name: " + user.getName());
            System.out.println("Username: " + user.getUsername());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Address: " + user.getAddress().getStreet() + ", " +
                    user.getAddress().getSuite() + ", " + user.getAddress().getCity() + ", " +
                    user.getAddress().getZipcode());
            System.out.println("Geo Location: Lat: " + user.getAddress().getGeo().getLat() +
                    ", Lng: " + user.getAddress().getGeo().getLng());
            System.out.println("Phone: " + user.getPhone());
            System.out.println("Website: " + user.getWebsite());
            System.out.println("Company: " + user.getCompany().getName() + " - " +
                    user.getCompany().getCatchPhrase() + " - " + user.getCompany().getBs());
            System.out.println();
        }
    }*/

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getUsers();
        for (User user : users) {
            System.out.println("Name: " + user.getName());
            System.out.println("Address: " + user.getAddress().getCity());
        }
        return ResponseEntity.ok(users);
    }
}
