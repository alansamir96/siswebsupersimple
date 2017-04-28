/*
 * Student.java
 */
package com.scheduling.simple.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.ArrayList;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student")
public class Student {

    @XmlElement(name = "studId")
    private int studId;
    @XmlElement(name = "lastName")
    private String lastName;
    @XmlElement(name = "firstName")
    private String firstName;
    // add and objetList of
    private List<MyClass> clases;
    int ultimo;

    public Student() {
        ultimo=0;
    }

    public Student(int studId, String lastName, String firstName) {
        this.studentId = studId;
        this.lastName = lastName;
        this.firstName = firstName;
        ultimo=0;
    }

    /**
     * @return the studId
     */
    public int getStudId() {
        return studId;
    }

    /**
     * @param studId the studId to set
     */
    public void setStudId(int studId) {
        this.studentId = studId;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setClass(MyClass c){
        clases.set(ultimo, c);
    }

    public MyClass getMyClass(){
        return clases.get(ultimo);
    }

    public void addClass(MyClass c){
        clases.add(c);
        ultimo++;
    }
}
