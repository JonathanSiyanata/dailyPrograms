import java.util.Scanner;

public class WordInShapeFormat{
	

	public static void main(String args[]){

		String str = "Hello There And Welcome To The Java World We Hope That You Enjoy. Please Dont Forget To Install The JDK And Set Your Enviroment Variable";
		int counter = 0;
		int size = str.length();
		int index = 0;  

		while((index + counter) < size){
			counter++;
		System.out.print(str.substring(index, index + counter));
			index = index + counter;
		System.out.println();	
		}

	}
} 


