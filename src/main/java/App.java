import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.net.http.HttpClient.newHttpClient;
import static java.net.http.HttpResponse.BodyHandlers;
import static java.nio.charset.StandardCharsets.UTF_8;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        PrintStream out = new PrintStream(System.out, true, UTF_8);
//        fazer uma conexão HTTP e buscar os top 250 filmes
//        String url = "https://imdb-api.com/en/API/Top250Movies/k..." ta fora do ar
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        URI endereco = URI.create(url);
        HttpClient client = newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

//        extrair só os dados que interessam (título, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

//        exibir e manipular os dados
        for (Map<String, String> filme : listaDeFilmes) {
            out.println("Título: \u001b[1m" + filme.get("title") + "\u001b[m");
            out.println("Poster: \u001b[1m" + filme.get("image") + "\u001b[m");
            out.println("\u001b[38;2;255;255;255m\u001b[48;2;42;122;228mClassificação: " + filme.get("imDbRating") + "\u001b[m");
            int countEstrelas = (int) Math.floor(Double.parseDouble(filme.get("imDbRating")));
            IntStream.range(0, countEstrelas).mapToObj(i -> "\u2B50").forEach(out::print);
            System.out.println();
            System.out.println();
        }
    }
}
