package hashmap;

public class hashmap {
    public static int HashFunction(String str)
    {
        int hashValue=str.hashCode();
        int hashFunctionValue =hashValue%101 ;
        return hashFunctionValue;
    }
    public static void main(String[] args) {
        // String str="Hello";
        // System.out.println(str.hashCode());
        // Integer val=23;
        // System.out.println(val.hashCode());
        String str="Mohan";
        System.out.println(HashFunction(str));
        String str2="Sohan";
        System.out.println(HashFunction(str2));
    }
}
