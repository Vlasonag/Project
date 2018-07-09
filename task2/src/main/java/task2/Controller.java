package task2;

import java.util.Scanner;

public class Controller {
        private Model model;
        private View view;    

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setFigure();
        view.printMessage(View.INPUT_INT_DATA + View.LEFT_BARRIER + model.getMinBarrier() + 
        						View.COMMA + model.getMaxBarrier() + View.RIGHT_BARRIER);    
        checkFigure(sc);
        for(int i = 0; i < model.ListofFigures.size(); i++) {
        	view.printMessage(View.TRY_NUMBER + (i + 1) + " = " + model.ListofFigures.get(i) + " ");
        }       
    }

        // The Utility methods
    

    

    public void checkFigure(Scanner sc) {
    	int res = 0;
    	while(true) {
	        while(!sc.hasNextInt()) {
	            view.printMessage(View.WRONG_INPUT_DATA);
	            view.printMessage(View.INPUT_INT_DATA + View.LEFT_BARRIER + model.getMinBarrier() + 
						View.COMMA + model.getMaxBarrier() + View.RIGHT_BARRIER);            
	            sc.next();
	        } 
	        res = sc.nextInt();
	        if (res <= model.getMinBarrier() || res >= model.getMaxBarrier()) { 
	        	view.printMessage(View.WRONG_RANGE_DATA);
	            view.printMessage(View.INPUT_INT_DATA + View.LEFT_BARRIER + model.getMinBarrier() + 
						View.COMMA + model.getMaxBarrier() + View.RIGHT_BARRIER);
	        } 
	        else if(res < model.getFigure()) {
	            	model.setMinBarrier(res);
	            	view.printMessage(View.WRONG_FIGURE);
	            	view.printMessage(View.INPUT_INT_DATA + View.LEFT_BARRIER + model.getMinBarrier() + 
	    					View.COMMA + model.getMaxBarrier() + View.RIGHT_BARRIER);
	            } 
	        else if(res > model.getFigure()) {
	        	model.setMaxBarrier(res);
	        	view.printMessage(View.WRONG_FIGURE);
	        	view.printMessage(View.INPUT_INT_DATA + View.LEFT_BARRIER + model.getMinBarrier() + 
						View.COMMA + model.getMaxBarrier() + View.RIGHT_BARRIER);
	        } 
	        else if(res == model.getFigure()) {
	        	view.printMessage(View.CONGRUTILATIONS);   
	        	break;
	        } 
    	} 
    } 
} 