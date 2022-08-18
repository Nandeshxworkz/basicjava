package com.xworkz.cartoon.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.util.Factory;

public class CartoonDAOImpl implements CartoonDAO {

	EntityManagerFactory factory = Factory.getFactory();

	@Override
	public boolean save(List<CartoonEntity> entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (CartoonEntity cartoonEntity : entity) {
				manager.persist(cartoonEntity);

			}

			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public CartoonEntity findByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nme", name);
			Object obj = query.getSingleResult();
			if (obj != null) {
				CartoonEntity cartoon = (CartoonEntity) obj;
				return cartoon;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Integer total() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("total");

			Object count = query.getSingleResult();
			System.out.println(count);
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonEntity findByMaxCreatedDate() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByMaxCreatedDate");
			Object obj = query.getSingleResult();
		    System.out.println("findByMaxCreatedDate :-"+obj);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			query.setParameter("nme", name);
			query.setParameter("cnt", country);
			query.setParameter("gn", gender);
			query.setParameter("at", author);

			Object obj = query.getSingleResult();
			if (obj != null) {
				CartoonEntity cartoon = (CartoonEntity) obj;
				return cartoon;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public String findAuthorByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAuthor");
			query.setParameter("nme", name);
			Object obj = query.getSingleResult();
			if (obj != null) {
				String cartoon = (String) obj;
				return cartoon;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findnameAndcountry");
			query.setParameter("at", author);
			Object obj = query.getSingleResult();
				Object[] cartoon = (Object[]) obj;
				return cartoon;
			

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public LocalDate findCreatedDateByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findcreatedDate");
			query.setParameter("at", author);
			Object obj = query.getSingleResult();
			if (obj != null) {
				LocalDate cartoon = (LocalDate) obj;
				return cartoon;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateAuthorByName(String newAuthor, String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateAuthor");
			query.setParameter("nme", name);
			query.setParameter("at", newAuthor);			
			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}

	}

	@Override
	public void updateTypeByName(String newType, String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateTypeByName");
			query.setParameter("ty", newType);
			query.setParameter("nmt", name);
						
			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}

	}

	@Override
	public void deleteByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("nms", name);
			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}

	}

}
