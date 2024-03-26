public class Cream extends Additive {

    public Cream(Beverage wrappee){
        super(wrappee);
    }


    @Override
    public String description() {
        return super.description()+" + cream";
    }

    @Override
    public float cost() {
        return super.cost()+0.1f;
    }
}
