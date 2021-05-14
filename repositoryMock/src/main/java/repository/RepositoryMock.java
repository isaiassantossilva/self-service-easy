package repository;

import domain.User;
import ports.driven.UserRepositoryPort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class RepositoryMock implements UserRepositoryPort {

    private static final Map<String, User> users = new HashMap<>();

    @Override
    public User save(User user) {
        user.setId(UUID.randomUUID().toString());
        users.put(user.getId(), user);
        return users.get(user.getId());
    }

    @Override
    public List<User> findAll() {
        return users.values().stream().collect(Collectors.toList());
    }
}
