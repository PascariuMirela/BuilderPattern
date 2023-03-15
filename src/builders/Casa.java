package builders;

//concrete builder
//se definesc metode set() si get() pentru fiecare componenta 

public class Casa implements PlanCasa{
	
	String acoperis,geamuri,copaci,statui,piscina, pereti, garaj;
	
	

	
	public void set_geamuri(String geamuri) {
		this.geamuri=geamuri;
		
	}
	public String get_geamuri()
	{
		return geamuri;
		//returneaza geamuri
	}
	
	public void set_acoperis(String acoperis) {
		this.acoperis=acoperis;
		
	}
	public String get_acoperis()
	{
		return acoperis;
	}

	
	public void set_copaci(String copaci) {
		this.copaci=copaci;
		
	}
	
	public String get_copaci()
		{
			return copaci;
		}
	
	public void set_piscina(String piscina) {
		this.piscina=piscina;
		
	}
	
	public String get_piscina()
		{
			return piscina;
		}
	
	public void set_pereti(String pereti) {
		this.pereti=pereti;
		
	}
	
	public String get_pereti()
		{
			return pereti;
		}
	
	
	public void set_statui(String statui) {
		this.statui=statui;
		
	}
	public String get_statui()
		{
			return statui;
		}
	
	public void set_garaj(String garaj) {
		this.garaj=garaj;
		
	}
	public String get_garaj()
		{
			return garaj;
		}
}
