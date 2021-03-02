package DataAccess;

import Model.Event;
import Model.Person;
import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    public void insertUser(User toInsert) throws DataAccessException { //toInsert not null...
        //We can structure our string to be similar to a sql command, but if we insert question
        //marks we can change them later with help from the statement
        String sql = "INSERT INTO Users (username, password, email, firstname, lastname, " +
                "gender, personID) VALUES(?,?,?,?,?,?,?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            //Using the statements built-in set(type) functions we can pick the question mark we want
            //to fill in and give it a proper value. The first argument corresponds to the first
            //question mark found in our sql String
            stmt.setString(1, toInsert.getUserName());
            stmt.setString(2, toInsert.getPassword());
            stmt.setString(3, toInsert.getEmail());
            stmt.setString(4, toInsert.getFirstName());
            stmt.setString(5, toInsert.getLastName());
            stmt.setString(6, toInsert.getGender());
            stmt.setString(7, toInsert.getPersonID());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DataAccessException("Error encountered while inserting into the database");
        }
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
        User user;
        ResultSet rs = null;
        String sql = "SELECT * FROM Users WHERE username = ?;";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userID);
            rs = stmt.executeQuery();
            if (rs.next()) {
                user = new User(rs.getString("username"), rs.getString("password"),
                        rs.getString("email"), rs.getString("firstname"), rs.getString("lastname"),
                        rs.getString("gender"), rs.getString("personID"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while finding user");
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    //should throw exception here???
                }
            }

        }
        return null;
    }

    /**
     * clears table in database
     * @return true if succeeded
     */
    public void clearTable() throws DataAccessException{
        String sql = "DELETE from Users";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DataAccessException("Error encountered while clearing the database");
        }
    }
}
