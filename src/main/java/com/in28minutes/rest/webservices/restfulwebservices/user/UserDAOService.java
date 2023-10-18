package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDAOService {
    // JPA/Hibernate > Database
    // UserDAOService > Static List

    private static int usersCount;
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(++usersCount, "Maria", LocalDate.now().minusYears(22)));
        users.add(new User(++usersCount, "King", LocalDate.now().minusYears(26)));
        users.add(new User(++usersCount, "Mira", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOneUser(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
