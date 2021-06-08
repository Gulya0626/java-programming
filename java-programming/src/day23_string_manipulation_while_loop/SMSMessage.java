package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        // indexOf will find index numbers of the special characters: [] <> {}
        //substring, indexOf
        String message = "Sender: [Nadir] From Number<+1(222)333-4444> " +
                "Message:{Hello, lets code some java}";

        int start = message.indexOf("[");
        int end = message.indexOf("]");
        message.substring(start, end);
        System.out.println(message.substring(start+1, end));
        String sender = message.substring(start+1, end);
        System.out.println("sender = " + sender);

        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">") );
        System.out.println("mobile = " + mobile);

        String sentence1 = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("sentence1 = " + sentence1);
                
        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println("   Fikret   ".trim());

        if(sender.equals("Saim")) {
            System.out.println("Message from Saim about homework");
        }else{
            System.out.println("Someone else message");
        }

    }
}
