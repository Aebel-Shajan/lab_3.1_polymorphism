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
    public void canStartEngine() {
        assertThat(car.startEngine()).isEqualTo("VROOM I AM A CAR, THIS IS THE SOUND A CAR MAKES");
    }
}
