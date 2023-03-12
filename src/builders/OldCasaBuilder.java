package builders;


//concrete builder

//se definesc metode set() cu ajutorul carora se actualizeaza modificarile aparute

	public class OldCasaBuilder implements CasaBuilder{
		
		private Casa casa;
		public OldCasaBuilder() {
			this.casa=new Casa();
		}
	
	public void build_acoperis() {
			
			
			casa.set_acoperis(" ");
			
		}
	
	public void build_pereti() {
		
		
		casa.set_pereti(" ");
		
	}
	
	public void build_geamuri() {
		
		
		casa.set_geamuri(" ");
		
	}
	
	public void build_garaj() {
		
		
		casa.set_garaj(" ");
		
	}
	
	public void build_copaci() {
		
		
		casa.set_copaci(" ");
		
	}
	
	public void build_statui() {
		
		
		casa.set_statui(" ");
		
	}
	
	public void build_piscina() {
		
		
		casa.set_piscina(" ");
		
	}
	

	public Casa getCasa() {//metoda get() care intoarce o instanta a clasei Product
		return this.casa;
	}
	
	
}
