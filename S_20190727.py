#  
#  DB Script Tool
#  Python - 2019-07-27 11:02:51
#  
#  MODEL CLASSES FOR S DATABASE
#



# S.py -------------------------------------
from datetime import datetime, date

# 
# Python - Model Class - S.S
# 2019-07-27 11:01:04
#
class S(Object):

    #
    # Constructor
    #
    # Example: 
    # myS = S( val1, val2,.. )
    #
    def __init__(self, S = None):
        self.__S = S


    #
    # Properties
    #

    @property
    def S(self):
        return self.__S

    @S.setter
    def S(self, S):
        self.__S = S



    #
    # Methods
    #

    def __str__ (self):
        return ""