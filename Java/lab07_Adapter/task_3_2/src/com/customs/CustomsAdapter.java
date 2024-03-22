package com.customs;

import com.vehiclecalculator.VehicleCalculator;

public class CustomsAdapter implements Customs {

    public CustomsAdapter(VehicleCalculator carCalculator, VehicleCalculator truckCalculator){
        this.carCalculator=carCalculator;
        this.truckCalculator=truckCalculator;
    }

    private VehicleCalculator carCalculator;
    private VehicleCalculator truckCalculator;


    @Override
    public float vehiclePrice(Auto auto) {
        String priceString = "";
        if (auto.model.equals("truck")) {
            truckCalculator.setVehicle(new AdapterAutoToVehicle(auto));
            priceString = truckCalculator.calculatePrice();
        }
        else {
            carCalculator.setVehicle(new AdapterAutoToVehicle(auto));
            priceString = carCalculator.calculatePrice();
        }
        return Float.parseFloat(priceString.substring(0, priceString.length() - 3));
    }

    @Override
    public float tax(Auto auto) {
        String priceString = "";
        if (auto.model.equals("truck")) {
            truckCalculator.setVehicle(new AdapterAutoToVehicle(auto));
            priceString = truckCalculator.calculatePrice();
        }
        else {
            carCalculator.setVehicle(new AdapterAutoToVehicle(auto));
            priceString = carCalculator.calculatePrice();
        }
        float price = Float.parseFloat(priceString.substring(0, priceString.length() - 3));
        if (auto.age>10) return price*0.5f;
        return price*0.2f;
    }
}
