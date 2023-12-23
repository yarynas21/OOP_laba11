package taskfirst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import apps.ucu.edu.ua.taskfirst.User;
import apps.ucu.edu.ua.taskfirst.User.Gender;

import java.util.Arrays;

public class UserTest {
    private static final String NAME = "Yaryna";
    private static final int AGE = 18;
    private static final int GRADEONE = 90;
    private static final int GRADETWO = 91;
    private static final int GRADETHREE = 99;
    private static final int GRADEFOUR = 100;

    private User user;

    @BeforeEach
    public void init() {
        user = User.builder().name(NAME)
                                    .age(AGE)
                                    .grade(GRADEONE)
                                    .grade(GRADETWO)
                                    .grades(Arrays.asList(GRADETHREE,
                                     GRADEFOUR))
                                    .gender(Gender.FEMALE).build();
    }

    @Test
    public void testUser() {
        Assertions.assertEquals(user.toString(),
                "User(name=Yaryna, age=18, "
                + "gender=FEMALE, weight=0.0, height=0.0, "
                + "grades=[90, 91, 99, 100])");
    }
}