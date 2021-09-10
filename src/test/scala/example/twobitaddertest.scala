package example
import org.scalatest._
import chisel3._
import chiseltest._ 
class twobitaddertest extends FreeSpec with ChiselScalatestTester{
      "xor Gate Test" in {
            test(new twobitadder()){ c =>
            c.io.a.poke(1.U)
            c.io.b.poke(1.U)
            c.io.aa.poke(1.U)
            c.io.bb.poke(1.U)
            c.clock.step(1)
            c.io.s.expect(0.U)
            c.io.c.expect(1.U)
            c.io.ss.expect(0.U)
            c.io.cc.expect(1.U)
            }
      }
}

