package professor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Data Access Object.
 */
public class ProfessorDao {

	//"tacs-microservice-ddd" é o nome da unidade de persistência no "persistence.xml".
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("tacs-microservice-ddd");

	public Professor salvar(Professor professor) {
		// Obter "conexão".
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		// Grava o objeto no banco de dados.
		em.merge(professor);
		em.getTransaction().commit();
		em.close();
		return professor;
	}

	public List<Professor> listar() {
		EntityManager em = emf.createEntityManager();
		//Não é SQL! É JPQL.
		String jpql = "from Professor";
		TypedQuery<Professor> query = em.createQuery(jpql, Professor.class);
		List<Professor> result = query.getResultList();
		em.close();
		return result;
	}

}
