package died.guia05;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RegistroViajes {

	private Set<Pasaje> pasajes;
	
	public void linkedHashSet(){
		
		if(this.pasajes == null || this.pasajes.isEmpty()) this.pasajes = new LinkedHashSet<>();
		else this.pasajes = new LinkedHashSet<>(this.pasajes);
	}
	public void agregar(Pasaje p) {
		 this.pasajes.add(p);
	}
	
	public void listarViajes() {
		int index =0;
		this.pasajes = new TreeSet<>(this.pasajes);
		for(Pasaje p: pasajes) {
			 System.out.println("#"+ ++index+": "+p.toString());
		}
		
		
	}
	
	
}
