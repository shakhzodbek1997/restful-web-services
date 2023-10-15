package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDAOServices {
    // JPA/Hibernate > Database
    // UserDAOService > Static List

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Maria", LocalDate.now().minusYears(22)));
        users.add(new User(2, "King", LocalDate.now().minusYears(26)));
        users.add(new User(3, "Mira", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

}
