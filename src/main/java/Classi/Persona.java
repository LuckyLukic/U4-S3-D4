package Classi;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import Entities.Sesso;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Persona")
@Getter
@Setter
@NoArgsConstructor


public class Persona {
	
	@Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataNascita;
    @Enumerated(EnumType.STRING)
    private Sesso sesso;
    
    @ManyToMany
    private Set<GaraDiAtletica> gara;

    public Persona (String nome, String cognome, String email, LocalDate dataNascita, Sesso sesso) {

        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
        
    
    }


}
