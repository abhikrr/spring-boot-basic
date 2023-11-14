package com.abhi.springbootbasic.app.repository;

import com.abhi.springbootbasic.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByEmailAddressAndLastname(String emailAddress, String lastname);

    List<User> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname);

    List<User> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname);

    List<User> findByLastnameIgnoreCase(String lastname);

    List<User> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname);

    List<User> findByLastnameOrderByFirstnameAsc(String lastname);

    List<User> findByLastnameOrderByFirstnameDesc(String lastname);

    List<User> findByLastname(String lastname);

    List<User> readByLastname(String lastname);

    List<User> getByLastname(String lastname);

    List<User> queryByLastname(String lastname);

    List<User> searchByLastname(String lastname);

    List<User> streamByLastname(String lastname);
}
