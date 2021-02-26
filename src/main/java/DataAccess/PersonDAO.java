package DataAccess;

import Model.Person;

import java.sql.Connection;

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
    public boolean insertPerson(Person toInsert) {
        return false;
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
