package Classi;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table( name = "Partita di Calcio")
@Getter
@Setter
@NoArgsConstructor

public class PartitaDiCalcio extends Evento {
	
	private String squadraDiCasa;
	private String ospite;
	private String squadraVincente;
	private int golCasa;
	private int golOspite;
	
	public PartitaDiCalcio(String squadraDiCasa, String ospite, String squadraVincente, int golCasa, int golOspite) {
	
		this.squadraDiCasa = squadraDiCasa;
		this.ospite = ospite;
		this.squadraVincente = squadraVincente;
		this.golCasa = golCasa;
		this.golOspite = golOspite;
	}
	
	
	

}
