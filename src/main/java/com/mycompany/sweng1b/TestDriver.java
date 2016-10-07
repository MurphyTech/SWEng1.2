/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sweng1b;

import com.mycompany.sweng1.*;
import org.joda.time.*;
import java.util.*;

/**
 *
 * @author David
 */
public class TestDriver {
    
    public static void main(String args[]){
        //Defining of fictious students
        student S0 = new student("James T Kirk", 30, "08/09/2143");
        student S1 = new student("Spock", 219, "01/05/2020");
        student S2 = new student("Sherlock Holmes", 221, "12/02/1825");
        student S3 = new student("Dr John Watson", 74, "04/11/1916");
        student S4 = new student("Richard Hammond", 83, "13/07/2000");
        student S5 = new student("Captain Slowly", 45, "29/01/1886");
        student S6 = new student("Jeremy Power Clarkson", 2, "31/10/2014");
        student S7 = new student("Donold Tupee Trump", 99, "23/06/1901");
        student S8 = new student("Pinky", 17, "17/04/1778");
        student S9 = new student("The Brain", 22, "20/12/1993");    
        
        //List of all Students
        List<student> All = new ArrayList<student>();
        All.add(S0);
        All.add(S1);
        All.add(S2);
        All.add(S3);
        All.add(S4);
        All.add(S5);
        All.add(S6);
        All.add(S7);
        All.add(S8);
        All.add(S9);              
             
        //List of Engineering Students
        List<student> Eng = new ArrayList<student>();
        Eng.add(S0);
        Eng.add(S1);
        Eng.add(S2);
        Eng.add(S3);
        Eng.add(S9);
        
        //List of CS&IT Students
        List<student> CS_IT = new ArrayList<student>();
        CS_IT.add(S4);
        CS_IT.add(S5);
        CS_IT.add(S6);
        CS_IT.add(S7);
        CS_IT.add(S8);
        
        //Make Modules
        module CT416 = new module("Real Time Systems", "CT416", CS_IT);
        module CT417 = new module("Software Eng. 3", "CT417", All);
        module EE445 = new module("DSP", "EE445", Eng);
        
        //Define Start and End Dates
        LocalDate StartDate = new LocalDate(2016,9,5);
        LocalDate EndDate = new LocalDate(2017,5,31);
        
        //CS & IT modules lists
        List<module> CS_IT_modules = new ArrayList<module>();
        CS_IT_modules.add(CT416);
        CS_IT_modules.add(CT417);
        course_programme CSIT = new course_programme("CS & IT", CS_IT_modules, StartDate, EndDate);
        
        //Engineering modules list
        List<module> Eng_modules = new ArrayList<module>();
        Eng_modules.add(EE445);
        Eng_modules.add(CT417);
        course_programme ENG = new course_programme("Engineering", Eng_modules, StartDate, EndDate);
        
        //Print Student name, Modules & Courses
        CSIT.printINFO();
        ENG.printINFO();
    }
    
}
