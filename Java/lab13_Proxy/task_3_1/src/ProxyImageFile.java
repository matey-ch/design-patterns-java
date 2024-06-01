public class ProxyImageFile implements DisplayObject{

    private final String path;
    private DisplayObject imageFile = null;

    public ProxyImageFile(String path) {
        this.path = path;
    }

    @Override
    public void display(){
        if (imageFile==null) {
            this.imageFile = new ImageFile(path);
        }
        imageFile.display();
    }

}
