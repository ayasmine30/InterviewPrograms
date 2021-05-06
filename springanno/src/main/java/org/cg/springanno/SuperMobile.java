package org.cg.springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SuperMobile {

	@Autowired
	@Qualifier("apple")
	Mobile mble;

	public Mobile getMble() {
		return mble;
	}

	public void setMble(Mobile mble) {
		this.mble = mble;
	}
	
	public void getMobile() {
		mble.specification();
	}
	
}
