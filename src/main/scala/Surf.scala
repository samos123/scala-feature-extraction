//import de.lmu.ifi.dbs.utilities.Arrays2;
import de.lmu.ifi.dbs.jfeaturelib.features.SURF
import ij.process.ColorProcessor;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import javax.imageio.ImageIO;


/**
 * Example of extracting SURF features from section "Detecting the scale-invariant SURF features" in chapter 8.
 */
object Surf extends App {

  // Read input image
  val f = new File("test.jpg");
  val image = new ColorProcessor(ImageIO.read(f));
  val descriptor = new SURF();
  descriptor.run(image);

  val features = descriptor.getFeatures();
  println(features);

}
