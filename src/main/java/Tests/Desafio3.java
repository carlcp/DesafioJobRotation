package Tests;

import javax.swing.JOptionPane;

public class Desafio3 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Digite uma palavra ");
	System.out.println(str);
	char[] ch = str.toCharArray();
	int begin = 0;
	int end = ch.length-1;
        char temp;
	    while(end>begin){
	        temp = ch[begin];
	        ch[begin] = ch[end];
	        ch[end] = temp;
	        end--;
	        begin++;
	    }
	    str = new String(ch);
	    System.out.println(str);
	}
    }

