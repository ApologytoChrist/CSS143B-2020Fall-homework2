package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        if (numOfDaysPastDue <= 0 ) {
           return 0;
        }
        else if (numOfDaysPastDue >= 5) {
            return 2 * numOfDaysPastDue * lateFeePerDayInDollar;
        } else {
            return numOfDaysPastDue * lateFeePerDayInDollar;
        }
    }
}
