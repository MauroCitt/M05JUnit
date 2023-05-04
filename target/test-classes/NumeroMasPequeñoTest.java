import org.junit.Test;
import static org.junit.Assert.*;

public class NumeroMasPequeñoTest {

    @Test
    public NumeroMasPequeñoTest() {
        NumeroMasPequeño calculo = new NumeroMasPequeño();

        double[] numeros = {1, 2, 3, 0.5, 4, 5};
        double correcto = 0.5;
        double res = calculo.buscarElMasPequeño(numeros);
        assertEquals(correcto, res, 0.1);
    }

}
