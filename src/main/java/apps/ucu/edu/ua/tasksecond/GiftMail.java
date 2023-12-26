package apps.ucu.edu.ua.tasksecond;

public class GiftMail implements MailCode {
    private static final String TEMPLATE = "DISCOUNTS! %NAME receive "
    + "your discount right now";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}