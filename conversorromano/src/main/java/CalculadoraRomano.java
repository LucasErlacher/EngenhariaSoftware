import java.util.HashMap;

public class CalculadoraRomano {

    private static HashMap<String, Integer> mapaRomano = new HashMap<String, Integer>();

    public CalculadoraRomano(){
        mapaRomano.put("I",1);
        mapaRomano.put("V",5);
        mapaRomano.put("X",10);
        mapaRomano.put("L",50);
        mapaRomano.put("C",100);
        mapaRomano.put("D",500);
        mapaRomano.put("M",1000);
    }
    public static int converteRomano(String numRomano){

        //Tamanho do número romano
        int tamanhoNumRomano = numRomano.length();

        //Variáveis para efetuar operação de soma ou subtração
        int valor_letra1 = mapaRomano.get("" + numRomano.charAt(tamanhoNumRomano-1));
        int valor_letra2;

        //Resultado final
        int somatorio = valor_letra1;

        if(tamanhoNumRomano > 1){

            //Contador contará a partir da penúltima posição da string
            for(int contador = tamanhoNumRomano-2; contador >= 0; contador--) {
                valor_letra2 = mapaRomano.get("" + numRomano.charAt(contador));

                if(valor_letra2 >= valor_letra1) somatorio += valor_letra2;
                else somatorio -= valor_letra2;

                valor_letra1 = valor_letra2;
            }

        }

        return somatorio;
    }

}
