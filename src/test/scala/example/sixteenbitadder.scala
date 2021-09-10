package example
import org.scalatest._
import chisel3._
import chiseltest._ 
class sixteenbitaddertest extends FreeSpec with ChiselScalatestTester{
      "xor Gate Test" in {
            test(new sixteenbitadder()){ c =>
            c.io.a.poke(16.U)  //in binary (b101.U)
            c.io.b.poke(1.U)
            c.clock.step(1)

            c.io.c.expect(17.U)
      
            }
      }
}

