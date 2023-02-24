import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida , informe um numero inteiro! ");
                // e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0, tente novamente. ");
                // e.printStackTrace();
            }
            finally {
                System.out.println("Chegou no finally! ");
            }
        } while (continueLooping);



        System.out.println("O codigo continua...");
    }

    public static int dividir(int a, int b) { return a / b;}
}