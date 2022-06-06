import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class ImageOpen {

  public ImageOpen(String fileName) {
    try {
      File f = new File (fileName);
      Desktop d = Desktop.getDesktop();
      d.open(f);

    } catch ( IOException e ) { }
  }
}
