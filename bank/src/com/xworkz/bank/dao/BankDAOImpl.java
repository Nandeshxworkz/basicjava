package com.xworkz.bank.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.bank.entity.BankEntity;


public class BankDAOImpl implements BankDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager = null;
	@Override
	public boolean save(BankEntity entity) {
		 try {
		manager = factory.createEntityManager();
				EntityTransaction tx = manager.getTransaction();
				tx.begin();
				manager.persist(entity);
				tx.commit();
				manager.close();
				factory.close();
			} catch (PersistenceException e) {
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public BankEntity findById(int id) {
		try {
			manager = factory.createEntityManager();
			BankEntity entity = manager.find(BankEntity.class, id);
			 System.out.println("id found :"+id);
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
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			BankEntity entity = manager.find(BankEntity.class, id);
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
		try {
			manager = factory.createEntityManager();
		EntityTransaction tx =	manager.getTransaction();
		tx.begin();
		
		BankEntity entity=manager.find(BankEntity.class, id);
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

