package com.devsuperior.myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.myfirstproject.entities.Category;
import com.devsuperior.myfirstproject.repositories.CategoryRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner{

	@Autowired
	private  CategoryRepository categoriRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Books");
		
		categoriRepository.save(cat1);
		categoriRepository.save(cat2);
	}

}
