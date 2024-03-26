public class SourCream extends Additive {

    public SourCream(Beverage wrappee){
        super(wrappee);
    }


    @Override
    public String description() {
        return super.description()+" + sour cream";
    }

    @Override
    public float cost() {
        return super.cost()+0.1f;
    }
}
