import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    Garage garage;

    @BeforeEach
    public void setUp(){
        garage = new Garage("Aebel");
    }

    @Test
    public void canGetOwner() {
        assertThat(garage.getOwner()).isEqualTo("Aebel");
    }

    @Test
    public void canSetOwner() {
        garage.setOwner("Bank");
        assertThat(garage.getOwner()).isEqualTo("Bank");
    }

    @Test
    public void canGetVehicleCount() {
        assertThat(garage.getValuableCount()).isEqualTo(0);
    }

    @Test
    public void canAddVehicle() {
        Car lambo = new Car(2, 10000, "Lamborghini Huracan");
        garage.addValuable(lambo);
        assertThat(garage.getValuableCount()).isEqualTo(1);
    }

    @Test
    public void canRemoveVehicle() {
        Car lambo = new Car(2, 10000, "Lamborghini Huracan");
        Car auris = new Car(5, 1000, "Toyota Auris");
        garage.addValuable(auris);
        garage.addValuable(lambo);
        garage.removeValuable(lambo);
        assertThat(garage.getValuableCount()).isEqualTo(1);
    }

    @Test
    public void canCalculateCollectiveValue() {
        Car lambo = new Car(2, 10000, "Lamborghini Huracan");
        Car auris = new Car(5, 1000, "Toyota Auris");
        garage.addValuable(auris);
        garage.addValuable(lambo);
        assertThat(garage.calculateCollectiveValue()).isEqualTo(11000);
    }
}
