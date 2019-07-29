<?php
/* 
*  DB Script Tool
*  PHP - 2019-07-27 10:59:41
*  
*  MODEL CLASSES FOR SY DATABASE
*/ 
?>



<?php 
/* SY.php -------------------------------------*/
//namespace SY/model; 

/* 
*  PHP - Model Class - SY.SY
*  2019-07-27 10:57:35
*/ 
class SY {

    // private members 
    private $m_SY;


    /**
    * Constructor
    * 
    * Example: 
    * $mySY = new SY();
    */
    public function __construct() {
        //--
    }

    /**
    * Constructor
    * 
    * Example: 
    * $mySY = SY::WithParams( val1, val2,.. );
    */
    public static function WithParams($SY) {
        $instance = new self();
        $instance->setSY($SY);
        return $instance;
    }


    /**
    * Getters and Setters
    */

    public function getSY() {
        return $this->m_SY;
    }

    public function setSY($SY) {
        $this->m_SY = $SY;
    }



    /**
    * Methods
    */

    public function __toString() {
        return "";
    }

}
?>