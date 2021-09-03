package oop;

public class Sapato {

    int tamanho;
    String cor;
    String modelo;
    String marca;

    @Override
    public String toString() {
        return "Sapato{" +
                "tamanho=" + tamanho + "," + '\n' +
                " cor='" + cor + "," + '\n' +
                " modelo='" + modelo + "," + '\n' +
                " marca='" + marca + "," + '\n' +
                '}';
    }
}
