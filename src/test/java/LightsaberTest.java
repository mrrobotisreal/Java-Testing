import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightsaberTest {
    @Test
    public void setsChargeOfLightsaber() {
        // Setup
        Lightsaber lightsaber = new Lightsaber();
        // Execution
        int expect = 100;
        lightsaber.setCharge(expect);
        int actual = lightsaber.getCharge();
        // Assertions
        assertEquals(expect, actual);
    }

    @Test
    public void setsColorOfLightsaber() {
        // Setup
        Lightsaber lightsaber = new Lightsaber();
        // Execution
        String expect = "gold";
        lightsaber.setColor("gold");
        String actual = lightsaber.getColor();
        // Assertions
        assertEquals(expect, actual);
    }

    @Test
    public void getsChargeOfLightsaber() {
        // Setup
        Lightsaber lightsaber = new Lightsaber();
        // Execution
        int expect = 0;
        int actualGetCharge = lightsaber.getCharge();
        // Assertions
        assertEquals(expect, actualGetCharge);
    }

    @Test
    public void getsColorOfLightsaber() {
        // Setup
        Lightsaber lightsaber = new Lightsaber();
        // Execution
        String expect = "gold";
        lightsaber.setColor("gold");
        String actualGold = lightsaber.getColor();
        // Assertions
        assertEquals(expect, actualGold);
    }

    @Test
    public void returnsJediSerialNumber() {
        // Setup
        Lightsaber lightsaber = new Lightsaber(12345678);
        // Execution
        int expect = 12345678;
        int actual = lightsaber.getJediSerialNumber();
        // Assertions
        assertEquals(expect, actual);
    }

    @Test
    public void usesLightsaberCharge() {
        // Setup
        Lightsaber lightsaber = new Lightsaber();
        // Execution
        int expect = 50;
        lightsaber.setCharge(100);
        lightsaber.use(50);
        int actual = lightsaber.getCharge();
        // Assertions
        assertEquals(expect, actual);
    }

    @Test
    public void returnsRemainingMinutes() {
        // Setup
        Lightsaber lightsaber = new Lightsaber();
        // Execution
        int expect = 15;
        lightsaber.setCharge(100);
        lightsaber.use(85);
        int actual = lightsaber.getCharge();
        // Assertions
        assertEquals(expect, actual);
    }

    @Test
    public void returnsOneHundredPercentCharged() {
        // Setup
        Lightsaber lightsaber = new Lightsaber();
        // Execution
        int expect = 100;
        lightsaber.setCharge(100);
        lightsaber.use(85);
        lightsaber.recharge();
        int actual = lightsaber.getCharge();
        // Assertions
    }
}
