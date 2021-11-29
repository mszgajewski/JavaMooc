package MessagingService;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Żaneta", "Kocham!");
        MessagingService mess = new MessagingService();

        System.out.println(mess.getMessages());

        System.out.println(message);
    }
}
