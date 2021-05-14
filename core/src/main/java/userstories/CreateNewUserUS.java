package userstories;

import domain.User;
import ports.driven.CryptPasswordPort;
import ports.driven.UserRepositoryPort;
import ports.driver.CreateNewUserPort;

public class CreateNewUserUS implements CreateNewUserPort {

    private UserRepositoryPort userRepositoryPort;
    private CryptPasswordPort cryptPasswordPort;

    public CreateNewUserUS(UserRepositoryPort userRepositoryPort, CryptPasswordPort cryptPasswordPort) {
        this.userRepositoryPort = userRepositoryPort;
        this.cryptPasswordPort = cryptPasswordPort;
    }

    @Override
    public User execute(User user) {
        var encodePassword = cryptPasswordPort.encodePassword(user.getPassword());
        user.setPassword(encodePassword);
        var userSaved = userRepositoryPort.save(user);
        return userSaved;
    }
}
