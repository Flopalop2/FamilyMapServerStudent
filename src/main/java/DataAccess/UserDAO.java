package DataAccess;

import Model.User;

import java.sql.Connection;

/**
 * Provides methods for accessing Users table in database
 */
public class UserDAO {
    private final Connection conn;

    /**
     * constructor that sets current connection
     * @param conn
     */
    public UserDAO(Connection conn)
    {
        this.conn = conn;
    }

    /**
     * inserts User into db table
     * @param toInsert User to insert to table
     * @return boolean stating if succeeded
     */
    public boolean insertUser(User toInsert) {
        return false;
    }

    /**
     * returns array of all Users in db table
     * @return array of Users
     */
    public User[] retrieveInfo() {
        return null;
    }

    /**
     * finds User in database
     * @param userID to be found
     * @return found token or null
     * @throws DataAccessException
     */
    public User find(String userID) throws DataAccessException {
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
