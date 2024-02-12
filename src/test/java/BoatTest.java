import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoatTest {
    Boat boat;

    @BeforeEach
    public void setUp() {
        boat = new Boat(6, 5000f, "sailboat");
    }

    @Test
    public void canGetNumberOfWheels() {
        assertThat(boat.getNumberOfWheels()).isEqualTo(0);
    }

    @Test
    public void canGetMaximumOccupancy() {
        assertThat(boat.getMaximumOccupancy()).isEqualTo(6);
    }

    @Test
    public void canGetValue() {
        assertThat(boat.getValue()).isEqualTo(5000f);
    }

    @Test
    public void canSetValue() {
        boat.setValue(2000f);
        assertThat(boat.getValue()).isEqualTo(2000f);
    }

    @Test
    public void canGetType() {
        assertThat(boat.getType()).isEqualTo("sailboat");
    }

    @Test
    public void canStartEngine() {
        assertThat(boat.startEngine()).isEqualTo("SWOOSH, THIS IS BOAT SOUND");
    }

    @Test
    public void canSail(){
        assertThat(boat.sail()).isEqualTo("shhhshhhshhh");
    }
}
