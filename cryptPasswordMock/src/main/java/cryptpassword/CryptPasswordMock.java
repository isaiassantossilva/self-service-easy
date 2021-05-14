package cryptpassword;

import ports.driven.CryptPasswordPort;

public class CryptPasswordMock implements CryptPasswordPort {
    @Override
    public String encodePassword(String raw) {
        return raw.toUpperCase();
    }
}
