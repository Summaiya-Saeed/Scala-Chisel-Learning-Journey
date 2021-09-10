package lab1
import chiseltest._
import org.scalatest._
import chisel3._


import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class countertest extends FreeSpec with ChiselScalatestTester{
    "counter test" in { 
        test(new Counter(4.U)){ c =>
        
        c.clock.step(30)
        }
    }

}