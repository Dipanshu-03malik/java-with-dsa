package hashmap;
public class HashCode_Demo {
	public static int HashFunction(String str) {
		
		int hashValue=str.hashCode();
		int HashfunctionValue=hashValue%101;
		
		return HashfunctionValue;
	}
	public static void main(String[] args) {
        // Todo Auto-generated method stub
		String str ="Sparsh";
		String str2 ="Ankit";

		System.out.println(HashFunction(str));
		System.out.println(HashFunction(str2));
	
	}

}
