package example
import org.scalatest._
import chisel3._
import chiseltest._ 
class norgatetest extends FreeSpec with ChiselScalatestTester{
      "NOR Gate Test" in {
            test(new norgate()){ c =>
            c.io.a.poke(1.U)
            c.io.b.poke(0.U)
            c.clock.step(1)
            c.io.c.expect(0.U)
            }
      }
}
