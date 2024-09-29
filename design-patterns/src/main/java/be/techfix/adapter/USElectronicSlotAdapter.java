package be.techfix.adapter;

import lombok.extern.java.Log;

@Log
public class USElectronicSlotAdapter implements ElectronicDeviceAdapter{
    @Override
    public void chargeIt() {
        log.info("Charging Electronic Slot via US specific adapter");
    }
}
