package com.library.management;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.bean.Login;
import com.library.management.bean.Student;


@SpringBootApplication
@RestController

public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}
       @CrossOrigin(origins = "*")
	   @RequestMapping(value = "/",method=RequestMethod.POST)
	   public List<Student> hello(@RequestBody Login l) {
		  System.out.println(l.getUserId());
		   Student s1 = new Student("pooja","mumbai");
		   Student s2 = new Student("Ram","Delhi");
		   List<Student> l1 = new ArrayList<Student>();
		   l1.add(s1);
		   l1.add(s2);
		   
	      return l1;
	   }
}
