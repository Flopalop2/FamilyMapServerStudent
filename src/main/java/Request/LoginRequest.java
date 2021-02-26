package Request;

/**
 * saves values in request
 */
public class LoginRequest {
    private String userName;
    private String password;

    /**
     * default constructor
     * sets null values
     */
    public LoginRequest() {
        this.userName = null;
        this.password = null;
    }

    /**
     * sets values in request
     * @param un username
     * @param pass password
     */
    public LoginRequest(String un, String pass) {
        this.userName = un;
        this.password = pass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
