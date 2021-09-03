package oop.Lesson3;

// Classe gerente herdando a classe pai (Funcionario)
public class Gerente extends Funcionario {
    private double gratificacao;

    public double getGratificacao() {
        return getSalario() * 0.2;
    }

    public Gerente(String nome, String sexo, double salario) {
        super(nome, sexo, salario);
    }

    @Override
    public String toString() {
        return super.toString() + "   " + getGratificacao();
    }
}
