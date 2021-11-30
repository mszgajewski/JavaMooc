package MessagingService;


import java.util.ArrayList;

public class MessagingService {

    ArrayList<Message> listOfMessages;

    public MessagingService() {
        listOfMessages = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            listOfMessages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.listOfMessages;
    }

}
