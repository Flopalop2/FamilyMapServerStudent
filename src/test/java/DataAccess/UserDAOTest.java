package DataAccess;


import Model.Person;
import Model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {
    private Database db;
    private User bestUser;
    private User altUser;
    private UserDAO uDao;

    @BeforeEach
    void setUp() throws DataAccessException {
        db = new Database();
        //and a new event with random data
        bestUser = new User("xx_Slayer_xx", "notpassword", "email@email.gg", "Harry", "Potter", "m", "0001");

        altUser = new User(null, "notpassword", "email@email.gg", "Harry", "Potter", "m", "0001");
        //Here, we'll open the connection in preparation for the test case to use it
        Connection conn = db.getConnection();
        //Let's clear the database as well so any lingering data doesn't affect our tests
        db.clearTables();
        //Then we pass that connection to the EventDAO so it can access the database
        uDao = new UserDAO(conn);

    }

    @AfterEach
    void tearDown() throws DataAccessException{
        db.closeConnection(false);
    }

    @Test
    void insertUserPass() {
        try { //add try to eventdaotest
            uDao.insertUser(bestUser);

            User compareTest = uDao.find(bestUser.getUserName());

            assertNotNull(compareTest);

            assertEquals(bestUser, compareTest);
            assertNotEquals(altUser, compareTest);
        }
        catch (DataAccessException e) { //this should maybe be Exception?
            fail(e.getMessage());
        }
    }

    @Test
    void insertUserFail() {
        assertThrows(NullPointerException.class, () -> uDao.insertUser(null)); // shoulda really made them all just "insert" not insert user or person, woulda made this easier

        assertThrows(DataAccessException.class, () -> uDao.insertUser(altUser));

        assertDoesNotThrow(() -> uDao.insertUser(bestUser));
        assertThrows(DataAccessException.class, ()-> uDao.insertUser(bestUser));
    }

    @Test
    void retrieveInfo() {
    }

    @Test
    void findPass() { //find test uses insert test and vice versa
        try {
            uDao.insertUser(bestUser);

            User compareTest = uDao.find(bestUser.getUserName());

            assertNotNull(compareTest);

            assertEquals(bestUser, compareTest);
            assertNotEquals(altUser, compareTest);
            assertEquals(null, uDao.find(null));
        }
        catch (Exception e) { //this should maybe be Exception?
            fail(e.getMessage());
        }
    }

    @Test
    void findFail() throws DataAccessException{
        //uDao.insertUser(bestUser);
        //assertThrows(DataAccessException.class, ()-> uDao.insertUser(bestUser));
        //assertEquals(null, uDao.find(null));

        assertDoesNotThrow(() -> uDao.find(bestUser.getUserName()));
        // I really got nothing for fail here, unless the table is literally removed the code won't throw DataAccess with find
    }

    @Test
    void clearTable() {
        assertDoesNotThrow(() -> uDao.clearTable());
    }
}