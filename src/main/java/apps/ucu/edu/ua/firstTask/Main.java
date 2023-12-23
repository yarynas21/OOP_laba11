package apps.ucu.edu.ua.firstTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Yaryna")
                                    .age(18)
                                    .grade(99)
                                    .grade(100)
                                    .grades(Arrays.asList(80, 90))
                                    .gender(Gender.FEMALE).build();
        System.out.println(user);
    }
}