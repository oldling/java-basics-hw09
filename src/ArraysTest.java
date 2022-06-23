import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraysTest {

    /**
     * Test data for common array elements.
     *
     * @return test data array
     */
    @DataProvider(name = "ArrayUtil")
    public static Object[][] arrays() {
        return new Object[][]{
            {
                new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
                new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
                new String[]{"JAVA", "SQL"}
            },
            {
                new String[]{"here", "is", "some", "text", ".", "text"},
                new String[]{"some", "text", "above", "."},
                new String[]{"some", "text", "."}
            },
            {
                new String[]{"1", "2", "9", "4", "5", "6", "7", "8", "9"},
                new String[]{"5", "8", "7", "6", "9", "4"},
                new String[]{"4", "5", "6", "7", "8", "9"}
            },
            {
                new String[]{"all same", "all same", "all same", "all same", "all same", "all same", "all same"},
                new String[]{"all same", "all same", "all same", "all same", "all same", "all same", "all same"},
                new String[]{"all same"}
            }
        };
    }

    @Test(dataProvider = "ArrayUtil")
    public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

        assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
                "Common elements are not correct");
    }
}