package lab1
import org.scalatest._
import chisel3._
import chiseltest._ 
class  task2countertest extends FreeSpec with ChiselScalatestTester{
      "up and down Test" in {
            test(new task2counter(3)){ c =>
            c.io.reload.poke(true.B)
            c.clock.step(20)
            
            }
      }
}
