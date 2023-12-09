package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1,"Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2,"Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(3,"Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Clientes-PU");
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
    
		
		System.out.println("Pronto !");
		
	}

}
