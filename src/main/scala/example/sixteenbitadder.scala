package example
import chisel3._


class sixteenbitadder extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(16.W))
        val b = Input(UInt(16.W))
        
        val c =Output(UInt(16.W))
    })

io.c := io.a + io.b   //sum
}