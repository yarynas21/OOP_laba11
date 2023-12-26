package apps.ucu.edu.ua.taskthird;

public class Launch {
    public static void main(String[] args) {
        MyImage img = new RealImage(
            "src/main/java/apps/" 
            + "ucu/edu/ua/taskthird"
            + "/education.jpg");
        img.display();
    }
}
