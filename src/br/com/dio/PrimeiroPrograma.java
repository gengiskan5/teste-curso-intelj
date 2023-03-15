package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

//        String s = "o poblema dos 3 corpos, 300";
//        Livro = new Livro(nome:"o poblema dos 3 corpos, 300");
       /* int a = 5;
        int b = 3;
        System.out.println("hello World! " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}