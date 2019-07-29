//  
//  DB Script Tool
//  Java Hibernate - 2019-07-27 11:04:16
//  
//  MODEL CLASSES FOR S DATABASE
//



/* S.java (Hibernate)--------------*/
package com.package.S.model; 

import java.sql.*;
import java.util.List;
//import java.util.*;
import java.text.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/* 
*  Java Hibernate - Model Class - S.S
*  2019-07-27 11:01:04
*/ 
@Entity
@Table(name = "S")
public class S {

    // fields
	@Column(name = "S", unique  = true, nullable  = false)
    private String m_S;




    /**
    * Constructor
    * 
    * Example: 
    * S myS = new S();
    */
    public S() {
        // empty constructor
    }

    /**
    * Constructor
    * 
    * Example: 
    * S myS = new S( val1, val2,.. );
    */
    public S(String S) {
        this.setS(S);
    }


    /**
    * Getters and Setters
    */

    public String getS() {
        return this.m_S;
    }

    public void setS(String S) {
        this.m_S = S;
    }




    /**
    * Methods
    */

    @Override
    public String toString() {
        return "";
    }

}