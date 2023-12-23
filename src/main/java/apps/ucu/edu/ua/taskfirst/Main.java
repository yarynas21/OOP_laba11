package apps.ucu.edu.ua.taskfirst;

import java.util.Arrays;

import apps.ucu.edu.ua.taskfirst.User.Gender;

public class Main {
    private static final String NAME = "Yaryna";
    private static final int AGE = 18;
    private static final int GRADEONE = 90;
    private static final int GRADETWO = 91;
    private static final int GRADETHREE = 99;
    private static final int GRADEFOUR = 100;
    public static void main(String[] args) {
        User user = Student.builder().name(NAME)
                                    .age(AGE)
                                    .grade(GRADEONE)
                                    .grade(GRADETWO)
                                    .grades(Arrays.asList(GRADETHREE,
                                     GRADEFOUR))
                                    .gender(Gender.FEMALE).build();
        System.out.println(user);
    }
}