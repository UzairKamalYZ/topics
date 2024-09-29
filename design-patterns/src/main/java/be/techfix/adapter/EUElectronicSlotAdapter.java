package be.techfix.adapter;

import lombok.extern.java.Log;

@Log
public class EUElectronicSlotAdapter implements ElectronicDeviceAdapter{


    @Override
    public void chargeIt() {
    log.info("Charging Electronic Slot via EU specific adapter");
    }
}
