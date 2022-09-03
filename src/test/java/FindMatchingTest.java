import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindMatchingTest {

    @Test
    public void middle1Test() {
        List<Double> testList = List.of(10.0, 15.45, 5.811, 175.0);
        Double testResult = null;
        try {
            testResult = Find.findMatching(testList, 4.0, 9.3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(5.811, testResult);
    }

    @Test
    public void firstMatchingTest() {
        List<Double> testList = List.of(12.0, 8.126, 6.0);
        Double testResult = null;
        try {
            testResult = Find.findMatching(testList, 10.0, 12.6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(12.0, testResult);
    }

    @Test
    public void multipleMatchingTest() {
        List<Double> testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        Double testResult = null;
        try {
            testResult = Find.findMatching(testList, 8.0, 10.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(8.126, testResult);
    }

    @Test
    public void emptyTest() {
        List<Double> testList = new ArrayList<>();
        Assertions.assertThrows(Exception.class, () -> Find.findMatching(testList, 10.0, 12.0));
    }

    @Test
    public void notExistTest() {
        List<Double> testList = List.of(200.0, 300.0);
        Exception thrown = Assertions.assertThrows(Exception.class, () -> Find.findMatching(testList, 10.0, 12.0));
        Assertions.assertEquals("Žádný prvek nesplňuje kritéria!", thrown.getMessage());
    }
}