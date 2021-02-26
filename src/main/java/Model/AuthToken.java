package Model;

import java.util.Objects;

/**
 * model for Authorization token class
 */
public class AuthToken {
    private String authToken;
    private String associatedUser;

    /**
     * empty constructor
     */
    public AuthToken(){

    }

    /**
     * constructor for associated user
     * @param associatedUser
     */
    public AuthToken(String associatedUser) {
        this.associatedUser = associatedUser;
    }

    /**
     * constructor for token and user
     * @param authToken
     * @param associatedUser
     */
    public AuthToken(String authToken, String associatedUser) {
        this.authToken = authToken;
        this.associatedUser = associatedUser;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getAssociatedUser() {
        return associatedUser;
    }

    public void setAssociatedUser(String associatedUser) {
        this.associatedUser = associatedUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthToken authToken1 = (AuthToken) o;
        return Objects.equals(authToken, authToken1.authToken) && Objects.equals(associatedUser, authToken1.associatedUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authToken, associatedUser);
    }

    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (o == null || getClass() != o.getClass()) return false;
    //    AuthToken authToken1 = (AuthToken) o;
    //    return authToken.equals(authToken1.authToken) && associatedUser.equals(authToken1.associatedUser);
    //}

    //@Override
    //public int hashCode() {
    //    return Objects.hash(authToken, associatedUser);
    //}
}
