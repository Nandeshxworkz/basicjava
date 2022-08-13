package com.xworkz.pub.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.pub.Entity.PubEntity;

public class PubDAOImpl implements PubDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(PubEntity entity) {

		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
			factory.close();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public PubEntity findById(int id) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			PubEntity entity = manager.find(PubEntity.class, id);
			// System.out.println("id found :"+id);
			if (entity != null) {
				System.out.println("findByid :" + entity);
				return entity;
			} else {
				System.err.println("data not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateNameAndLocationById(String newName, String newLocation, int id) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			PubEntity entity = manager.find(PubEntity.class, id);
			entity.setName(newName);
			entity.setLocation(newLocation);
			manager.merge(entity);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
	}

	@Override
	public void deleteById(int id) {
      EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
		EntityTransaction tx =	manager.getTransaction();
		tx.begin();
		
		PubEntity entity=manager.find(PubEntity.class, id);
		manager.remove(entity);
		tx.commit();
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}

	}

}
