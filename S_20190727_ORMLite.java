//  
//  DB Script Tool
//  Android ORMLite - 2019-07-27 11:02:57
//  
//  MODEL CLASSES FOR S DATABASE
//



/* S.java (Android ORMLite)--------------*/
package com.package.S.model; 

import java.util.*;
import java.sql.*;
import java.text.*;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/* 
*  Android ORMLite - Model Class - S.S
*  2019-07-27 11:01:04
*/ 
@DatabaseTable(tableName = "S")
public class S {

    // names
    public static final String S_FIELD_NAME = "S";

    // fields
    @DatabaseField(columnName = S_FIELD_NAME, dataType = DataType.LONG_STRING, canBeNull = false)
    private String m_S;



    /**
    * Constructor
    * 
    * Example: 
    * S myS = new S();
    */
    public S() {
        // all ORMLite classes must define a no-arg constructor with at least package visibility
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