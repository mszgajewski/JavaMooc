package MessagingService;

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService(){
        this.messages = new ArrayList<>();
    }

    public void add(Message message){
        if(message.getText().length() <= 260) {
            messages.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return messages;
    }
}
