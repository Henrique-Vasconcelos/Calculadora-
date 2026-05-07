package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        float numero1,numero2, resultado;
        String Operadores;
        String Continuar;
        Scanner entrada = new Scanner (System.in);
        
        do{
            System.out.println("Escolha qual operação quer fazer: (Adicao, Subitracao, Multiplicacao, Divisao): ");
        Operadores = entrada.nextLine();
        
        switch(Operadores){
            case "Adicao":
                System.out.println("Escreva os numeros que serão somados: ");
                numero1 = entrada.nextFloat();
                numero2 = entrada.nextFloat();
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
                
            case "Subitracao":
                System.out.println("Escrevea os numeros que serão subitraidos: ");
                numero1 = entrada.nextFloat();
                numero2 = entrada.nextFloat();
                resultado = numero1 - numero2;
                System.out.println(resultado);
                break;
                
            case "Multiplicacao":
                System.out.println("Escreva os numeros que serão multiplicados: ");
                numero1 = entrada.nextFloat();
                numero2 = entrada.nextFloat();
                resultado = numero1 * numero2;
                System.out.println(resultado);
                break;
                
            case "Divisao":
                System.out.println("Escreva os numeros que serão divididos: ");
                numero1 = entrada.nextFloat();
                numero2 = entrada.nextFloat();
                resultado = numero1 / numero2;
                System.out.println(resultado);
                break;
                
            default:
                System.out.println("Operação invalida");
                break;
        }
        entrada.nextLine();
        
            System.out.println("Deseja fazer uma nova conta? (Sim/Nao): ");
            Continuar = entrada.nextLine();
            
        
        }while (Continuar.equalsIgnoreCase("Sim"));
        System.out.println("Calculadora encerrada.");
        entrada.close();
        

    }
    
}
