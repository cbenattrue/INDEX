/* 
*  DB Script Tool
*  CSharp (C#) - 2019-07-27 11:03:56
*  
*  MODEL CLASSES FOR S DATABASE
*/



/* S.cs -------------------------------------*/
using System;

namespace S.Models 
{

    /// <summary>
    ///  C# - Model Class - S.S
    ///  2019-07-27 11:01:04
    /// </summary>
    public class S {

       /// <summary>
       ///  Constructor
       /// </summary>
       /// <example>
       ///   Example
       ///   <code>
       ///   S myS = new S();
       ///   </code>
       /// </example>
        public S() {
            //--
        }

       /// <summary>
       ///  Constructor
       /// </summary>
       /// <example>
       ///   Example
       ///   <code>
       ///   S myS = new S( val1, val2,.. );
       ///   </code>
       /// </example>
        public S(String S) {
            this.S = S;
        }


        /**
        * Properties
        */

        public String S { get; set; }



        /**
        * Methods
        */

        public override string ToString() {
            return "";
        }

    }

}