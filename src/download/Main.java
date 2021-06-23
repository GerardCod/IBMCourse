package download;

public class Main {
  private static final String IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/FC_Bayern_München_logo_(2017).svg/1024px-FC_Bayern_München_logo_(2017).svg.png";
  public static void main(String[] args) {
    Downloadable downloader = new Torrent();
    downloader.download(IMAGE_URL, "image_downloaded.png");
  }
}
