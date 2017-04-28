/*
 * SimpleSchedulingResource.java
 */
package com.scheduling.simple.ws;

import com.scheduling.simple.model.MyClass;
import com.scheduling.simple.model.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class SimpleSchedulingResource
{

    private Map<Integer, Student> studentsMap;
    private Map<String, MyClass> classMap;
    Scanner sc = new Scanner(System.in);

    public SimpleSchedulingResource()
    {
        studentsMap = new HashMap<Integer, Student>();
        classMap = new HashMap<String, MyClass>();
    }

    public Student createStudent(int studId, String lastName, String firstName)
    {
        // TODO validate input data
        Student student = new Student(studId, lastName, firstName);
        studentsMap.put(studId, student);

        return student;
    }

    public MyClass createMyClass(String code,String title,String description)
    {
        MyClass clase=new MyClass(code,title,description);
        classMap.put(code, clase);
        return clase;
    }

    public Student retStudent(int studId)
    {
        return studentsMap.get(studId);
    }

    public Student retStudent(String lastName)
    {
        return studentsMap.get(lastName);
    }

    public MyClass retClass(String code)
    {
        return classMap.get(code);
    }

    public Student EditStudent(int studId,String lastName,String firstName )
    {
        Student s=retStudent(studId);
        if(s!=null)
        {
            s.setFirstName(firstName);
            s.setLastName(lastName);
        }
        return s;
    }

    public MyClass EditClass(String code,String title, String description)
    {
        MyClass c=retClass(code);
        if(c!=null)
        {
            c.setDescription(description);
            c.setTitle(title);
        }
        return c;
    }

    public boolean DeleteStud(int studId)
    {
        return studentsMap.remove(studId)!=null;
    }

    public boolean DeleteClass(String code)
    {
        return classMap.remove(code)!=null;
    }

    public Student showStudents()
    {
        for(int i=0; i<studentsMap.size(); i++)
        {
            System.out.println(studentsMap.values().toArray()[i]);
        }
        return (Student) studentsMap;
    }

    public MyClass showClass()
    {
        for(int i=0;i<classMap.size();i++)
        {
            System.out.println(classMap.values().toArray()[i]);
        }
        return (MyClass) classMap;
    }

    public void studToClass(String code)
    {
        MyClass c=retClass(code);
        if(c!=null)
        {
           int studId;
           String lastName,firstName;
           System.out.println("Id");
           studentId=sc.nextInt();
           System.out.println("lastName");
           lastName=sc.next();
           System.out.println("firstName");
           firstName=sc.next();
           Student s=createStudent(studId,lastName,firstName);
           c.addStudent(s);
        }
    }
    public void classToStud(int studId)
    {
        Student s=retStudent(studId);
        if(s!=null)
        {
           String code,title,description;
           System.out.println("code");
           code=sc.next();
           System.out.println("title");
           title=sc.next();
           System.out.println("description");
           description=sc.next();
           MyClass c=createMyClass(code,title,description);
           s.addClass(c);
        }
    }

    public MyClass showClassStudent()
    {
        for(int i=0;i<studentsMap.size();i++)
        {
            System.out.println(studentsMap.values().toArray()[i]);
        }
        return (MyClass) studentsMap;
    }

    public Student showStudentClass()
    {
        for(int i=0;i<classMap.size();i++)
        {
            System.out.println(classMap.values().toArray()[i]);
        }
        return (Student) classMap;
    }

}
