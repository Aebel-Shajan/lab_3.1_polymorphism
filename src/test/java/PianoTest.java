import models.Piano;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PianoTest {
    Piano piano;

    @BeforeEach
    public void setUp() {
        piano = new Piano(100f);
    }

    @Test
    public void canGetValue() {
        assertThat(piano.getValue()).isEqualTo(100f);
    }

    @Test
    public void canSetValue() {
        piano.setValue(300);
        assertThat(piano.getValue()).isEqualTo(300);
    }
}
