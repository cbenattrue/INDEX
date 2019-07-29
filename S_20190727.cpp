/* 
*  DB Script Tool
*  C++ - 2019-07-27 11:04:01
*  
*  MODEL CLASSES FOR S DATABASE
*/ 



/* S h / cpp -------------------------------------*/
#include <iostream>        // using IO functions
#include <string>            // using string

using namespace std; 

/* C++ - Model Class Definition - S.S */

class S {

private: 
    string m_S;

public: 
    S();
    S(string S);

    string getS() const;
    void setS(string S);

    string toString();
};

/* C++ - Model Class Implementation - S.S */

/**
* Constructor
* 
* Example: 
* S myS = new S();
*/
S::S() {
    //--
}

/**
* Constructor
* 
* Example: 
* S myS = new S( val1, val2,.. );
*/
S::S(string S) {
    this->m_S = S;
}


/**
* Getters and Setters
*/

string S::getS() const {
    return this->m_S;
}

void S::setS(string S) {
    this->m_S = S;
}



/**
* Methods
*/

string S::toString() {
    return "";
}