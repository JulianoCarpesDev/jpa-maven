package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
	
		/* inserindo dados 
		 * Pessoa p1= new Pessoa(null,"Juliano" , "J@C.gmail.com");
		Pessoa p2= new Pessoa(null,"Vanessa" , "V@C.gmail.com");
		Pessoa p3= new Pessoa(null,"Rafael" , "R@C.gmail.com");
		Pessoa p4= new Pessoa(null,"Lucas" , "L@C.gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("juliano-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.getTransaction().commit();
		System.out.println("Pronto");
		em.close();
		emf.close();*/
		
		// buscando dados
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("juliano-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class,3);
		
		System.out.println(p);
		System.out.println("Pronto");
		em.close();
		emf.close();*/
		//excluindo dados
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("juliano-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class,1);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Usuario: " + p + "Removido com sucesso!");
		System.out.println("Pronto");
		em.close();
		emf.close();

	}

}
