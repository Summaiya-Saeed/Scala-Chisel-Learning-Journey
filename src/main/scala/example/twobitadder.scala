package example
import chisel3._


class twobitadder extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))
        val aa = Input(UInt(1.W))
        val bb = Input(UInt(1.W))
        val s =Output(UInt(1.W))
        val c =Output(UInt(1.W))
        val ss =Output(UInt(1.W))
        val cc =Output(UInt(1.W))
    })
    io.s := io.a ^ io.b   //sum
    io.c := io.a & io.b  //carry
    io.ss := io.aa ^ io.bb   //sum
    io.cc := io.aa & io.bb  //carry
    
    
  

}