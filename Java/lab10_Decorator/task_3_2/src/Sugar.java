public class Sugar extends Additive {

    public Sugar(Beverage wrappee){
        super(wrappee);
    }


    @Override
    public String description() {
        return super.description()+" + sugar";
    }

    @Override
    public float cost() {
        return super.cost()+0.05f;
    }
}
