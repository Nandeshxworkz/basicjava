package com.xworkz.cartoon.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;

public class CartoonRunner {
	public static void main(String[] args) {

		CartoonEntity cEntity1 = new CartoonEntity("Doraa", "Japan", "male", "nagasaki", "kids", "Sharat",
				LocalDate.of(2015, 12, 26), "Nandesh", LocalDate.of(2022, 06, 16));
		CartoonEntity cEntity2 = new CartoonEntity("Goku", "Japan", "male", "akira", "kids", "Shadow",
				LocalDate.of(2016, 12, 11), "chandrya", LocalDate.of(2021, 01, 1));
		CartoonEntity cEntity3 = new CartoonEntity("Jackie chahan", "USA", "male", "Jackie", "legend", "Sameer",
				LocalDate.of(2015, 11, 26), "kalyan", LocalDate.of(2022, 02, 16));
		CartoonEntity cEntity4 = new CartoonEntity("patlu", "India", "male", "Harvinder", "forkids", "samarth",
				LocalDate.of(2017, 03, 26), "manjunath", LocalDate.of(2020, 06, 16));
		CartoonEntity cEntity5 = new CartoonEntity("Motu", "India", "male", "harvinder", "kids", "nandan",
				LocalDate.of(2018, 12, 26), "Arjun", LocalDate.of(2022, 06, 11));
		CartoonEntity cEntity6 = new CartoonEntity("Naruto", "Japan", "male", "Burea", "kids", "Sharma",
				LocalDate.of(2015, 01, 26), "Nandesh", LocalDate.of(2022, 12, 9));
		CartoonEntity cEntity7 = new CartoonEntity("Vegeta", "Japan", "male", "gagansaki", "kids", "Sharat",
				LocalDate.of(2015, 10, 16), "Ravi", LocalDate.of(2022, 06, 16));
		CartoonEntity cEntity8 = new CartoonEntity("Gohan", "Korea", "male", "Korea", "kids", "Sharat",
				LocalDate.of(2015, 12, 26), "Nandesh", LocalDate.of(2022, 06, 16));
		CartoonEntity cEntity9 = new CartoonEntity("Heidi", "India", "Female", "India", "kids", "nandish",
				LocalDate.of(2019, 02, 02), "Nandesh", LocalDate.of(2022, 8, 16));

		CartoonDAO dao = new CartoonDAOImpl();

		List<CartoonEntity> list = new ArrayList<CartoonEntity>();
		for (int i = 5000; i > 0; i--)
			list.add(cEntity1);
		list.add(cEntity2);
		list.add(cEntity3);
		list.add(cEntity4);
		list.add(cEntity5);
		list.add(cEntity6);
		list.add(cEntity7);
		list.add(cEntity8);
		list.add(cEntity9);

//		boolean save = dao.save(list);
//		System.out.println("saved data :" + save);
//		}

//		boolean save = dao.save(list);
//		System.out.println("saved data :" + save);

//		CartoonEntity entity1=dao.findByName("Motu");
//		System.out.println(entity1);

//	     Integer inti=dao.total();
//		System.out.println(inti);

//	CartoonEntity cart =	dao.findByMaxCreatedDate();
//		System.out.println(cart);

//		CartoonEntity r	=dao.findByNameAndCountryAndGenderAndAuthor("Jackie chahan", "USA", "male", "Jackie");
//	    System.out.println(r);

//		String str=dao.findAuthorByName("Heidi");
//		System.out.println(str);

//		LocalDate ld = dao.findCreatedDateByAuthor("akira");
//		System.out.println(ld);

//		Object[] obj = dao.findNameAndCountryByAuthor("Jackie");
//		System.out.println(obj[0]);
//		System.out.println(obj[1]);

		// dao.updateAuthorByName("Sharat geeks", "Jackie chahan");
		// dao.updateTypeByName("UltraLegend", "Gohan");
		// dao.deleteByName("Vegeta");

		// dao.finAll().forEach(System.out::println);

		// dao.findAllByAuthor("nagasaki").forEach(System.out::println);

		// dao.findAllByAuthorAndGender("India","Female").forEach(System.out::println);

		// dao.findAllName().forEach(System.out::println);

		// dao.findAllCountry().forEach(System.out::println);

		// dao.findAllNameAndCountry().forEach(obj->
		// System.out.println(obj[0]+"::"+obj[1]));

		dao.findAllNameAndCountryAndAuthor()
				.forEach(obj -> System.out.println(obj[0] + ":::" + obj[1] + ":::" + obj[2]));

	}

}
