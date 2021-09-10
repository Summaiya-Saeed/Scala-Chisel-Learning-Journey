package example
import org.scalatest._
import chisel3._
import chiseltest._ 
class fourmuxtest extends FreeSpec with ChiselScalatestTester{
      "four Mux Test" in {
            test(new fourmux()){ c =>
            c.io.a.poke(1.U)
            c.io.b.poke(0.U)
            c.io.c.poke(1.U)
            c.io.d.poke(0.U)
            c.io.sel1.poke(1.U)
            c.io.sel2.poke(1.U)
            c.clock.step(1)
            c.io.outt.expect(0.U)
            }
      }
}
