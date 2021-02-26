package Services;

import Request.LoginRequest;
import Result.LoginResult;

/**
 * Logs in the user and returns an auth token.
 */
public class LoginService {

    /**
     * null constructor
     */
    public LoginService() {
        //LoginResult login = new LoginResult(null);
    }

    /**
     * Logs in the user and returns an auth token.
     * @param request
     * @return LoginResult result of login including authtoken
     */
    public LoginResult login(LoginRequest request) {
        return new LoginResult(null);
    }
}
