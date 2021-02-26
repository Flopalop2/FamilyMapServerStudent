package Result;

/**
 * result of login
 */
public class LoginResult {
    private String authToken;
    private String userName;
    private String personID;
    private String errorMessage;
    private boolean success;

    /**
     * constructor sets token, username and personid
     * @param authToken
     * @param userName
     * @param personID
     */
    public LoginResult(String authToken, String userName, String personID) {
        this.authToken = authToken;
        this.userName = userName;
        this.personID = personID;
    }

    /**
     * sets error message
     * @param errorMessage
     */
    public LoginResult(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
