package MethodChainExample2;

public class HomePage {

    public HomePage sendNotification()
    {
        System.out.println("Notification sent !!");
        return this;

    }
    public HomePage SendMessage()
    {
        System.out.println("Message sent!!");
        return this;
    }
}
