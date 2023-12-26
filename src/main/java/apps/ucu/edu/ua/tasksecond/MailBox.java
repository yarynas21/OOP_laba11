package apps.ucu.edu.ua.tasksecond;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public List<MailInfo> getInfos() {
        return new ArrayList<>(infos);
    }

    public void sendAll() throws MailjetSocketTimeoutException, 
    MailjetException {
        for (MailInfo info: infos) {
            MailSender.sendMail(info);
        }
    }
}
