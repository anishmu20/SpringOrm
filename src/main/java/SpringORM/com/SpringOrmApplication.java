package SpringORM.com;

import SpringORM.com.entites.*;
import SpringORM.com.repositories.CategoryRepo;
import SpringORM.com.repositories.ProductRepo;
import SpringORM.com.repositories.StudentRepo;
import SpringORM.com.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class SpringOrmApplication  implements CommandLineRunner {

	@Autowired
	UserService userService;
	Logger logger= LoggerFactory.getLogger(SpringOrmApplication.class);

	@Autowired
	StudentRepo studentRepo;

	public static void main(String[] args) {

		SpringApplication.run(SpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setAge(43);
//		user.setName("bosch");
//		user.setCity("new york");
//
//		User saved = userService.save(user);
//		logger.info("Saved user details {} " ,saved);

//		   Student student= new Student();
//		   student.setStudent_id(103);
//		   student.setStudent_name("anil");
//		   student.setAbout("i am software engineer");
//
//		Address a1= new Address();
//		a1.setStudent(student);
//		a1.setAddress_id(500);
//		a1.setStreet("38/no");
//		a1.setCity("Mysuru");
//		a1.setCountry("India");
//
//		Address a2= new Address();
//		a2.setStudent(student);
//		a2.setAddress_id(501);
//		a2.setStreet("34/no");
//		a2.setCity("Mandya");
//		a2.setCountry("India");
//
//		ArrayList<Address> ad = new ArrayList<>();
//		ad.add(a1);
//		ad.add(a2);
//
//		student.setAddressList(ad);
//		studentRepo.save(student);

		Product product1 = new Product();
		product1.setPid("pid1");
		product1.setPname("iphone 14 pro max");
		Product product2 = new Product();
		product2.setPid("pid2");
		product2.setPname("samsung s24 ultr3");
		Product product3 = new Product();
		product3.setPid("pid3");
		product3.setPname("LG Tv");
		Category category1 = new Category();
		category1.setCid("cid1");
		category1.setCname("electronics");
		List<Product> products = category1.getProducts();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		Category category2 = new Category();
		category2.setCid("cid2");
		category2.setCname("mobiles");
		List<Product> productss = category2.getProducts();
		productss.add(product1);
		productss.add(product2);
		categoryRepo.save(category1);
		categoryRepo.save(category2);















		Category cid1 = categoryRepo.findById("cid1").get();
		System.out.println(cid1.getProducts().size());

		Product pid3 = productRepo.findById("pid3").get();
		System.out.println(pid3.getCategories().size());


	}

	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ProductRepo productRepo ;

}
