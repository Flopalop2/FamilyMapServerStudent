package DataAccess;

import Model.AuthToken;
import Model.Person;
import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Provides methods for accessing Persons table in database
 */
public class PersonDAO {
    private final Connection conn;

    /**
     * constructor that sets current connection
     * @param conn
     */
    public PersonDAO(Connection conn)
    {
        this.conn = conn;
    }

    /**
     * inserts Person into db table
     * @param toInsert token to insert to table
     * @return boolean stating if succeeded
     */
    public void insertPerson(Person toInsert) throws  DataAccessException {
        String sql = "INSERT INTO Persons (personID, associatedUser, firstname, lastname, " +
                "gender, fatherID, motherID, spouseID) VALUES(?,?,?,?,?,?,?,?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            //Using the statements built-in set(type) functions we can pick the question mark we want
            //to fill in and give it a proper value. The first argument corresponds to the first
            //question mark found in our sql String
            stmt.setString(1, toInsert.getPersonID());
            stmt.setString(2, toInsert.getAssociatedUser());
            stmt.setString(3, toInsert.getFirstName());
            stmt.setString(4, toInsert.getLastName());
            stmt.setString(5, toInsert.getGender());
            stmt.setString(6, toInsert.getFatherID());
            stmt.setString(7, toInsert.getMotherID());
            stmt.setString(8, toInsert.getSpouseID());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DataAccessException("Error encountered while inserting into the database");
        }
    }

    /**
     * returns array of all family members of current user /person
     * @return array of persons
     */
    public Person[] retrieveFamily(AuthToken authToken) {
        return null;
    }

    /**
     * returns array of all persons in db table
     * @return array of persons
     */
    public Person[] retrieveInfo() {
        return null;
    }

    /**
     * finds person in database
     * @param personID to be found
     * @return found Person or null
     * @throws DataAccessException
     */
    public Person find(String personID) throws DataAccessException {
        Person person;
        ResultSet rs = null;
        String sql = "SELECT * FROM Persons WHERE personID = ?;";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, personID);
            rs = stmt.executeQuery();
            if (rs.next()) {
                person = new Person(rs.getString("personID"), rs.getString("associatedUser"),
                        rs.getString("firstName"), rs.getString("lastname"), rs.getString("gender"),
                        rs.getString("fatherID"), rs.getString("motherID"), rs.getString("spouseID"));
                return person;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while finding person");
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
        String sql = "DELETE from Persons";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DataAccessException("Error encountered while clearing the database");
        }

    }
}
