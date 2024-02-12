import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    public void setUp() {
        car = new Car(5, 1000f, "Toyota Auris");
    }

    @Test
    public void canGetNumberOfWheels() {
        assertThat(car.getNumberOfWheels()).isEqualTo(4);
    }

    @Test
    public void canGetMaximumOccupancy() {
        assertThat(car.getMaximumOccupancy()).isEqualTo(5);
    }

    @Test
    public void canGetValue() {
        assertThat(car.getValue()).isEqualTo(1000f);
    }

    @Test
    public void canSetValue() {
        car.setValue(2000f);
        assertThat(car.getValue()).isEqualTo(2000f);
    }

    @Test
    public void canGetModel() {
        assertThat(car.getModel()).isEqualTo("Toyota Auris");
    }

    @Test
    public void canStartEngine() {
        assertThat(car.startEngine()).isEqualTo("VROOM I AM A CAR, THIS IS THE SOUND A CAR MAKES");
    }
}
