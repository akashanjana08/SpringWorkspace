package constructorinject;

import java.util.List;

public class Restaurent {
	
	Tea tea;
	
	/*public Restaurent(Tea tea) {
		// TODO Auto-generated constructor stub
		this.tea = tea;
	}*/

	List<String> waiterNames;
	
	
	public void getHotTea(){
			 tea.hotTea();
	}

	public Tea getTea() {
		return tea;
	}

	public void setTea(Tea tea) {
		this.tea = tea;
	}

	public List getWaiterNames() {
		return waiterNames;
	}

	public void setWaiterNames(List waiterNames) {
		this.waiterNames = waiterNames;
	}
	
	public void init()
	{
		System.out.println("Restautent Init method call");
	}
	
	public void destroy()
	{
		System.out.println("Restautent destroy method call");
	}
	
	
}
