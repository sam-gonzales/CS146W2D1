import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class lomutoTests {

    @Test
    void lomutoTestA(){
        int [] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};

        int [] expected = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67}; 
        App.lomuto(arr); 
        int [] result = arr;

        assertArrayEquals(expected, result);

    }

    @Test
    void lomutoTestB(){
        int [] emptyArr = {};

        int [] expected = {};
        App.lomuto(emptyArr);
        int [] result = emptyArr;

        assertArrayEquals(expected, result);
    }

    @Test
    void lomutoTestC(){
        int [] arr = {84, 3, 7, 1, 9, 6, 2, 5};

        int [] expected = {3, 1, 2, 5, 9, 6, 7, 84};
        App.lomuto(arr);
        int [] result = arr;

        assertArrayEquals(expected, result);
    }
}
