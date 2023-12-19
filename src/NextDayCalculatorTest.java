import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1/1/2018")
    public void testDay1Month1Year2018(){
//        chuan bi du lieu
        int dayTest=1;
        int monthTest=1;
        int yearTest=2018;
        String expected = "2/1/2018";
//        thuc goi ham can test
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
//        so sanh: ket qua thuc te voi ket qua mong muon
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("case 31/1/2018")
    public void testDay31Month1Year2018(){
        //        chuan bi du lieu
        int dayTest=31;
        int monthTest=1;
        int yearTest=2018;
        String expected = "1/2/2018";
//        thuc goi ham can test
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
//        so sanh: ket qua thuc te voi ket qua mong muon
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("case 30/4/2018")
    public void testDay30Month4Year2018(){
        //        chuan bi du lieu
        int dayTest=30;
        int monthTest=4;
        int yearTest=2018;
        String expected = "1/5/2018";
//        thuc goi ham can test
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
//        so sanh: ket qua thuc te voi ket qua mong muon
        assertEquals(result, expected);
    }

}