//  
//  DB Script Tool
//  Android ORMLite - 2019-07-27 10:59:52
//  
//  MODEL CLASSES FOR SY DATABASE
//



/* SY.java (Android ORMLite)--------------*/
package com.package.SY.model; 

import java.util.*;
import java.sql.*;
import java.text.*;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/* 
*  Android ORMLite - Model Class - SY.SY
*  2019-07-27 10:57:35
*/ 
@DatabaseTable(tableName = "SY")
public class SY {

    // names
    public static final String SY_FIELD_NAME = "SY";

    // fields
    @DatabaseField(columnName = SY_FIELD_NAME, dataType = DataType.LONG_STRING, canBeNull = false)
    private String m_SY;



    /**
    * Constructor
    * 
    * Example: 
    * SY mySY = new SY();
    */
    public SY() {
        // all ORMLite classes must define a no-arg constructor with at least package visibility
    }

    /**
    * Constructor
    * 
    * Example: 
    * SY mySY = new SY( val1, val2,.. );
    */
    public SY(String SY) {
        this.setSY(SY);
    }


    /**
    * Getters and Setters
    */

    public String getSY() {
        return this.m_SY;
    }

    public void setSY(String SY) {
        this.m_SY = SY;
    }




    /**
    * Methods
    */

    @Override
    public String toString() {
        return "";
    }

}