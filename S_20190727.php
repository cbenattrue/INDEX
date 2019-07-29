<?php
/* 
*  DB Script Tool
*  PHP - 2019-07-27 11:02:31
*  
*  MODEL CLASSES FOR S DATABASE
*/ 
?>



<?php 
/* S.php -------------------------------------*/
//namespace S/model; 

/* 
*  PHP - Model Class - S.S
*  2019-07-27 11:01:04
*/ 
class S {

    // private members 
    private $m_S;


    /**
    * Constructor
    * 
    * Example: 
    * $myS = new S();
    */
    public function __construct() {
        //--
    }

    /**
    * Constructor
    * 
    * Example: 
    * $myS = S::WithParams( val1, val2,.. );
    */
    public static function WithParams($S) {
        $instance = new self();
        $instance->setS($S);
        return $instance;
    }


    /**
    * Getters and Setters
    */

    public function getS() {
        return $this->m_S;
    }

    public function setS($S) {
        $this->m_S = $S;
    }



    /**
    * Methods
    */

    public function __toString() {
        return "";
    }

}
?>