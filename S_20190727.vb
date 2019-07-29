'--  
'-  DB Script Tool
'-  VB.Net (Visual Basic .Net) - 2019-07-27 11:04:04
'-  
'-  MODEL CLASSES FOR S DATABASE
'--



' S.vb -------------------------------------
Imports System

Namespace S.model 

' <summary>
' VB.Net - Model Class - S.S
' 2019-07-27 11:01:04
' </summary>
Public Class S 

    '--
    '- Constructor
    '- 
    '- Example: 
    '- Dim myS As New S 
    '--
    Public Sub New()
        '--
    End Sub

    '--
    '- Constructor
    '- 
    '- Example: 
    '- Dim myS As New S( val1, val2,.. )
    '--
    Public Sub New(ByVal S As String)
        Me.S = S
    End Sub


    '--
    '- Properties
    '--

    Public Property S As String


    '--
    '- Methods
    '--

    Public Overrides Function ToString() As String
        Return ""
    End Function

End Class

End Namespace