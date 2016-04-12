//importing required packages
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

//greedyAlgorithm Test
public class greedyTest{

    @Test
    public void sampleTest() {

        //making object
        CoinChanging cc = new CoinChanging();

        //testing
        assertEquals(4, cc.greedyAlgorithm(100,0));

    }
}