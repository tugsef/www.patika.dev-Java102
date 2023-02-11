package insuranceSystem;

import java.util.Comparator;

import insuranceSystem.account.AbstractAccount;

public class OrderId implements Comparator<AbstractAccount>{

	@Override
	public int compare(AbstractAccount o1, AbstractAccount o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

	

}
