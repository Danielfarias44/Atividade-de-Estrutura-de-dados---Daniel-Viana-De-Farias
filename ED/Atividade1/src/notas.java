public class notas {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.2, 6.8};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        
        System.out.printf("Média das notas: %.2f", media);
    }
}