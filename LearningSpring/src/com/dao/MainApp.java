package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beansdao.xml");
        StudentDAOImp studentDAOImp = (StudentDAOImp) context.getBean("studentDAOImp");

        System.out.println("------Records Creation -----");
        studentDAOImp.create("Jack", 26);
        studentDAOImp.create("Chris" , 29);
        studentDAOImp.create("Paul", 32);

        System.out.println("------Listing Multiple Records-----");
        List<Student> students = studentDAOImp.listStudents();
        for (Student s: students) {
            System.out.print("ID : " + s.getId());
            System.out.print(", Name : " + s.getName());
            System.out.println(", Age : " + s.getAge());
        }

        System.out.println("-----Updating Record with ID = 2 ------");
        studentDAOImp.update(2, 20);

        System.out.println("-----Listing Record with ID = 2 ------");
        Student student = studentDAOImp.getStudent(2);
        System.out.print("ID : " + student.getId());
        System.out.print(", Name : " + student.getName());
        System.out.println(", Age : " + student.getAge());
    }
}
