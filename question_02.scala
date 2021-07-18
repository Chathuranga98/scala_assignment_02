import java.util.Scanner;
import scala.io.StdIn.readInt;

object q02{


	def gcd(a:Int,b:Int): Int=b match{
		case 0 => a
		case b if (b>a) => gcd(b,a)
		case _ => gcd(b,a%b)
   	}

	def prime(p:Int, q:Int=2): Boolean = q match{
		case x if(x==p) => true
		case x if gcd(p,x) > 1 => false
		case x => prime(p,x+1)
	}

	def primeSeq(a:Int): Unit={
		if(a>2) 
			primeSeq(a-1)
		var bool= (prime(a))
		if (bool)
			println(a)
	}

	def main(args:Array[String]){
		
		var input = new Scanner (System.in)
		print("Enter number :")
		val num=input.nextInt()

		primeSeq(num)
	}
}

