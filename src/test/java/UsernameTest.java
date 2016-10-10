/**
 * Created by Phillip on 06/10/2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class UsernameTest {

    @Test
    public void testUsername() {
        String result;
        StudentInfo student1 = new StudentInfo("Mike", 21, "19/09/1995", "1061");
        result = "Mike" + 21 ;
        assertEquals(student1.getUsername(), result);
    }
}