package Test;

import com.company.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void TailorTest(){
        double x = 0;
        double e = Math.pow(10, -3);

        String expected = Main.NumberFormat(Main.TailorFunc(x,e));
        String actual = Main.NumberFormat(Main.TailorActualFunc(x));
        assertEquals(expected, actual);

        x = -0.5;
        e = Math.pow(10, -5);
        expected = Main.NumberFormat(Main.TailorFunc(x,e));
        actual = Main.NumberFormat(Main.TailorActualFunc(x));

        x = 0.1;
        e = Math.pow(10, -10);
        expected = Main.NumberFormat(Main.TailorFunc(x,e));
        actual = Main.NumberFormat(Main.TailorActualFunc(x));

        x = 0.8;
        e = Math.pow(10, -12);
        expected = Main.NumberFormat(Main.TailorFunc(x,e));
        actual = Main.NumberFormat(Main.TailorActualFunc(x));
        assertEquals(expected, actual);
    }
}