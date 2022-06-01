import java.awt.Desktop;
import java.io.File;

public class ImageTest {

  public static void main(String[] args) throws Exception {
    File f = new File ("index.jpg");
    Desktop d = Desktop.getDesktop();
    d.open(f);

  }
