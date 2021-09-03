package oop;

public class Roupa {

    String descricao;
    String cor;
    String tamanho;
    String colecao;
    String modelo;

    public Roupa(String descricao, String cor, String tamanho, String colecao, String modelo) {
        this.descricao = descricao;
        this.cor = cor;
        this.tamanho = tamanho;
        this.colecao = colecao;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "descricao='" + descricao + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", colecao='" + colecao + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
