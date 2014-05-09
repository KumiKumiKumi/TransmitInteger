package transmit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import transmit.IntToEng;

public class IntToEngTest {

	@Test
	public void translateEng���\�b�h���e�X�g() {
		IntToEng ite = new IntToEng();
		String expected1 = "zero";
		String actual1 = ite.translateEng(0);
		assertThat(actual1,is(expected1));
	}

}
