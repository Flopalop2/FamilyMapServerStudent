package DataAccess;


import Model.AuthToken;

import java.sql.Connection;

/**
 * Provides methods for accessing authorization tokens table in database
 */
public class AuthTokenDAO {
    private final Connection conn;

    /**
     * constructor that sets current connection
     * @param conn
     */
    public AuthTokenDAO(Connection conn)
    {
        this.conn = conn;
    }

    /**
     * inserts token into db table
     * @param toInsert token to insert to table
     * @return boolean stating if succeeded
     */
    public boolean insertToken(AuthToken toInsert) {
        return false;
    }

    /**
     * returns array of all authtokens in db table
     * @return array of authtokens
     */
    public AuthToken[] retrieveInfo() {
        return null;
    }

    /**
     * finds authtoken in database
     * @param authToken to be found
     * @return found token or null
     * @throws DataAccessException
     */
    public AuthToken find(String authToken) throws DataAccessException {
        return null;
    }

    /**
     * clears table in database
     * @return true if succeeded
     */
    public boolean clearTable() {
        return false;
    }
}
