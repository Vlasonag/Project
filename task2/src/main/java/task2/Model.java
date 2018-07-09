package task2;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	List<Integer> ListofFigures = new ArrayList<Integer>();
	private int minBarrier = 0;
	private int maxBarrier = 100;
	private int figure;
	
	public int getFigure() {
		return figure;
	}
	
	public int getMinBarrier() {
		return minBarrier;
	}
	public int getMaxBarrier() {
		return maxBarrier;
	}	
	public void setMinBarrier(int minBarrier) {
		this.minBarrier = minBarrier;
		ListofFigures.add(minBarrier);
	}
	public void setMaxBarrier(int maxBarrier) {
		this.maxBarrier = maxBarrier;
		ListofFigures.add(maxBarrier);
	}   
    public void setFigure() {
        this.figure = getRandFigure(this.minBarrier, this.maxBarrier);
    }
    public int getRandFigure(int min, int max) {
    	return ((min + 1) + (int)(Math.random() * (max - 1)));
    } 
    
}
