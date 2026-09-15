package app.sabre.wzsabre.waze;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WazeRtHandshakeTest {
    @Test
    public void handshakePositionsSessionWithoutConsumingMapAlerts() {
        String payload = WazeRtCodec.handshakePayload(-78.8784, 35.0527);
        assertTrue(payload.contains("SeeMe,"));
        assertTrue(payload.contains("SetMood,"));
        assertTrue(payload.contains("Location,"));
        assertFalse(payload.contains("MapDisplayed,"));
    }
}
