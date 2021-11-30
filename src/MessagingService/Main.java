package MessagingService;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Żaneta", "Kocham!");
        Message ssage = new Message("Zaneta","<3");
        MessagingService mess = new MessagingService();

        mess.add(message);
        mess.add(ssage);

        System.out.println(mess.getMessages());
    }
}
