package apps.ucu.edu.ua.tasksecond;

import lombok.Getter;
import lombok.Setter;

public class Client {
    @Getter
    private int id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int age;
    @Getter
    @Setter
    private Gender sex;

    private static int count = 0;

    public Client(String name, Gender sex, int age) {
        id = ++count;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
