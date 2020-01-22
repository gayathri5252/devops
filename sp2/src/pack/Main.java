package pack;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		studentDao s1=(studentDao)ap.getBean("s");
//	int count=s1.savestudent(new student(104,"Gayi"));
		//int count=s1.updatestudent(new student(101,"Ga"));
		//int count=s1.deletestudent(new student(104));
		//System.out.println(count+"rows updated");
		List<student> list=s1.getAllStudents();
		for(student e:list)
			System.out.println(e);
			
	}

}
