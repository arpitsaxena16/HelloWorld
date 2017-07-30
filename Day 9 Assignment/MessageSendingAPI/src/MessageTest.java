/**
 * Created by katkhedd on 7/30/2017.
 * Design a message sending API using functional programming approach
 introduced in Java 8. And design it to be flexible enough so that
 user/developers will supply the API behaviour according to thier
 requirement i.e. (sms,email,whatsapp,jms) while sending message.

 */
public class MessageTest {

        public static void main(String[] args) {
            MessengerService.sendMessage("Sam","Pooja","Sms","Hi Dear",(String from,String to,String communicateThrough, String message )->{
                System.out.printf("%s sent %s message to  %s through %s \n",from,message,to,communicateThrough);
            });
            MessengerService.sendMessage("Sayali","Pooja","Email","Hello Dear",(String from,String to,String communicateThrough, String message )->{
                System.out.printf("%s sent %s message to  %s through %s \n",from,message,to,communicateThrough);
            });

            MessengerService.sendMessage("Pooja","Sayali","Whatsapp","Hi Dear",(String from,String to,String communicateThrough, String message )->{
                System.out.printf("%s sent %s message to  %s through %s \n",from,message,to,communicateThrough);
            });

            MessengerService.sendMessage("Sam","Sayali","JSM","Hi, how are you?",(String from,String to,String communicateThrough, String message )->{
                System.out.printf("%s sent %s message to  %s through %s \n",from,message,to,communicateThrough);
            });


        }


}
