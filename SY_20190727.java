/* 
*  DB Script Tool
*  Java - 2019-07-27 10:59:57
*  
*  MODEL CLASSES FOR SY DATABASE
*/ 



/* SY.java -------------------------------------*/
package com.package.SY.model; 

import java.util.*;
import java.sql.*;
import java.text.*;

/* 
*  Java - Model Class - SY.SY
*  2019-07-27 10:57:35
*/ 
public class SY {

    // private members 
    private String m_SY;


    /**
    * Constructor
    * 
    * Example: 
    * SY mySY = new SY();
    */
    public SY() {
        //--
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