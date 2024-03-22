import com.mobile.Legacy.MicroUsbCharger;

public class AdapterToUniversal implements UniversalCharger {

    public AdapterToUniversal(TypeCCharger typeCCharger){
        this.typeCCharger=typeCCharger;
        this.microUsbCharger=null;
    }

    public AdapterToUniversal(MicroUsbCharger microUsbCharger){
        this.microUsbCharger=microUsbCharger;
        this.typeCCharger=null;
    }

    final MicroUsbCharger microUsbCharger;
    final TypeCCharger typeCCharger;

    @Override
    public float getOutputAmperage() {
        if (microUsbCharger!=null) return microUsbCharger.getOutputAmperage();
        return (float) Math.sqrt(typeCCharger.getOutputPower());
    }

    @Override
    public float getOutputVoltage() {
        if (microUsbCharger!=null) return microUsbCharger.getOutputVoltage();
        return (float) Math.sqrt(typeCCharger.getOutputPower());
    }

    @Override
    public float getOutputPower() {
        if (typeCCharger!=null) return typeCCharger.getOutputPower();
        return (float) Math.sqrt(microUsbCharger.getOutputAmperage()*microUsbCharger.getOutputVoltage());
    }
}
