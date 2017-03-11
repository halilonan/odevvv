package proje.medipol;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class islemTest {
	
	@Test
    public void shouldChamberInputs() {

        final islem bolme = new islem();

        float response = bolme.bolmeislemi(2,4);
        assertTrue(response == 0.5);

    }


    @Test
    public void shouldChamberInputsWithParams() {

        final islem bolme = new islem();

        float response = bolme.bolmeislemi(10, 5);
        assertTrue(response == 2);

    }
}
