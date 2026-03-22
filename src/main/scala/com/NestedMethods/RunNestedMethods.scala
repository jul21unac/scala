package com.NestedMethods

object RunNestedMethods {

    def main (args: Array[String]): Unit = {

        println( Words("Radar") )

    }

    def Words(chain: String): String = {

        def back(chain: String,rev: String) : String = {
            
            if ( chain.length() == 0)   rev
            else back(chain.substring(0,chain.length()-1),rev + chain.charAt(chain.length()-1))
            
        }
        back(chain,"")
    }
  
}
