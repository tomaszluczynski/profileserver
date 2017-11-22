package biz.hexworx.profileserver.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserTest {

    public User user;

    @Before
    public void executedBeforeEach() {
        user = new User(1, "mateusz", "krupa");
    }

    @Test
    public void getId() throws Exception {
        assertEquals(user.getId(), 1);
    }

    @Test
    public void getName() throws Exception {
        assertEquals(user.getName(), "mateusz");
    }

    @Test
    public void getPassword() throws Exception {
        assertEquals(user.getPassword(), "krupa");
    }

}