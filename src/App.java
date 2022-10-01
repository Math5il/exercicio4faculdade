import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        float notaBimestre1 = 0.0f;
        float notaBimestre2 = 0.0f;
        float notaBimestre3 = 0.0f;
        float notaBimestre4 = 0.0f;
        float mediaBimestre = 0.0f;

        System.out.println("Digite a sua 1ª nota: ");
        notaBimestre1 = console.nextFloat();
        System.out.println("Digite a sua 2ª nota: ");
        notaBimestre2 = console.nextFloat();         
        System.out.println("Digite a sua 3ª nota: ");
        notaBimestre3 = console.nextFloat();         
        System.out.println("Digite a sua 4ª nota: ");
        notaBimestre4 = console.nextFloat();

        mediaBimestre = (notaBimestre1 + notaBimestre2 + notaBimestre3 + notaBimestre4)/4;

        System.out.println("Á sua média nesse bimestre foi: " + mediaBimestre);
    }
}
