import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class App {
    public static void main(String[] args) throws IOException {
        PrintStream out = new PrintStream(System.out, true, UTF_8);
//        fazer uma conexão HTTP e buscar os top 250 filmes
        ExtratordeConteudo extrator = new ExtratordeConteudoDoIMDB();
//        String url = "https://imdb-api.com/en/API/Top250Movies/k..." ta fora do ar
        String url = "https://api.mocki.io/v2/549a5d8b/Top250Movies";
//        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
//        ExtratordeConteudo extrator = new ExtratordeConteudoDaNasa();
//        String url = "https://api.nasa.gov/planetary/apod?api_key=v4lsy5rPlChkGbjV9kCLVokIJE3Fr6Y99rYrPD5A&start_date=2022-06-10&end_date=2022-06-14";
//        String url = "https://api.mocki.io/v2/549a5d8b/NASA-APOD";
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
