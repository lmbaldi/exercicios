package observer;

import java.util.Date;

public class ChegadaAniversarianteEvent {

	private final Date horadaDaChega;

	public ChegadaAniversarianteEvent(Date horadaDaChega) {
		super();
		this.horadaDaChega = horadaDaChega;
	}

	public Date getHoradaDaChega() {
		return horadaDaChega;
	}
	
	
	
}
