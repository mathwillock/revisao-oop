package oop;

public class Main {


    public static void main(String[] args) {

        Roupa casaco; // definicao da vairaval casaco

        casaco = new Roupa("casaco", "outono", "preto", "Pequeno", "slim"); // instaciando um casaco como um objeto da classe Roupa;

//        casaco.descricao = "casaco";
//        casaco.colecao = "Outono/inverno";
//        casaco.cor = "preto";
//        casaco.tamanho = "P";
//        casaco.modelo = "slim";


        System.out.println(
                casaco.toString()
        );


        Sapato bicoFino; // variavel
        bicoFino = new Sapato();
        bicoFino.cor = "Vermelho";
        bicoFino.marca = "Arezzo";
        bicoFino.modelo = "Bico fino";
        bicoFino.tamanho = 35;


        System.out.println(bicoFino.toString());

        Sapato sapatoSport; // criando variavel
        //sapatoSport = bicoFino; // apontamento para a class

        //sapatoSport.modelo = "sport"; // mudando o valor modelo dentro de bicofino; pq os dois estao apontando para o mesmo objeto.

        sapatoSport = new Sapato();
        sapatoSport.cor = "marrom";
        sapatoSport.tamanho = 41;
        sapatoSport.modelo = "sport";
        sapatoSport.marca = "Adidas";



        System.out.println("Pronto!");


    }



}
