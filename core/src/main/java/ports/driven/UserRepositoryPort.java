package ports.driven;

import domain.User;
import java.util.List;

public interface UserRepositoryPort {
    User save(User user);
    List<User> findAll();
}
