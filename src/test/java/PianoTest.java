import models.Piano;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PianoTest {
    Piano piano;

    @BeforeEach
    public void setUp() {
        piano = new Piano(100);
    }
}
