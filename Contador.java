public class Contador {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Por favor, forneça dois números inteiros como argumentos.");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            if (num1 > num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = num1; i <= num2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.err.println("Os argumentos fornecidos não são números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }
}
