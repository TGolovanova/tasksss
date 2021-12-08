import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TrainTest {

    @DataProvider
    public Object[][] forTests() {
        return new Object[][]{
                {new int[]{1, 4, 10, 10, 4, 9, 4}, 4, new int[]{1,10,10,9}},
                {new int[]{1, 4, 10, 10, 4, 9, 4}, 10, new int[]{1,4,4,9,4}},
                {new int[]{1, 4, 1, 1, 44, 99, 24}, 1, new int[]{4,44,99,24}},
                {new int[]{14, 47, 105, 170, 47, 94, 400}, 47, new int[]{14,105,170,94, 400}}
        };
    }

    @Test(dataProvider = "forTests")
    public static void deleteOrNot(int[] one, int two, int[] three) {

        Assert.assertEquals(new trainTask().deleteInt(one, two), Arrays.toString(three));
    }

}
