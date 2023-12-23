package taskfirst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import apps.ucu.edu.ua.taskfirst.User;
import apps.ucu.edu.ua.taskfirst.User.Gender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class UserTest {
    private User user;
    private static final String NAME = "Yaryna";
    private static final int AGE = 18;
    private static final int GRADEONE = 18;
    private static final int GRADETWO = 18;
    private static final int GRADETHREE = 18;
    private static final int GRADEFOUR = 18;

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
        assertEquals(user.toString(),
                "User(name=Yaryna, age=18, gender=FEMALE, weight=0.0, height=0.0, grades=[18, 18, 18, 18])");
    }
}