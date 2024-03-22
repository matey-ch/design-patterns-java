import com.mobile.Legacy.MicroUsbCharger;

public class AdapterCombiningMicroUsbTypeC implements MicroUsbCharger, TypeCCharger{

    public AdapterCombiningMicroUsbTypeC(TypeCCharger typeCCharger){
        this.typeCCharger=typeCCharger;
        this.microUsbCharger= new AdapterTypeCToMicroUsb(typeCCharger);
    }

    public AdapterCombiningMicroUsbTypeC(MicroUsbCharger microUsbCharger){
        this.microUsbCharger=microUsbCharger;
        this.typeCCharger= new AdapterMicroUsbToTypeC(microUsbCharger);
    }

    final MicroUsbCharger microUsbCharger;
    final TypeCCharger typeCCharger;

    @Override
    public float getOutputPower() {
        return typeCCharger.getOutputPower();
    }

    @Override
    public float getOutputAmperage() {
        return microUsbCharger.getOutputAmperage();
    }

    @Override
    public float getOutputVoltage() {
        return microUsbCharger.getOutputVoltage();
    }
}
