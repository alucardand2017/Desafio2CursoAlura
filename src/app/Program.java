package app;

import Domain.Musica;
import Domain.PodCast;
import Domain.SeriePodcast;

public class Program {
    public static void main(String[] args) {

        String menu = """
                ***************************
                * Bem Vindo ao SpotFilho. *
                ***************************
                """;
        Musica m1 = new Musica();
        m1.setClassificacao(5);
        m1.setCurtidas(300);
        m1.setDuracao(5);
        m1.setTitulo("Doomed");
        m1.setNomeBanda("Brig me the Horizon");
        m1.setAnoLancamento(2020);

        SeriePodcast s1 = new SeriePodcast();
        s1.setNomeSerie("Primeiro Contato");

        PodCast p1 = new PodCast();
        p1.setEpisodeo(1);
        p1.setClassificacao(4);
        p1.setCurtidas(299);
        p1.setDuracao(200);
        p1.setNomeEpisodeo("É da revista de video game?");
        p1.setTitulo("Serie de Podcasts Primeiro Contato");
        p1.setTotalReproducoes(400);
        p1.setSerie(s1);

        PodCast p2 = new PodCast();
        p2.setEpisodeo(2);
        p2.setClassificacao(5);
        p2.setCurtidas(199);
        p2.setDuracao(100);
        p2.setNomeEpisodeo("É da revista de video game?");
        p2.setTitulo("É da banca de jornal?");
        p2.setTotalReproducoes(400);
        p2.setSerie(s1);
    }
}
