public class idade {
    public static void main(String[] args) {
        int[] idades = {15, 22, 17, 30, 19, 16, 25, 20, 18, 21};
        
        System.out.println("idades maiores que 18 anos:");
        
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 18) {
                System.out.println(idades[i] + " anos");
            }
        }
    }
}

