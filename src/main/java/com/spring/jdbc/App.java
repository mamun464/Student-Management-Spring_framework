package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/dbcConfig.xml");
        StudentDao stdDao=context.getBean("Std_xml",StudentDao.class);
        
        
        Student std =new Student();
        std.setId(168685);
        std.setName("sabab");
        std.setCity("Jamalpur");
        int result=stdDao.insert(std);
        System.out.println("Update Student info Row: "+result);
    }
    
}
