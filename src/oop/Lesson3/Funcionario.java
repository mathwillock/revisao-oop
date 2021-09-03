package oop.Lesson3;

import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Funcionario {
//    via de regra sempre é private;

    private String nome;
    private String sexo;
    private double salario;

    private static DecimalFormat df = new DecimalFormat("#.##");


    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo.toLowerCase();
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

//    construtor padrao
    public Funcionario() {
    }

    public Funcionario(String nome, String sexo, double salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;

//        df.setRoundingMode(RoundingMode.UP);
//        String format = df.format(this.salario = salario);
//        salario = Double.valueOf(format);
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
