import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import static java.awt.Color.YELLOW;
import static java.awt.Font.BOLD;
import static java.awt.Font.SANS_SERIF;
import static java.awt.Transparency.TRANSLUCENT;
import static javax.imageio.ImageIO.read;

public class GeradorDeFigurinhas {
    public void cria(InputStream inputStream, String nomeArquivo) throws IOException {
//        leitura da imagem
//        InputStream inputStream = new URL("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@.jpg").openStream();
        BufferedImage imagemOriginal = read(inputStream);
        
//        cria nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, TRANSLUCENT);

//        copiar imagem original para nova imagem em memória
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

//        configurar a fonte
        Font fonte = new Font(SANS_SERIF, BOLD, 64);
        graphics.setColor(YELLOW);
        graphics.setFont(fonte);

//        escrever uma frase na nova imagem
        graphics.drawString("TOPZERA", 100, novaAltura - 100);

//        escrever a nova imagem em um arquivo
        String caminho = "saida";
        if (!new File(caminho).exists()) new File(caminho).mkdir();

        ImageIO.write(novaImagem, "png", new File(caminho + "\\" + nomeArquivo));
    }
}
