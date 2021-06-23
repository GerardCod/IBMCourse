package download;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.net.ssl.HttpsURLConnection;


/**
 * Downloads images thanks to the implementation of Downloadable interface.
 * @author Gerardo Aguilar
 * @version 1.0.0 23/06/2021
 */
public class Torrent implements Downloadable {

  @Override
  public void download(String url, String newFilePath) {
    HttpsURLConnection connection = getConnection(url);
    try {
      Path newPath = Paths.get(newFilePath);
      Files.copy(connection.getInputStream(), newPath, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("File downloaded at ".concat(newPath.toString()));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Returns a secure connection with the given url.
   * @param url Direction of the file.
   * @return the secure <strong>HttpsURLConnection<strong>.
   */
  private HttpsURLConnection getConnection(String url) {
    HttpsURLConnection connection = null;
    try {
      URL urlFile = new URL(url);
      connection = (HttpsURLConnection) urlFile.openConnection(); 
    } catch (Exception e) {
      e.printStackTrace();
    }
    return connection;
  }
}
