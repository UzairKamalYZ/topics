package be.techfix.adapter;

public class Main {
    public static void main(String[] args) {
        ChargeableElectronicDevice device = new ChargeableElectronicDevice(new EUElectronicSlotAdapter());
        device.chargeIt();

        device = new ChargeableElectronicDevice(new USElectronicSlotAdapter());
        device.chargeIt();
    }
}
