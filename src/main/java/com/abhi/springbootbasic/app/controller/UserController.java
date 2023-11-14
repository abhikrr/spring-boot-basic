package com.abhi.springbootbasic.app.controller;

import com.abhi.springbootbasic.app.entity.User;
import com.abhi.springbootbasic.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(
            UserService userService
    ){
        this.userService = userService;
    }

    @GetMapping("/users/findByEmailAddressAndLastname/{emailAddress}/{lastname}")
    public List<User> findByEmailAddressAndLastname(@PathVariable String emailAddress, @PathVariable String lastName){

        return userService.findByEmailAddressAndLastname(emailAddress, lastName);
    }

    @GetMapping("/users/findDistinctPeopleByLastnameOrFirstname/{firstName}/{lastname}")
    public List<User> findDistinctPeopleByLastnameOrFirstname(@PathVariable String lastname, @PathVariable String firstname) {
        return userService.findDistinctPeopleByLastnameOrFirstname(lastname, lastname);
    }

    @GetMapping("/users/findPeopleDistinctByLastnameOrFirstname/{firstName}/{lastname}")
    public List<User> findPeopleDistinctByLastnameOrFirstname(@PathVariable String lastname, @PathVariable String firstname) {
        return userService.findPeopleDistinctByLastnameOrFirstname(lastname, lastname);
    }

    @GetMapping("/users/findByLastnameIgnoreCase/{lastname}")
    public List<User> findByLastnameIgnoreCase(@PathVariable String lastname) {
        return userService.findByLastnameIgnoreCase(lastname);
    }

    @GetMapping("/users/findByLastnameAndFirstnameAllIgnoreCase/{firstName}/{lastname}")
    public List<User> findByLastnameAndFirstnameAllIgnoreCase(@PathVariable String lastname, @PathVariable String firstname) {
        return userService.findByLastnameAndFirstnameAllIgnoreCase(lastname, firstname);
    }

    @GetMapping("/users/findByLastnameOrderByFirstnameAsc/{lastname}")
    public List<User> findByLastnameOrderByFirstnameAsc(@PathVariable String lastname) {
        return userService.findByLastnameOrderByFirstnameAsc(lastname);
    }

    @GetMapping("/users/findByLastnameOrderByFirstnameDesc/{lastname}")
    public List<User> findByLastnameOrderByFirstnameDesc(@PathVariable String lastname) {
        return userService.findByLastnameOrderByFirstnameDesc(lastname);
    }

    @GetMapping("/users/findByLastname/{lastname}")
    public List<User> findByLastname(@PathVariable String lastname) {
        return userService.findByLastname(lastname);
    }

    @GetMapping("/users/readByLastname/{lastname}")
    public List<User> readByLastname(@PathVariable String lastname) {
        return userService.readByLastname(lastname);
    }

    @GetMapping("/users/getByLastname/{lastname}")
    public List<User> getByLastname(@PathVariable String lastname) {
        return userService.getByLastname(lastname);
    }

    @GetMapping("/users/queryByLastname/{lastname}")
    public List<User> queryByLastname(@PathVariable String lastname) {
        return userService.queryByLastname(lastname);
    }

    @GetMapping("/users/searchByLastname/{lastname}")
    public List<User> searchByLastname(@PathVariable String lastname) {
        return userService.searchByLastname(lastname);
    }


    @GetMapping("/users/streamByLastname/{lastname}")
    public List<User> streamByLastname(@PathVariable String lastname) {
        return userService.streamByLastname(lastname);
    }

}
