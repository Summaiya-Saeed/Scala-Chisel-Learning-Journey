package example
import org.scalatest._
import chisel3._
import chiseltest._ 
class muxtest extends FreeSpec with ChiselScalatestTester{
      "Mux Test" in {
            test(new mux()){ c =>
            c.io.a.poke(1.U)
            c.io.b.poke(0.U)
            c.io.sel.poke(1.U)
            c.clock.step(1)
            c.io.out.expect(0.U)
            }
      }
}
