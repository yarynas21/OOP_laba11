package apps.ucu.edu.ua.tasksecond;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    private static String API_KEY = "bc71e700058bacc0185a873b8d9ad7d3";
    private static String API_SECRET_KEY = "462dca10c3016f1bdc7f96f56c79e2be";

    public static void sendMail(MailInfo mailInfo) throws MailjetException, 
            MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        String text = mailInfo.generate();

        client = new MailjetClient(API_KEY, API_SECRET_KEY, 
        new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "savkiv.pn@ucu.edu.ua")
                                        .put("Name", "Yaryna"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", 
                                                "savkiv.pn@ucu.edu.ua")
                                                .put("Name", "Yaryna")))
                                .put(Emailv31.Message.SUBJECT,
                                "Greetings from Mailjet.")
                                .put(Emailv31.Message.TEXTPART, text)
                                .put(Emailv31.Message.HTMLPART, 
                                        "<h3>Dear passenger 1, welcome "
                                        + "to <a href='https://www."
                                        + "mailjet.com/'>"
                                        + "Mailjet</a>!</h3><br />May the "
                                        + "delivery force be with you!")
                                .put(Emailv31.Message.CUSTOMID, 
                                "AppGettingStartedTest")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }

    public static String getApiKey() {
        return API_KEY;
    }

    public static String getApiSecretKey() {
        return API_SECRET_KEY;
    }
}
