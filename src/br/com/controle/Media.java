package br.com.controle;

public class Media {

    private double nota1, nota2, media;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {

        media = (nota1+nota2)/2;

        return media;

    }
}