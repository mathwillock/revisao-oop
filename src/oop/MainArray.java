package oop;

public class MainArray {
    public static void main(String[] args) {

        Roupa [] roupas;
        roupas = new Roupa[5];
        // Vamos criar uma array passando dentro do for, instanciando os objetos

//
//        //roupas[0] = new Roupa();
//        roupas[0].colecao = "outono/inverno";
//        roupas[0].cor = "branca";
//        roupas[0].modelo = "regata";
//        roupas[0].descricao = "camisa";
//
//       // roupas[1] = new Roupa();
//        roupas[1].colecao = "verao";
//        roupas[1].cor = "cinza";
//        roupas[1].modelo = "slim";
//        roupas[1].descricao = "calca";
//
//       // roupas[2] = new Roupa();
//        roupas[2].colecao = "outono/inverno";
//        roupas[2].cor = "outono/inverno";
//        roupas[2].modelo = "outono/inverno";
//        roupas[2].descricao = "outono/inverno";
//
//       // roupas[3] = new Roupa();
//        roupas[3].colecao = "outono/inverno";
//        roupas[3].cor = "outono/inverno";
//        roupas[3].modelo = "outono/inverno";
//        roupas[3].descricao = "outono/inverno";
//
//      //  roupas[4] = new Roupa();
//        roupas[4].colecao = "outono/inverno";
//        roupas[4].cor = "preta";
//        roupas[4].modelo = "moleton capuz";
//        roupas[4].descricao = "blusa geek";
//
//
//       // System.out.println(roupas[0].descricao);


       roupas[0] = new Roupa("camisa", "Branca", "Grande", "verao", "T-shirt");
       roupas[1] = new Roupa("calca", "jeans", "46", "inverno", "jeans");
       roupas[2] = new Roupa("blusa moleton", "preto", "extra grande", "inverno", "moleton geek");
       roupas[3] = new Roupa("bikini", "colorida", "pequeno", "verao", "infantil");
       roupas[4] = new Roupa("camisa", "amarela", "Grande", "verao", "camisa da selecao");

        System.out.println(roupas[0].descricao);
        System.out.println(roupas[1].descricao);
        System.out.println(roupas[2].descricao);
        System.out.println(roupas[3].descricao);
        System.out.println(roupas[4].descricao);


    }



}
