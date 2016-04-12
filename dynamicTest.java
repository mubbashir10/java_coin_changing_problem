//importing required packages
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

//greedyAlgorithm Test
public class dynamicTest{

    @Test
    public void sampleTest() {

        //making object
        CoinChanging cc = new CoinChanging();

        //testing
        int[] set = {1,5,10,25};
        assertEquals(4, cc.dynamicProgram(100,set));

    }
}