package br.com.visao;

import br.com.controle.Media;

import javax.swing.*;

public class Tela {

    public static void main(String[] args) {

        Media media = new Media();

        media.setNota1(Double.valueOf(JOptionPane.showInputDialog("Digite a 1ª nota")));
        media.setNota2(Double.valueOf(JOptionPane.showInputDialog("Digite a 2ª nota")));

        if (media.calcularMedia()>=6) {

            JOptionPane.showMessageDialog(null, "Aprovado!");

        }

        if (media.calcularMedia()>=4 && media.calcularMedia()<6) {

            JOptionPane.showMessageDialog(null, "Recuperação!");

        }

        else {

            JOptionPane.showMessageDialog(null, "Reprovado!");

        }
    }
}