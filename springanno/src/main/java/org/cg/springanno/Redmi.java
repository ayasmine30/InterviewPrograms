package org.cg.springanno;

import org.springframework.stereotype.Component;

@Component
public class Redmi implements Mobile{
    String model;
    
    
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public void specification() {
		System.out.println("Redmi has snapdragon processor and 10GB RAM");
		
	}

}
