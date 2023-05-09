package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlteraUsuario1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario	 = em.find(Usuario.class, 4L);
		usuario.setNome("Lima");
		usuario.setEmail("lima@lanche.com.br");
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
