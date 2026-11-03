//zadanie 4
package restOfPackages;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExamResults {
    private int[] points;

    public ExamResults(int[] points) {
        this.points = Arrays.copyOf(points, points.length);
    }

    public int[] getPoints() {
        return Arrays.copyOf(this.points, this.points.length);
    }
}
