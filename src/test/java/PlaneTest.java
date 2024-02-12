import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {
    Plane plane;

    @BeforeEach
    public void setUp() {
        plane = new Plane(6, 100, 5000f, 3);
    }

    @Test
    public void canGetNumberOfWheels() {
        // 2 on the nose gear, 2 each on the wing :p
        assertThat(plane.getNumberOfWheels()).isEqualTo(6);
    }

    @Test
    public void canGetMaximumOccupancy() {
        assertThat(plane.getMaximumOccupancy()).isEqualTo(100);
    }

    @Test
    public void canGetValue() {
        assertThat(plane.getValue()).isEqualTo(5000f);
    }

    @Test
    public void canSetValue() {
        plane.setValue(2000f);
        assertThat(plane.getValue()).isEqualTo(2000f);
    }

    @Test
    public void canGetEngineNumber() {
        assertThat(plane.getEngineNumber()).isEqualTo(3);
    }

    @Test
    public void canStartEngine() {
        assertThat(plane.startEngine()).isEqualTo("engine starting");
    }

    @Test
    public void canFly(){
        assertThat(plane.fly()).isEqualTo("wheeeee plane be flying");
    }
}
