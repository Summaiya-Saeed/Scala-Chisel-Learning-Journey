package example
import org.scalatest._
import chisel3._
import chiseltest._ 
class AndgateTest extends FreeSpec with ChiselScalatestTester{
      "And Gate Test" in {
            test(new Andgate()){ c =>
            c.io.a.poke(1.U)
            c.io.b.poke(0.U)
            c.clock.step(1)
            c.io.c.expect(0.U)
            }
      }
}
