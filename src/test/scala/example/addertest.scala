package example
import org.scalatest._
import chisel3._
import chiseltest._ 
class addertest extends FreeSpec with ChiselScalatestTester{
      "xor Gate Test" in {
            test(new adder()){ c =>
            c.io.a.poke(1.U)
            c.io.b.poke(1.U)
            c.clock.step(1)
            c.io.c.expect(0.U)
            c.io.d.expect(1.U)
            }
      }
}

