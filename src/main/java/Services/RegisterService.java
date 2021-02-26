package Services;

import Request.RegisterRequest;
import Result.RegisterResult;

/**
 * Creates a new user account,
 * generates 4 generations of ancestor data for the new user,
 * logs the user in, and returns an auth token.
 */
public class RegisterService {

    /**
     * null constructor
     */
    public RegisterService() {
        //RegisterResult register = new RegisterResult(null);
    }

    /**
     * creates new user, generates data for user, logs them in and returns auth token
     * @param request
     * @return RegisterResult containing authtoken and success
     */
    public RegisterResult register(RegisterRequest request) {
        return new RegisterResult(null);
    }
}
