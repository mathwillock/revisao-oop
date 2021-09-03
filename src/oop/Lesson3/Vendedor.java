package oop.Lesson3;

public class Vendedor extends Funcionario{

    private double faturamento;
    private double comissao;

    public Vendedor(String nome, String sexo, double salario, double faturamento) {
        super(nome, sexo, salario);
        this.faturamento = faturamento;
        this.comissao = comissao;
    }

    public double getComissao() {
        return faturamento * 0.05;
    }

    public double getRemuneracao() {
        return getSalario() + getComissao();
    }

    @Override
    public String toString() {
        return super.toString() + "Vendedor{" +
                "faturamento=" + faturamento +
                ", comissao=" + comissao +
                '}';
    }
}
