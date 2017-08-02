/**
 * Created by katkhedd on 7/26/2017.
 */
public class Cinema extends MovieService{
    public static void main(String[] args) {

        User user1 = new User(1, "Ram", 18,4);

        try{
            /**
            * Arpit's Comments:
            * Why should we extens the MoviService class? Is Cinema is of MovieService type?
            * There is no IS-A relation between both, hence it should be a simple object inside it and using which these methods should be called.
            * Please read about IS-A and HAS-A relationship in Java.
            */
            buy(user1,2500);
            watch(user1);

        }catch(AgeOutOfRangeException e){
            System.out.println(e.getMessage());
        }catch(InvalidPriceException e){
            System.out.println(e.getMessage());
        }catch(PriceOutOfRangeException e) {
            System.out.println(e.getMessage());
        }catch(LessRatingException e) {
            System.out.println(e.getMessage());
        }
    }
}

