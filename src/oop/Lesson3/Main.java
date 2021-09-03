package oop.Lesson3;

import java.io.*;

public class Main {

    //encapsulamento
    public static void main(String[] args) throws IOException {
        Funcionario matheus = new Funcionario("Matheus", "M", 3000);
        Funcionario mauri = new Funcionario("Mauri", "M", 5000);
        Funcionario joice = new Funcionario("Joice", "F", 7000);
        Funcionario kenio = new Funcionario("Kenio", "M", 10000);

        Gerente thiago = new Gerente("Thiago", "m", 20000);
        Vendedor ana = new Vendedor("Ana Carolina", "f", 30000, 100000 );

//         Escrevendo um arquivo com os dados dos funcionarios
        FileOutputStream fos = new FileOutputStream("funcionaios.txt"); // criando um arquivo em disco.
        OutputStreamWriter osw = new OutputStreamWriter(fos); // Escrever no arquivo.
        BufferedWriter bw = new BufferedWriter(osw); // Escrevendo em parceria com osw

//        Passando a execucao  escrita
            bw.append(matheus.toString());

            bw.newLine();
            bw.append(mauri.toString());

            bw.newLine();
            bw.append(joice.toString());

            bw.newLine();
            bw.append(kenio.toString());

            bw.newLine();
            bw.append(thiago.toString());

            bw.newLine();
            bw.append(ana.toString());


        bw.close(); // fecha a escrita


    }



}
