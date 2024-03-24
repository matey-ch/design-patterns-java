public class UserSizeButton implements ButtonSize{

    private final float size;

    public UserSizeButton(float size){
        this.size = size;
    }

    @Override
    public void set() {
        System.out.printf("Setting size to %s...%n",size);
    }

}
