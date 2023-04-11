import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;


public class GeradoraDeStickers {

    public void create() throws Exception {

        // Reading the image
        BufferedImage originalImage = ImageIO.read(new File("entrada/filmes.png"));

        // Create a new image in memory with the new size and translucent
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();
        int newHeight = height + 200;
        BufferedImage newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);

        // Copy the origin image for a new image (in memory)

        // Write a sentence in the new image

        // Write the new image in a file

    }

}
