package apps.ucu.edu.ua.taskfirst;

import java.util.List;

import lombok.Singular;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Student extends User {
    @Singular("mark")
    private List<Integer> grades;
}
