import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    final static int[] arr = {14, 16, 19, 32, 32, 32, 56, 69, 72};

    @Test
    public void TestBynarySearch()throws Exception {
        int newBook = 32;
        final int expectedArr = 3;

        Assertions.assertEquals(expectedArr,Main.bynarySearch(arr,newBook));
    }

    @Test
    public void TestBynarySearchZero() throws MyException {
        int newBook = -3;
        try{
            Main.bynarySearch(arr,newBook);
        }catch (Exception exception){
            System.out.println("Wrong number");
        }
    }
}
