package Result;

import Request.RegisterRequest;

/**
 * saves result of register request
 */
public class RegisterResult {
    private String authToken;
    private String userName;
    private String personID;
    private String result;

    /**
     * error message input
     * @param error
     */
    public RegisterResult(String error) {
        this.result = error;
    }

    /**
     * constructor sets token name and person id from input
     * @param authToken
     * @param userName
     * @param personID
     */
    public RegisterResult(String authToken, String userName, String personID) {
        this.authToken = authToken;
        this.userName = userName;
        this.personID = personID;
    }

    //public RegisterResult(RegisterRequest r) {
    //}


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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
