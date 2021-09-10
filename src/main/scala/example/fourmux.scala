package example
import chisel3._

class fourmux extends Module {
    val io = IO(new Bundle{
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))
        val c = Input(UInt(1.W))
        val d = Input(UInt(1.W))
        val sel1 = Input(UInt(1.W))
        val sel2 = Input(UInt(1.W))
        val outt = Output(UInt(1.W))
    })

    when(io.sel1 === 0.U & io.sel2 === 0.U){
        io.outt := io.a
    }.elsewhen(io.sel1 === 0.U & io.sel2 === 1.U){
        io.outt := io.b
    }.elsewhen(io.sel1 === 1.U & io.sel2 === 0.U){
        io.outt := io.c
    }.elsewhen(io.sel1 === 1.U & io.sel2 === 1.U){
        io.outt := io.d
    }.otherwise{
        io.outt := DontCare
    }
}