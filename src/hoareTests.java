import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class hoareTests {

    @Test
    void hoareTestA(){
        int [] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};

        int [] expected = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        App.hoare(arr); 
        int [] result = arr;

        assertArrayEquals(expected, result);

    }

    @Test
    void hoareTestB(){
        int [] emptyArr = {};

        int [] expected = {};
        App.hoare(emptyArr);
        int [] result = emptyArr;

        assertArrayEquals(expected, result);
    }

    @Test
    void hoareTestC(){
        int [] arr = {84, 3, 7, 1, 9, 6, 2, 5};

        int [] expected = {5, 3, 7, 1, 9, 6, 2, 84};
        App.hoare(arr);
        int [] result = arr;
    }
}
