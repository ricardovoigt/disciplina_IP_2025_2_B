import java.util.Scanner;

public class CalcFurbv2 {
    double numero1, numero2, resultado;
    Scanner sc = new Scanner(System.in);

    public CalcFurbv2() {
        System.out.println("Bem vindo a Calculadora");
        inicializar();
        finalizar();
    }

    private void finalizar() {
        System.out.println("Deseja realizar outra operação?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int opcao = sc.nextInt();
        if (opcao == 1){
            inicializar();
            finalizar();
        }else{
            System.out.println("Obrigado por usar a Calculadora!");
            sc.close();
        }
    }

    private void inicializar() {
        informarDoisNumeros();
        escolherOpcao();
        retornarResultado();
    }

    private void retornarResultado() {
        System.out.println("O resultado é: " + resultado);
    }

    private void escolherOpcao() {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                resultado = somar();
                break;
            case 2:
                resultado = subtrair();
                break;
            case 3:
                resultado = multiplicar();
                break;
            case 4:
                resultado = dividir();
                break;
            default:
                System.out.println("Opção inválida!");
                escolherOpcao();
                break;
        }
    }

    private double dividir() {
        if (numero2 > 0){
            return (numero1 / numero2);
        }else{
            return 0; //tratar divisão por zero
        }
    }

    private double multiplicar() {
        return (numero1 * numero2);
    }

    private double subtrair() {
        return (numero1 - numero2);
    }

    private double somar() {
        return (numero1 + numero2);
    }

    private void informarDoisNumeros() {
        System.out.println("Informe o primeiro numero");
        numero1 = sc.nextDouble();
        System.out.println("Informe o segundo numero");
        numero2 = sc.nextDouble();
    }

    public static void main(String[] args) {
        new CalcFurbv2();
    }
}
