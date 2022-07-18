package Tests;

import javax.swing.JOptionPane;

public class Desafio2 {
    public static void main(String[] args) {
        int count;  
        count = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros na sequência "));
        
        
        fibo(count);
      
    }
    public static void fibo(int count) {
        int num1 = 0, num2 = 1;
        String saida = "";
        int counter = 0;
        int num=0;
        int test = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ver se existe ou nao na squencia "));

        while (counter < count) {
  
            
            saida = saida + num1 + " ";
            if(num1 == num){
                test = 1;
            }           
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        if(test == 1){
            JOptionPane.showMessageDialog(null, saida + "\n" +  "O numero informado pertence a sequência !!!",
            "Hey!", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else{
            JOptionPane.showMessageDialog(null, saida + "\n" +  "O numero informado não pertence a sequência !!!",
            "Hey!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
