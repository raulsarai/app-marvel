package br.com.marvel_app.model;

public class ListaPersonagem {
    private  String nomePersonagem;
    private int ImagemPersongem;

    public ListaPersonagem() {
    }

    public ListaPersonagem(String nomePersonagem, int imagemPersongem) {
        this.nomePersonagem = nomePersonagem;
        this.ImagemPersongem = imagemPersongem;

    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public int getImagemPersongem() {
        return ImagemPersongem;
    }

    public void setImagemPersongem(int imagemPersongem) {
        ImagemPersongem = imagemPersongem;
    }
}
