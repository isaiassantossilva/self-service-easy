package ports.driver;

import domain.User;

public interface CreateNewUserPort {
    User execute(User user);
}
