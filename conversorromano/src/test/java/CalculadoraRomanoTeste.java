import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraRomanoTeste {
    private CalculadoraRomano calculadora;

    @Before
    public void initializa() {
        calculadora = new CalculadoraRomano();
    }

    /*
    Exemplos de casos possíveis:

    I - 1
    II - 2
    IV - 4
    XLIV - 44
    MCCCIV - 1304
    */

    @Test
    public void converteRomanoI(){
        String numRomano = "I";
        int resultadoEsperado = 1;

        int resultadoCalculadora = CalculadoraRomano.converteRomano(numRomano);

        Assert.assertEquals(resultadoEsperado, resultadoCalculadora);
    }

    @Test
    public void converteRomanoV(){
        String numRomano = "V";
        int resultadoEsperado = 5;

        int resultadoCalculadora = CalculadoraRomano.converteRomano(numRomano);

        Assert.assertEquals(resultadoEsperado, resultadoCalculadora);
    }

    @Test
    public void converteRomanoII(){
        String numRomano = "II";
        int resultadoEsperado = 2;

        int resultadoCalculadora = CalculadoraRomano.converteRomano(numRomano);

        Assert.assertEquals(resultadoEsperado, resultadoCalculadora);
    }

    @Test
    public void converteRomanoIV(){
        String numRomano = "IV";
        int resultadoEsperado = 4;

        int resultadoCalculadora = CalculadoraRomano.converteRomano(numRomano);

        Assert.assertEquals(resultadoEsperado, resultadoCalculadora);
    }

    @Test
    public void converteRomanoXLIV(){
        String numRomano = "XLIV";
        int resultadoEsperado = 44;

        int resultadoCalculadora = CalculadoraRomano.converteRomano(numRomano);

        Assert.assertEquals(resultadoEsperado, resultadoCalculadora);
    }

    @Test
    public void converteRomanoMCCCIV(){
        String numRomano = "MCCCIV";
        int resultadoEsperado = 1304;

        int resultadoCalculadora = CalculadoraRomano.converteRomano(numRomano);

        Assert.assertEquals(resultadoEsperado, resultadoCalculadora);
    }

    @Test
    public void converteRomanoMIII(){
        String numRomano = "MIII";
        int resultadoEsperado = 1003;

        int resultadoCalculadora = CalculadoraRomano.converteRomano(numRomano);

        Assert.assertEquals(resultadoEsperado, resultadoCalculadora);
    }

}
