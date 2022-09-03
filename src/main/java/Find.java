import java.util.List;

public class Find {
    public static Double findMatching(List<Double> list, Double lowerLimit, Double upperLimit) throws Exception {
        for (Double item : list) {
            if (item >= lowerLimit && item <= upperLimit) {
                return item;
            }
        }
        throw new Exception("Žádný prvek nesplňuje kritéria!");
    }
}