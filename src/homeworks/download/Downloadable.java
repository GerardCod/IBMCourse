package homeworks.download;

/**
 * Downloadable downloads and stores a file, given an url.
 * @author Gerardo Aguilar
 * @version 1.0.0 22/06/2021
 */
public interface Downloadable {

  /**
   * Downloads the content of the given url.
   * @param url is the url of the object to download.
   */
  void download(String url, String newFilePath);
}
