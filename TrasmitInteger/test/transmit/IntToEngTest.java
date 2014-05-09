package transmit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import transmit.IntToEng;

public class IntToEngTest {

	@Test
	public void translateEng���\�b�h���e�X�g() {
		IntToEng ite = new IntToEng();
		String expected1 = "twenty one";
		String actual1 = ite.translateEng(21);
		assertThat(actual1,is(expected1));
	}
	/*
	@Test
	public void translateEng���\�b�h���e�X�g�Q�P���̐�() {
		IntToEng ite = new IntToEng();
		String expected1 = "one";
		String actual1 = ite.translateEng(1);
		assertThat(actual1,is(expected1));
	}*/

}
