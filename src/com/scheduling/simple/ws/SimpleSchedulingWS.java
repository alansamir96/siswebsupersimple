/*
 * SimpleSchedulingWS.java
 */
package com.scheduling.simple.ws;

import com.scheduling.simple.model.MyClass;
import com.scheduling.simple.model.Student;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class SimpleSchedulingWS {

    private final SimpleSchedulingResource resource = new SimpleSchedulingResource();

    /**
     * Creates a new student.
     * @param studId Integer
     * @param lastName String
     * @param firstName String
     * @return
     */
    public Student createStudent(@WebParam(name = "studId") int studId,
            @WebParam(name = "lastName") String lastName,
            @WebParam(name = "firstName") String firstName)
            {
        return resource.createStudent(studId, lastName, firstName);
    }

    public MyClass createClass(@WebParam(name = "code") String code,
            @WebParam(name = "title") String title,
            @WebParam(name = "description") String description)
            {
        return resource.createMyClass(code, title, description);
    }
    /**
     * Return a student based on its studId.
     * @param studId Integer
     * @return
     */
    public Student retStudent(@WebParam(name="studId")int studId)
    {
        return resource.retStudent(studId);
    }

    public Student retStudent(@WebParam(name="lastName")int lastName)
    {
        return resource.retStudent(lastName);
    }

    public MyClass retClass(@WebParam(name = "code") String code)
    {
        return resource.retClass(code);
    }

    public Student EditStudent(@WebParam(name = "studId") int studId ,
            @WebParam(name = "lastName") String lastName,
            @WebParam(name = "firstName") String firstName)
            {
        return resource.EditStudent(studId, lastName, firstName);
    }

    public MyClass EditClass(@WebParam(name = "code") String code ,
            @WebParam(name = "title") String lastName,
            @WebParam(name = "description") String description)
            {
        return resource.EditClass(code, code, description);
    }

    public boolean DeleteStud(@WebParam(name = "studId") int studId)
    {
        return resource.DeleteStud(studId);
    }
    public boolean DeleteClass(@WebParam(name = "code") String code)
    {
        return resource.DeleteClass(code);
    }

    public Student showStudents()
    {
        return resource.showStudents();
    }

    public MyClass showClass()
    {
        return resource.showClass();
    }

    public void studToClass(@WebParam(name = "code")String code)
    {
        resource.studToClass(code);
    }

    public void classToStud(@WebParam(name = "studId")int studId)
    {
        resource.classToStud(studId);
    }

    public MyClass showClassStudent()
    {
        return resource.showClassStudent();
    }

    public Student showStudentClass()
    {
        return resource.showStudentClass();
    }
    // add more methods to createClass, registerStudentToClass
}
