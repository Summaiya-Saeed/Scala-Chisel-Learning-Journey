package example
import org.scalatest._
import chisel3._
import chiseltest._ 
class nandgatetest extends FreeSpec with ChiselScalatestTester{
      "And Gate Test" in {
            test(new nandgate()){ c =>
            c.io.a.poke(1.U)
            c.io.b.poke(0.U)
            c.clock.step(1)
            c.io.c.expect(1.U)
            // c.io.d.expect(1.U)
            }
      }
}
