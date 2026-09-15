package app.sabre.wzsabre;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/** Regression coverage for Waze enforcement alert names that Highway Radar may not render directly. */
public class PoliceAlertNormalizationTest {

    @Test
    public void hidingPoliceNormalizesToHidden() {
        assertEquals("POLICE_HIDDEN",
                AlertMapper.wazeRenderableType("POLICE", "POLICE_HIDING"));
    }

    @Test
    public void mobileCameraNormalizesToHidden() {
        assertEquals("POLICE_HIDDEN",
                AlertMapper.wazeRenderableType("POLICE", "POLICE_WITH_MOBILE_CAMERA"));
    }

    @Test
    public void visiblePoliceNormalizesToVisible() {
        assertEquals("POLICE_VISIBLE",
                AlertMapper.wazeRenderableType("POLICE", "POLICE_VISIBLE"));
    }

    @Test
    public void cameraTopLevelNormalizesToHidden() {
        assertEquals("POLICE_HIDDEN",
                AlertMapper.wazeRenderableType("CAMERA", ""));
    }
}
