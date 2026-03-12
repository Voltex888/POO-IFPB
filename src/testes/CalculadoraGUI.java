package testes;

import javax.swing.*;

public class CalculadoraGUI {

    public static void main(String[] args) {

        JFrame tela = new JFrame("Calculadora");

        JTextField v1 = new JTextField();
        JTextField v2 = new JTextField();
        JLabel resultado = new JLabel("Resultado:");

        JButton soma = new JButton("Somar");
        JButton sub = new JButton("Subtrair");
        JButton mult = new JButton("Multiplicar");
        JButton div = new JButton("Dividir");

        v1.setBounds(50,30,150,30);
        v2.setBounds(50,70,150,30);

        soma.setBounds(20,120,100,30);
        sub.setBounds(130,120,100,30);
        mult.setBounds(20,160,100,30);
        div.setBounds(130,160,100,30);

        resultado.setBounds(50,210,200,30);

        soma.addActionListener(e -> {
            double r = Double.parseDouble(v1.getText()) + Double.parseDouble(v2.getText());
            resultado.setText("Resultado: " + r);
        });

        sub.addActionListener(e -> {
            double r = Double.parseDouble(v1.getText()) - Double.parseDouble(v2.getText());
            resultado.setText("Resultado: " + r);
        });

        mult.addActionListener(e -> {
            double r = Double.parseDouble(v1.getText()) * Double.parseDouble(v2.getText());
            resultado.setText("Resultado: " + r);
        });

        div.addActionListener(e -> {
            double r = Double.parseDouble(v1.getText()) / Double.parseDouble(v2.getText());
            resultado.setText("Resultado: " + r);
        });

        tela.add(v1);
        tela.add(v2);
        tela.add(soma);
        tela.add(sub);
        tela.add(mult);
        tela.add(div);
        tela.add(resultado);

        tela.setSize(260,300);
        tela.setLayout(null);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}