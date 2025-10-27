package com.learnSpringBoot.rest.webservices.restful_web_services.socialMedia;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class UserDaoService {
    // TODO
    // Replace the static lists with JPA/Hibernate/H2

    private static final List<User> usersList = new ArrayList<>();

    static {
        usersList.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        usersList.add(new User(2, "Eve", LocalDate.now().minusYears(25)));
        usersList.add(new User(3, "Jim", LocalDate.now().minusYears(20)));
    }

    public List<User> getAllUsers() {
        return usersList;
    }

    public User getUserById(Integer userId) {
       return usersList.stream()
               .filter(u -> Objects.equals(u.getId(), userId))
               .findFirst()
               .orElse(null);

    }
}
