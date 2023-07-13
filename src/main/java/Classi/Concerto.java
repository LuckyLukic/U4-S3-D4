package Classi;

import javax.persistence.Entity;
import javax.persistence.Table;

import Entities.Genere;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Concerto")
@Getter
@Setter


public class Concerto extends Evento{
	
	private Genere genere;
	private boolean inStreaming;
	
	public Concerto () {}	
	
	public Concerto(Genere genere, boolean inStreaming) {
		super();
		this.genere = genere;
		this.inStreaming = inStreaming;
	}
	
	

}
