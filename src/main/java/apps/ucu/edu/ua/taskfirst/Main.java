package apps.ucu.edu.ua.taskfirst;

import java.util.Arrays;

public class Main {
    private static final String NAME = "Yaryna";
    private static final int AGE = 18;
    private static final int GRADEONE = 18;
    private static final int GRADETWO = 18;
    private static final int GRADETHREE = 18;
    private static final int GRADEFOUR = 18;
    public static void main(String[] args) {
        User user = Student.builder().name(NAME)
                                    .age(AGE)
                                    .grade(GRADEONE)
                                    .grade(GRADETWO)
                                    .grades(Arrays.asList(GRADETHREE, GRADEFOUR))
                                    .gender(Gender.FEMALE).build();
        System.out.println(user);
    }
}