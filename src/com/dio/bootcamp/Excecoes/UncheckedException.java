package com.dio.bootcamp.Excecoes;

//Fazer divisão de dois números

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLop = true;
        do {

            String a = JOptionPane.showInputDialog("Númerdor: ");
            String b = JOptionPane.showInputDialog("Númerdor: ");


            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                JOptionPane.showMessageDialog(null,"Resultado: " + resultado);
                continueLop = false;

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Valor Inválido, digite um número inteiro!");
                // e.printStackTrace();
            } catch (ArithmeticException e){

                JOptionPane.showMessageDialog(null, "Impossível dividir por 0!");
                // e.printStackTrace();
            } finally {

                System.out.println("Chegou no finally");
            }

        }while (continueLop);

        System.out.println("O código continua...");


    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}
