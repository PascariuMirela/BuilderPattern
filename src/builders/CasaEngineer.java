package builders;


import java.util.Scanner;

//director

public class CasaEngineer {
	
	private CasaBuilder casaBuilder;
	
	public CasaEngineer(CasaBuilder casaBuilder) {
		this.casaBuilder= casaBuilder;
	}
	
	
	public Casa getCasa() {
		return this.casaBuilder.getCasa();
	}
	
	public void makeCasa() {//ansamblarea obiectului produs
		
		this.casaBuilder.build_acoperis();
		this.casaBuilder.build_pereti();
		this.casaBuilder.build_geamuri();
		Scanner sc = new Scanner(System.in);
		System.out.println("Alegeti ce sa puneti la casa:");
		String str=sc.nextLine();
		
		if(str=="Copaci")
		{this.casaBuilder.build_copaci();
		
		}
		
		if(str=="Garaj")
		{this.casaBuilder.build_garaj();
		
		}
		
		if(str=="Piscina")
		{this.casaBuilder.build_piscina();
		
		}
		
		if(str=="Statui")
		{this.casaBuilder.build_statui();
		
		}
	}

}