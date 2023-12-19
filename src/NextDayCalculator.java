public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        if (dayTest==31){
            monthTest++;
            dayTest=1;
        }
        else {
            dayTest++;
        }

        String result = dayTest+ CONCATENATION +monthTest+CONCATENATION+yearTest;
        return result;
    }
}
