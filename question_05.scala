import scala.io.StdIn.readInt;

object q05 extends App {
    var n:Int = 0;
    def sum(a:Int): Unit= {
        if(a > 0) {
        if(a%2 == 0) {
            n = n + a;
        } 
        sum(a - 1);
        }
        else println(n);
    }

    print("Input a value:");
    var value = readInt();
    sum(value-1);
    
}
