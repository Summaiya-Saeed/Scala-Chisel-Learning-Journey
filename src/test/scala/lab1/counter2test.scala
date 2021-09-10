package lab1
import chiseltest._
import org.scalatest._
import chisel3._


import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class counter2test extends FreeSpec with ChiselScalatestTester{
    "counter2 test" in { 
        test(new Counter2(3,3)){ c =>
        
        c.clock.step(30)
        }
        
    }

}