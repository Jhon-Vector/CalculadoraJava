
package SimpleCal;

import java.util.Scanner; 

public class Calc {
    public static void main(String[] args){
        double N1, N2;
        double SOM, SUB, MULT, DIV, POT, RAIZ;
        int op; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor"); 
        N1 = entrada.nextDouble();
        System,out,println("Informe o segundo valor"); 
        N2 entrada.nextDouble(); 
        
        System.out.println("Selecione o tipo de operação");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.println("[5] Potência");
        System.out.println("[6] Raiz");                            
        System.out.println("Digite o tipo de operação");
        op = entrada.nextInt(); 
        
        switch(op){
            case 1:
            SOM = N1+N2;
                System.out.println("A soma é: "+SOM);
                break; 
                
            case 2: 
               SUB = N1-N2; 
                System.out.println("A subtração é"+SUB);
                break; 
                
            case 3: 
                MULT = N1*N2; 
                System.out.println("A multiplicação é"+MULT);
                break; 
            
            case 4: 
                DIV = N1/N2;
                System.out.println("O valor da divisão é"+DIV);
                break; 
                
            case 5: 
                POT=math.pow(N1, N2); 
                System.out.println("A Potência é :"+POT);
                break; 
                
            case 6: 
                RAIZ = math.sqrt(N1);
                System.out.println("A raiz é:"+RAIZ);
                break; 
                
               
        }
            
    }
}
