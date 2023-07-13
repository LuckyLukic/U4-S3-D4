package Classi;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	
	@Enumerated(EnumType.STRING)
	private Persona setAtleti;
	@Enumerated(EnumType.STRING)
	private Persona vincitore;
	
	public GaraDiAtletica(Persona setAtleti, Persona vincitore) {
		super();
		this.setAtleti = setAtleti;
		this.vincitore = vincitore;
	}
	
	

}
