package be.techfix.adapter;

import lombok.extern.java.Log;

@Log

public class ChargeableElectronicDevice {

    final ElectronicDeviceAdapter electronicDeviceAdapter;

    public ChargeableElectronicDevice(ElectronicDeviceAdapter electronicDeviceAdapter) {
        this.electronicDeviceAdapter = electronicDeviceAdapter;
    }

    public void chargeIt() {
        log.info("Charging Electronic Device");
        electronicDeviceAdapter.chargeIt();
    }
}
