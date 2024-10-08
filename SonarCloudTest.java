public class SonarCloudTest {
    
    // Variável não utilizada (issue de variáveis não utilizadas)
    private String unusedVariable;

    public static void main(String[] args) {
        SonarCloudTest test = new SonarCloudTest();
        
        // Exemplo de código duplicado (issue de duplicação)
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello SonarCloud!");
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello SonarCloud Again!");
        }
        
        // Complexidade ciclomática alta (muitos ramos de decisão)
        test.complexMethod(5);
    }

    public void complexMethod(int num) {
        if (num == 1) {
            System.out.println("Number is 1");
        } else if (num == 2) {
            System.out.println("Number is 2");
        } else if (num == 3) {
            System.out.println("Number is 3");
        } else if (num == 4) {
            System.out.println("Number is 4");
        } else if (num == 5) {
            System.out.println("Number is 5");
        } else {
            System.out.println("Number is greater than 5");
        }
    }
}
