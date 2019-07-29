/* 
*  DB Script Tool
*  Swift - 2019-07-27 11:04:12
*  
*  MODEL CLASSES FOR S DATABASE
*/ 



/* SModel.swift (for SQLite.swift)-------------------------*/
import Foundation 

/* 
*  Swift - Model Class - S.S
*  2019-07-27 11:01:04
*/ 
class SModel { 

   // members 
   var S: String = ""


   /**
   * Constructor
   * 
   * Example: 
   * var myS = SModel()
   */
   init() {}

   /**
   * Constructor
   * 
   * Example: 
   * var myS = SModel( label1: val1, label2: val2,.. )
   */
   init(S: String) {
       self.S = S
   }


   /**
   * Methods
   */

   func toString() -> String {
       return ""
   }

}