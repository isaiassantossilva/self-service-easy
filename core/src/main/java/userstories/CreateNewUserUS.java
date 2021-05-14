package userstories;

import domain.User;
import ports.driven.UserRepositoryPort;
import ports.driver.CreateNewUserPort;

public class CreateNewUserUS implements CreateNewUserPort {

    private UserRepositoryPort userRepositoryPort;

    public CreateNewUserUS(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User execute(User user) {
        var userSaved = userRepositoryPort.save(user);
        return userSaved;
    }
}
