package Test;

import com.company.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void TailorTest(){
        double x = 0;
        double e = Math.pow(10, -3);


        double expected = (Main.tailorFunc(x,e));
        double actual = (Main.tailorActualFunc(x));

        x = -0.5;
        e = Math.pow(10, -5);
        expected = (Main.tailorFunc(x,e));
        actual = (Main.tailorActualFunc(x));
        assertEquals(expected, actual, e);

        x = 0.1;
        e = Math.pow(10, -10);
        expected = (Main.tailorFunc(x,e));
        actual = (Main.tailorActualFunc(x));
        assertEquals(expected, actual, e);

        x = 0.8;
        e = Math.pow(10, -12);
        expected = (Main.tailorFunc(x,e));
        actual = (Main.tailorActualFunc(x));
        assertEquals(expected, actual, e);
    }
}