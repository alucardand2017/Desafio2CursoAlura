package Domain;

public class Audio implements  Metricas{
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getDuracao() {
        return Duracao;
    }

    public void setDuracao(int duracao) {
        Duracao = duracao;
    }

    public int getCurtidas() {
        return Curtidas;
    }

    public void setCurtidas(int curtidas) {
        Curtidas = curtidas;
    }

    public int getTotalReproducoes() {
        return TotalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        TotalReproducoes = totalReproducoes;
    }

    public int getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(int classificacao) {
        Classificacao = classificacao;
    }

    private String Titulo;
    private int Duracao;
    private int Curtidas;
    private int TotalReproducoes;
    private int Classificacao;

    @Override
    public void TotalCurtidas() {
        System.out.println("Total de curtidas: "+ this.Curtidas);
    }
}
