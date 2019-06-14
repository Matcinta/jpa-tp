import domain.Address;
import domain.Contact;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("digi-book-jpa");

        EntityManager em = emf.createEntityManager();

        /* em.getTransaction().begin();
        Contact contact = new Contact();
        contact.setEmail("toto@titi.fr");
        em.persist(contact);

        em.getTransaction().commit();

        Contact contact = em.find(Contact.class, 2L);
        System.out.println(contact);*/

        /* // Supprimer une entrée, un objet
        em.getTransaction().begin();
        Contact contact = em.find(Contact.class, 2L);
        em.remove(contact);
        em.getTransaction().commit();*/


        em.getTransaction().begin();

        Contact contact = new Contact();
        contact.setEmail("lisa@simpson.fr");
        contact.setFirstName("Lisa");
        contact.setAddress(new Address("1 rue de la Soif - 44000 Nantes"));
        em.persist(contact);

        em.getTransaction().commit();


        em.close();
        emf.close();

    }


}
