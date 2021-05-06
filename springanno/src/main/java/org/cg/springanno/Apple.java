package org.cg.springanno;

import org.springframework.stereotype.Component;

@Component
public class Apple implements Mobile{
    String color;
    
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void specification() {
		System.out.println("Apple has octa core processor and 20GB RAM");
		
	}

}
