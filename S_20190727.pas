//  
//  DB Script Tool
//  Delphi - 2019-07-27 11:04:08
//  
//  MODEL CLASSES FOR S DATABASE
//



(* TS.pas -------------------------------------*)
unit TSUnit;

interface

uses
    Classes, System.DateUtils;

/// <summary>
///  Delphi - Model Class - TS
///  2019-07-27 11:01:04
/// </summary>
type
    TS = class(TObject)

    private
    S : String;

    public
        //default constructor
        //constructor Create; overload; override;
        constructor Create(m_S: String);
    property S : String read GetS write SetS;
        function ToString : String;
    end;

//const
//    CONST_SAMPLE = 1;  // Integer constant

//var
//    var_sample: Integer;

implementation

uses
    System.SysUtils, System.DateUtils, System.StrUtils;

// -----------------------
// Constructor
// Example: 
// myS : TS;
// myS := TS.Create;
// -----------------------
//constructor TS.Create;
//begin
    //--
//end;


// -----------------------
// Constructor
// Example: 
// myS : TS;
// myS := TS.Create( val1, val2,.. );
// -----------------------
constructor TS.Create(m_S: String);
begin
        self.S := m_S;
end;


// --
// Getters and Setters
// --

function TS.GetS : String;
begin
    Result := self.S;
end;

procedure TS.SetS(m_S : String);
begin
    self.S := m_S;
end;



// --
// Methods
// --

// Get a description string from this object
function S.ToString : String;
begin
    Result := '';
end;

end. // end of the unit