import com.mobile.Legacy.Charger;
import com.mobile.Legacy.MobilePhone;

public class Main {

    public static void main(String[] args) {
        Charger charger = new Charger(5.0f, 1.0f);

        System.out.println("\n============= MicroUsb ==============\n");
        MobilePhone phone = new MobilePhone();
        phone.charge(20);
        phone.pluginCharger(charger);
        phone.charge(20);
        phone.unplugCharger();
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());

        System.out.println("\n============= Type-C ==============\n");
        FastCharge fastCharge = new FastCharge(18);

        SamsungS samsung = new SamsungS();
        samsung.makeCall();
        samsung.pluginCharger(fastCharge);
        samsung.charge(30);
        samsung.unplugCharger();
        printBatteryStatus(samsung);
        samsung.makeCall();
        printBatteryStatus(samsung);
        samsung.charge(10);
        samsung.unplugCharger();
        printBatteryStatus(samsung);


//        samsung.pluginCharger(charger);
        System.out.println("\nCharging throughout adapter");
        TypeCCharger adapterMicroUsbToTypeC = new AdapterMicroUsbToTypeC(charger);  // адаптер через агрегацію
//        TypeCCharger adapterMicroUsbToTypeC = new AdapterMicroUsbToTypeCInheritance(5.0f, 1.0f);  // адаптер через наслідування
        samsung.pluginCharger(adapterMicroUsbToTypeC);
        samsung.charge(10);
        samsung.unplugCharger();
        printBatteryStatus(samsung);


//        TODO: implement and use adapter Type-C => USB
        System.out.println("\nMaintaining legacy charging");
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());
        phone.pluginCharger(new AdapterTypeCToMicroUsb(fastCharge));
        phone.charge(20);
        phone.unplugCharger();
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());


        System.out.println("\nUsing combining adapter");
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());
        phone.pluginCharger(new AdapterCombiningMicroUsbTypeC(fastCharge));
        phone.charge(20);
        phone.unplugCharger();
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());
        printBatteryStatus(samsung);
        samsung.pluginCharger(new AdapterCombiningMicroUsbTypeC(fastCharge));
        samsung.charge(10);
        samsung.unplugCharger();
        printBatteryStatus(samsung);


        System.out.println("\nUsing universal adapter");
        UniversalCharger universalCharger = new AdapterToUniversal(charger);
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());
        phone.pluginCharger(universalCharger);
        phone.charge(20);
        phone.unplugCharger();
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());
        printBatteryStatus(samsung);
        samsung.pluginCharger(universalCharger);
        samsung.charge(10);
        samsung.unplugCharger();
        printBatteryStatus(samsung);


    }

    private static void printBatteryStatus(SamsungS phone){
        System.out.printf("Current battery status = %s%n", phone.getChargingPercent());
    }

}
