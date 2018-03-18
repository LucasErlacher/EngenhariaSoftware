public class Teste {
    public static void main(String[] args){

        CalculadoraRomano calculadora = new CalculadoraRomano();

        String[] num_romanos = new String[10];
        num_romanos[0] = "MC";
        num_romanos[1] = "IX";
        num_romanos[2] = "LX";
        num_romanos[3] = "MMMD";
        num_romanos[4] = "DCCC";
        num_romanos[5] = "CM";
        num_romanos[6] = "MXXIV";
        num_romanos[7] = "DCXIX";
        num_romanos[8] = "MCCCLXXXIII";
        num_romanos[9] = "MCMXLI";

        for (String numero:num_romanos) {
            System.out.println(numero + " -> " + calculadora.converteRomano(numero));
        }
    }
}
