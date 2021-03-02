package DataAccess;

import Model.Event;
import Model.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {
    private Database db;
    private Person bestPerson;
    private Person altPerson;
    private PersonDAO pDao;

    @BeforeEach
    void setUp() throws DataAccessException {
        //here we can set up any classes or variables we will need for the rest of our tests
        //lets create a new database
        db = new Database();
        //and a new event with random data
        bestPerson = new Person("testPerson", "useruser", "Luke", "Skywalker", "m", "Vader", "Padme", null);

        altPerson = new Person(null, "useruser", "Luke", "Skywalker", "m", "Vader", "Padme", "unknown");
        //Here, we'll open the connection in preparation for the test case to use it
        Connection conn = db.getConnection();
        //Let's clear the database as well so any lingering data doesn't affect our tests
        db.clearTables();
        //Then we pass that connection to the EventDAO so it can access the database
        pDao = new PersonDAO(conn);
    }

    @AfterEach
    void tearDown() throws DataAccessException {
        db.closeConnection(false);
    }

    @Test
    void insertPersonPass() {
        //if insert returns boolean?
        try { //add try to eventdaotest
            pDao.insertPerson(bestPerson);

            Person compareTest = pDao.find(bestPerson.getPersonID());

            assertNotNull(compareTest);

            assertEquals(bestPerson, compareTest);
            assertNotEquals(altPerson, compareTest);
        }
        catch (DataAccessException e) { //this should maybe be Exception?
            fail(e.getMessage());
        }

    }
    //maybe combine into one test?
    @Test
    void insertPersonFail() throws DataAccessException{
        assertThrows(NullPointerException.class, () -> pDao.insertPerson(null));

        assertThrows(DataAccessException.class, () -> pDao.insertPerson(altPerson));

        assertDoesNotThrow(() -> pDao.insertPerson(bestPerson));
        assertThrows(DataAccessException.class, ()-> pDao.insertPerson(bestPerson));
    }

    @Test
    void retrieveFamily() {
    }

    @Test
    void retrieveInfo() {
    }

    @Test
    void findPass() { //find test uses insert test and vice versa
        try {
            pDao.insertPerson(bestPerson);

            Person compareTest = pDao.find(bestPerson.getPersonID());

            assertNotNull(compareTest);

            assertEquals(bestPerson, compareTest);
            assertNotEquals(altPerson, compareTest);
            assertEquals(null, pDao.find(null));
        }
        catch (Exception e) { //this should maybe be Exception?
            fail(e.getMessage());
        }
    }

    @Test
    void findFail() throws DataAccessException{
        pDao.insertPerson(bestPerson);
        assertThrows(DataAccessException.class, ()-> pDao.insertPerson(bestPerson));
        assertEquals(null, pDao.find(null));
        // I really got nothing for fail here, unless the table is literally removed the code won't throw DataAccess with find
    }

    @Test
    void clearTableTest() {
        assertDoesNotThrow(() -> pDao.clearTable()); //whats the -> and why does is handle exceptions
    }
}