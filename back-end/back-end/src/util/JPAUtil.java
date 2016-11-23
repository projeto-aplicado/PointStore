package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pointstore");
	
	public EntityManager getEntityManager(){
		return this.entityManagerFactory.createEntityManager();
	}

}
