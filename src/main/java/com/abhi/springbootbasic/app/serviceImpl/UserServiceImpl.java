package com.abhi.springbootbasic.app.serviceImpl;

import com.abhi.springbootbasic.app.entity.User;
import com.abhi.springbootbasic.app.repository.UserRepository;
import com.abhi.springbootbasic.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(
            UserRepository userRepository
    ){
        this.userRepository = userRepository;
    }
    @Override
    public List<User> findByEmailAddressAndLastname(String emailAddress, String lastname) {
        return userRepository.findByEmailAddressAndLastname(emailAddress, lastname);
    }

    @Override
    public List<User> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname) {
        return userRepository.findDistinctPeopleByLastnameOrFirstname(lastname, lastname);
    }

    @Override
    public List<User> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname) {
        return userRepository.findPeopleDistinctByLastnameOrFirstname(lastname, lastname);
    }

    @Override
    public List<User> findByLastnameIgnoreCase(String lastname) {
        return userRepository.findByLastnameIgnoreCase(lastname);
    }

    @Override
    public List<User> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname) {
        return userRepository.findByLastnameAndFirstnameAllIgnoreCase(lastname, firstname);
    }

    @Override
    public List<User> findByLastnameOrderByFirstnameAsc(String lastname) {
        return userRepository.findByLastnameOrderByFirstnameAsc(lastname);
    }

    @Override
    public List<User> findByLastnameOrderByFirstnameDesc(String lastname) {
        return userRepository.findByLastnameOrderByFirstnameDesc(lastname);
    }

    @Override
    public List<User> findByLastname(String lastname) {
        return userRepository.findByLastname(lastname);
    }

    @Override
    public List<User> readByLastname(String lastname) {
        return userRepository.readByLastname(lastname);
    }

    @Override
    public List<User> getByLastname(String lastname) {
        return userRepository.getByLastname(lastname);
    }

    @Override
    public List<User> queryByLastname(String lastname) {
        return userRepository.queryByLastname(lastname);
    }

    @Override
    public List<User> searchByLastname(String lastname) {
        return userRepository.searchByLastname(lastname);
    }

    @Override
    public List<User> streamByLastname(String lastname) {
        return userRepository.streamByLastname(lastname);
    }
}
