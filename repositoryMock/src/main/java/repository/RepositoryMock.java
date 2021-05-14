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
        try {
            var idField = user.getClass().getDeclaredField("id");
            idField.setAccessible(true);
            idField.set(user, UUID.randomUUID().toString());
            idField.setAccessible(false);
            users.put(user.getId(), user);
            var userSaved = users.get(user.getId());
            return userSaved;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<User> findAll() {
        return users.values().stream().collect(Collectors.toList());
    }
}
