package oop.Lesson3;

import java.io.*;

public class Main {


    //encapsulamento
    public static void main(String[] args) throws IOException {
        Funcionario matheus = new Funcionario("Matheus", "M", 3000);
        Funcionario mauri = new Funcionario("Mauri", "M", 5000);
        Funcionario joice = new Funcionario("Joice", "F", 7000);
        Funcionario kenio = new Funcionario("Kenio", "M", 10000);


        FileOutputStream fos = new FileOutputStream("funcionaios.txt"); // criando um arquivo em disco.

        OutputStreamWriter osw = new OutputStreamWriter(fos); // Escrever no arquivo.

        BufferedWriter bw = new BufferedWriter(osw);

        bw.append(matheus.getNome());
        bw.newLine();
        bw.append(mauri.getNome());
        bw.newLine();
        bw.append(joice.getNome());
        bw.newLine();
        bw.append(kenio.getNome());

        bw.close(); // fecha a escrita


    }



}
