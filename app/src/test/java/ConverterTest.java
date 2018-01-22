import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by SPillay on 2018/01/22.
 */
public class ConverterTest {
    @Test
    public void average() throws Exception
    {
        float firstDigit = 10;
        float secondDigit = 5;
        float output;
        double expected = 8.5;
        double delta = 0.1;


        Converter converter = new Converter();
         output = converter.average(10,5);
         assertEquals(expected, output, delta);
    }

}