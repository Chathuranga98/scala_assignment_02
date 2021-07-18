import scala.io.StdIn.readInt

object q06 extends App{
    def fib(x : Int) : Int = x match{
        case x if x == 0 => 0
        case x if x == 1 => 1
        case _ => fib(x - 1) + fib(x- 2)
    }
    def fibSeq(x:Int):Unit= {
        if (x > 0) fibSeq(x - 1)
        println(fib(x))
    }

    print("Input a value to get fibonacci sequence :")
    var value = readInt()
    fibSeq(value)
}
