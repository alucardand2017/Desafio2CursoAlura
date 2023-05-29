package Domain;

public class Musica extends  Audio  {
    public String getNomeBanda() {
        return NomeBanda;
    }

    public void setNomeBanda(String nomeBanda) {
        NomeBanda = nomeBanda;
    }

    public int getAnoLancamento() {
        return AnoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        AnoLancamento = anoLancamento;
    }

    private String NomeBanda;
    private int AnoLancamento;
}
