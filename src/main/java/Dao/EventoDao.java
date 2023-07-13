package Dao;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import Classi.Concerto;
import Classi.Evento;
import Entities.Genere;

public class EventoDao {
	
	public class EventoDAO {

	    private final EntityManager em;

	    public EventoDAO(EntityManager em) {
	        this.em = em;
	    }

	    public void save(Evento s) {
	        EntityTransaction t = em.getTransaction();
	        t.begin();

	        em.persist(s);

	        t.commit();

	        System.out.println("Evento salvato correttamente");
	    }

	    public Evento findById(long id) {
	        Evento found = em.find(Evento.class, id);
	        return found;
	    }

	    public void findByIdAndDelete(UUID id) {

	        Evento found = em.find(Evento.class, id);
	        if (found != null) {

	            EntityTransaction t = em.getTransaction();

	            t.begin();

	            em.remove(found);

	            t.commit();
	            System.out.println("Evento eliminato correttamente");
	        } else {
	            System.out.println("Evento non trovato");
	        }
	    }

	    public void refresh(long id) {
	        Evento found = em.find(Evento.class, id);
	        found.setTitolo("");

	        System.out.println("PRE REFRESH");
	        System.out.println(found);

	        em.refresh(found);
	        System.out.println("POST REFRESH");
	        System.out.println(found);

	    }
	    
	    public List<Concerto> getConcertoInStreaming(boolean inStreaming) {
	        TypedQuery<Concerto> getAllQuery = em.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming = :inStreaming",
	                Concerto.class);
	        getAllQuery.setParameter("inStreaming", inStreaming);
	        return getAllQuery.getResultList();

	    }
	    
	    public List<Concerto> getConcertoPerGenere(Set<Genere> genereConcerto) {
	    	String jpql = "SELECT c FROM Concerto c WHERE c.genere IN :generiConcerto";
	        TypedQuery<Concerto> query = em.createQuery(jpql, Concerto.class);
	        query.setParameter("generiConcerto", genereConcerto);
	        return query.getResultList();

	    }
	}

}
