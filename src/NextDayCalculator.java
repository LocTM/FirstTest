public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        int nextDay = dayTest+1;
        String result = nextDay+ CONCATENATION +monthTest+CONCATENATION+yearTest;
        return result;
    }
}
