package Classi;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import Entities.TipoEvento;
import lombok.Getter;
import lombok.Setter;




	
	@Entity
	@Table(name = "Evento")
	@Getter
	@Setter
	public class Evento {
		@Id 
		@GeneratedValue 
		private UUID id;		
		private String titolo;
		private LocalDate dataEvento;
		private String descrizione;
		@Enumerated(EnumType.STRING)
		private TipoEvento tipoEvento;
		private int numeroMassimoPartecipanti;
		
		
		public Evento () {}	
		
		public Evento ( String _titolo, String _dataEvento, String _descrizione, TipoEvento _tipoEvento, int _numeroMassimoPartecipanti) {
			
		this.titolo = _titolo;
		this.dataEvento = LocalDate.parse(_dataEvento);
		this.descrizione = _descrizione;
		this.tipoEvento = _tipoEvento;
		this.numeroMassimoPartecipanti = _numeroMassimoPartecipanti;
		
		
		}

}

