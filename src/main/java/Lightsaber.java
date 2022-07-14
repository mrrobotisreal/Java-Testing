public class Lightsaber {
    private int serialNumber;
    private int charge = 0;
    private String color = "";

    Lightsaber() {
        this(10010110);
    }

    Lightsaber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getCharge() {
        return this.charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getJediSerialNumber() {
        return this.serialNumber;
    }

    public void use(int minutes) {
        this.charge -= minutes;
    }

    public void recharge() {
        this.charge = 100;
    }
}
