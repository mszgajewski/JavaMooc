package MessagingService;

import java.util.Objects;

public class Message {
    private String sender;
    private String text;

    public Message(String sender, String text){
        this.sender = sender;
        this.text = text;

    }
    public String getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    public String toString(){
        return this.sender + ": " + this.text;
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (object == null){
            return false;
        }
        if (getClass() != object.getClass()){
            return false;
        }
        final Message content = (Message) object;
        if (!Objects.equals(this.sender,content.sender)){
            return false;
        }
        if (!Objects.equals(this.text, content.text)){
            return false;
        }
        return true;
    }
}