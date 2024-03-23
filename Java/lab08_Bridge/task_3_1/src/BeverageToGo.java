public class BeverageToGo implements BeverageServing{

    @Override
    public void prepare() {
        System.out.println("Getting a to-go cup");
    }

    @Override
    public String drink() {
        return "from a to-go cup";
    }
}
