package Request;

/**
 * saves values in request
 */
public class RegisterRequest {
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String gender;

    /**
     * constructor sets values to null
     */
    public RegisterRequest() {
        this.userName = null;
        this.password = null;
        this.email = null;
        this.firstName = null;
        this.lastName = null;
        this.gender = null;
    }

    /**
     * constructor sets values in request
     * @param userNameID
     * @param userPassword
     * @param userEmail
     * @param userFirstName
     * @param userLastName
     * @param userGender
     */
    public RegisterRequest(String userNameID, String userPassword, String userEmail, String userFirstName, String userLastName, String userGender) {
        this.userName = userNameID;
        this.password = userPassword;
        this.email = userEmail;
        this.firstName = userFirstName;
        this.lastName = userLastName;
        this.gender = userGender;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
