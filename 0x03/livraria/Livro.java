package livraria;

import livraria.exceptions.AutorInvalidoException;
import livraria.exceptions.LivroInvalidoException;

public class Livro {
    protected String titulo;
    protected String autor;
    protected double preco;

    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        if(!autor.contains(" ")){
            throw new AutorInvalidoException("Nome de autor invalido");
        }else{
            this.autor = autor;
        }
        if(titulo.length() < 3 ){
            throw new LivroInvalidoException("Titulo de livro invalido");
        }else{
            this.titulo = titulo;
        }
        if(preco < 0 || preco == 0){
            throw new LivroInvalidoException("Preco de livro invalido");
        }else {
            this.preco = preco;
        }

    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
