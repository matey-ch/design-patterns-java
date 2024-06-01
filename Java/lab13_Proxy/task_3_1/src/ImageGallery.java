public class ImageGallery {

    public static void main(String[] args) {
        // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
        String path = "resources/";

        DisplayObject[] images = {
                new ProxyImageFile(path + "image1.jpeg"),  //
                new ProxyImageFile(path + "image2.jpeg"),  //
                new ProxyImageFile(path + "image3.jpeg"),  //
                new ProxyImageFile(path + "image4.jpeg"),  //
                new ProxyImageFile(path + "image5.jpeg"),  //
                new ProxyImageFile(path + "image6.jpeg"),  //
                new ProxyImageFile(path + "image7.jpeg"),  //
                new ProxyImageFile(path + "image8.jpeg"),  //
                new ProxyImageFile(path + "image9.jpeg"),  //
                new ProxyImageFile(path + "image10.jpeg"),  // ,
        };

        System.out.println("All images files are already created");

        //Displaying with loading
        for (DisplayObject image : images) {
            image.display();
        }

        //Now displaying without loading
        for (DisplayObject image : images) {
            image.display();
        }

    }

}
