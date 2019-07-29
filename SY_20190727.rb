#  
#  DB Script Tool
#  Ruby - 2019-07-27 11:00:03
#  
#  MODEL CLASSES FOR SY DATABASE
#!/usr/bin/ruby



# SY.rb -------------------------------------
# 
# Ruby - Model Class - SY.SY
# 2019-07-27 10:57:35
#

class SY

    #attr_accessor :SY

    #
    # Constructor
    #
    # Example: 
    # mySY = SY.new( val1, val2,.. )
    #
    def initialize(m_SY)
        self.SY = m_SY
    end

    #
    # Getters and Setters
    #

    def SY # getter
        @SY
    end

    def SY=(m_SY) # setter
        @SY = m_SY
    end

    #
    # Methods
    #

    def to_s
        super + ""
        #"SY: #{@SY}"
    end

end