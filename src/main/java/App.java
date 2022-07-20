import extratores.Conteudo;
import extratores.ExtratordeConteudo;
import extratores.ExtratordeConteudoDoIMDB;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.List;
import java.util.stream.IntStream;

import static enums.Api.IMDB_MENOR;
import static java.nio.charset.StandardCharsets.UTF_8;

public class App {
    public static void main(String[] args) throws IOException {
        PrintStream out = new PrintStream(System.out, true, UTF_8);
        String url = IMDB_MENOR.getUrl();
        ExtratordeConteudo extrator = new ExtratordeConteudoDoIMDB();
//      extratores.ExtratordeConteudo extrator = new extratores.ExtratordeConteudoDaNasa();

        var http = new ClienteHttp();
        String json = http.buscaDados(url);

//        exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);
        boolean printNota = extrator.getClass().equals(ExtratordeConteudoDoIMDB.class);

        var geradora = new GeradorDeFigurinhas();
        for (Conteudo conteudo : conteudos) {
            String nomeArquivo = conteudo.getTitulo() + ".png";

            InputStream inputStream = new URL(conteudo.getUrl()).openStream();
            geradora.cria(inputStream, nomeArquivo);

            out.println("Título: \u001b[1m" + conteudo.getTitulo() + "\u001b[m");
            if (printNota) {
                out.println("\u001b[38;2;255;255;255m\u001b[48;2;42;122;228mClassificação: " + conteudo.getNota() + "\u001b[m");
                int countEstrelas = (int) Math.floor(conteudo.getNota());
                IntStream.range(0, countEstrelas).mapToObj(i -> "\u2B50").forEach(out::print);
            }
            System.out.println();
        }
    }

}
