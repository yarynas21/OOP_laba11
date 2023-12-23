package apps.ucu.edu.ua.taskfirst;

import java.util.List;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder
public class User {
    public enum Gender {
        MALE,
        FEMALE
    }

    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular
    private List<Integer> grades;
}