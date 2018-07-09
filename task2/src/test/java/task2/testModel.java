package task2;

import org.junit.Assert;
import org.junit.Test;

public class testModel {

	Model model = new Model();
	
	@Test
	public void testgetRandFigure() {
		for(int i = 0; i < 100000; i++) {
			if((0 < model.getRandFigure(0, 100)) 
					&& ((model.getRandFigure(0, 100) > 100))) {
				Assert.fail();
				}
		}
	}
}
