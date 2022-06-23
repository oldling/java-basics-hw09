import java.util.HashSet;
import java.util.Set;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {

        Set<String> result = new HashSet<>();

        for (String base: array1) {
            for (String check: array2){
                if (base.equals(check)) {
                    result.add(base);
                }
            }
        }

        String[] resultArray = new String[result.size()];
        result.toArray(resultArray);

        return resultArray;
    }
}