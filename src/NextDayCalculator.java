public class NextDayCalculator {

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        int nextDay = dayTest+1;
        String result = nextDay+"/"+monthTest+"/"+yearTest;
        return result;
    }
}
