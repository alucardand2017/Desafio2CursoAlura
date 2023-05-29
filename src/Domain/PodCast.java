package Domain;

public class PodCast extends  Audio  {
    private int Episodeo;
    private String NomeEpisodeo;
    private SeriePodcast Serie;

    public int getEpisodeo() {
        return Episodeo;
    }

    public void setEpisodeo(int episodeo) {
        Episodeo = episodeo;
    }

    public String getNomeEpisodeo() {
        return NomeEpisodeo;
    }

    public void setNomeEpisodeo(String nomeEpisodeo) {
        NomeEpisodeo = nomeEpisodeo;
    }

    public SeriePodcast getSerie() {
        return Serie;
    }

    public void setSerie(SeriePodcast serie) {
        Serie = serie;
    }
}
