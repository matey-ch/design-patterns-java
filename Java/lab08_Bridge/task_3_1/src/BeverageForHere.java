public class BeverageForHere implements BeverageServing{

    @Override
    public void prepare() {
        System.out.println("Getting a ceramic cup");
    }

    @Override
    public String drink() {
        return "from a ceramic cup";
    }
}
