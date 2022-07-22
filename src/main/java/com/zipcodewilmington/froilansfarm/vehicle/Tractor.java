package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;
import com.zipcodewilmington.froilansfarm.shelter.Farm;
import com.zipcodewilmington.froilansfarm.shelter.Silo;

public class Tractor extends Vehicle implements FarmVehicle{

    CropRow cropRow;

    public Tractor(String name) {
        super(name);
    }

    public void operate(Farm farm) {

    }

    public int harvest(CropRow cropRow){
        for(int i = 0; i < cropRow.getSize(); i++){
            Silo.addProduce(cropRow.getCrop(i));
        }
        cropRow.clearRow();

        return 0;
    }


    public String makeNoise(){
        return makeNoise();
    }

    public Boolean isRiding(){
        return null;
    }

    public void stopRiding() {

    }
}