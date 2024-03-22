package com.customs;

import com.vehiclecalculator.Vehicle;

public class AdapterAutoToVehicle extends Vehicle {

    public AdapterAutoToVehicle(Auto auto) {
        super(auto.age, auto.model, auto.damaged?0.25f:1, auto.mileage);
    }


}
