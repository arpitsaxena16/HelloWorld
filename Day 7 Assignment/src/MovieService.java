/**
 * Created by katkhedd on 7/26/2017.
 */
public class MovieService {

    public static void watch(User user) throws AgeOutOfRangeException {

        if (user.age <= 0) {
            throw new AgeOutOfRangeException("Age is Invalid");
        }

        if (user.age < 10) {
            throw new AgeOutOfRangeException("Age is below 10");
        }

        if (user.age < 20) {
            throw new AgeOutOfRangeException("Age is below 20");
        }
        System.out.println("You can watch movie");

    }

    public static void buy(User user,double price) throws PriceOutOfRangeException, LessRatingException, InvalidPriceException {


        if (price <= 0) {

            throw new  InvalidPriceException("Price is invalid");

        }
        if (price < 2000) {
            throw new PriceOutOfRangeException("Price is below 2000");
        }

        if (user.rating < 3) {
            throw new LessRatingException("Rating is below 3");
        }
        System.out.println("You can buy a ticket");
    }
}
