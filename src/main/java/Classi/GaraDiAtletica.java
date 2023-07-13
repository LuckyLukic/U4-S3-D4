package Classi;


import java.util.Set;


import javax.persistence.Entity;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table( name = "Gara di Atletica")
@Getter
@Setter
@NoArgsConstructor


public class GaraDiAtletica extends Evento{
	
	@ManyToMany
	//@Column(name = "Atleti")
	private Set<Persona> setAtleti;
	
    @ManyToOne
   // @Column(name = "Vincitore")
	private Persona vincitore;
	
	public GaraDiAtletica( Persona vincitore) {
		
		this.vincitore = vincitore;
	}
	
	

}
