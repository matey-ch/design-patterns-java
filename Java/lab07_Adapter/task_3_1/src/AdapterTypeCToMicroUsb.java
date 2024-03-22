import com.mobile.Legacy.MicroUsbCharger;

public class AdapterTypeCToMicroUsb implements MicroUsbCharger {

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    final TypeCCharger typeCCharger;

    @Override
    public float getOutputVoltage() {
        return (float) Math.sqrt(typeCCharger.getOutputPower());
    }

    @Override
    public float getOutputAmperage() {
        return (float) Math.sqrt(typeCCharger.getOutputPower());
    }
}
