import java.util.Scanner;
import scala.io.StdIn.readInt;

object q03{


	def addNumber(m:Int):Int = m match {
		case 1 =>1
		case _ =>m+ addNumber(m-1)

	}
	
	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Addition of numbers from 1 to n\n");
		print("Enter number :");
		val num=input.nextInt();

		println(addNumber(num));	
	}
}

