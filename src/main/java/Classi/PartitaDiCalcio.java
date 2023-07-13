package Classi;

import javax.persistence.Column;
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
	
	@Column(name = "Squadra di Casa")
	private String squadraDiCasa;
	@Column(name = "Squadra Ospite")
	private String ospite;
	@Column(name = "Squadra Vincente")
	private String squadraVincente;
	@Column(name = "Gol in Casa")
	private int golCasa;
	@Column(name = "Gol Ospiti")
	private int golOspite;
	
	public PartitaDiCalcio(String squadraDiCasa, String ospite, String squadraVincente, int golCasa, int golOspite) {
	
		this.squadraDiCasa = squadraDiCasa;
		this.ospite = ospite;
		this.squadraVincente = squadraVincente;
		this.golCasa = golCasa;
		this.golOspite = golOspite;
	}
	
	
	

}
