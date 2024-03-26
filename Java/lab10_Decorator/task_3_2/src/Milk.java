public class Milk extends Additive {

    public Milk (Beverage wrappee){
        super(wrappee);
    }


    @Override
    public String description() {
        return super.description()+" + milk";
    }

    @Override
    public float cost() {
        return super.cost()+0.2f;
    }
}
