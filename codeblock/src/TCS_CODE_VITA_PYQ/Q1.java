/*
 One person hands over the list of digits to Mr. String, But Mr. String understands only strings. Within strings also he understands only vowels. Mr. String needs your help to find the total number of pairs which add up to a certain digit D.The rules to calculate digit D are as follow :
            Take all digits and convert them into their textual representation.

            Next, sum up the number of vowels i.e. {a, e, i, o, u} from all textual representation.

            This sum is digit D

Now, once digit D is known find out all unordered pairs of numbers in input whose sum is equal to D. Refer example section for better understanding.

Constraints

                        1 <= N <= 100

                        1 <= value of each element in second line of input <= 100

Number 100, if and when it appears in input should be converted to textual representation as hundred and not as one hundred. Hence number of vowels in number 100 should be 2 and not 4

Input

First line contains an integer N which represents number of elements to be processed as input Second line contains N numbers separated by space

Output
Lower case representation of textual representation of number of pairs in input that sum up to digit D

Note: – (If the count exceeds 100 print “greater 100”)*
 */
package TCS_CODE_VITA_PYQ;
import java.util.Scanner;

public class Q1 {



    public static int Calculatevovels(int [] arr)
    {
        int vovels=0;
        for(int i=0;i<arr.length;i++)
        {
            String word = ConvertnotoWord(i);
            vovels += countvovel(word);
        }
        return vovels;
    }



    public static String ConvertnotoWord(int num)
    {
        String [] units ={ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (num < 20) 
        {
            return units[num];
        } 
        else if (num < 100) 
        {
            if (num%10==0) 
            {
                return tens[num/10];
            } 
            else 
            {
                return tens[num/10]+" "+units[num%10];
            }
        } 
        else 
        {
            return "hundred";
        }

    }


    public static int countvovel(String word)
    {
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }


    public static int findpair(int [] arr ,int D)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == D) {
                    count++;
                }
            }
        }
        return count;
    }
    
    

    public static String convertnototext(int num)
    {
        String[] words = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty", "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty", "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven", "forty-eight", "forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty", "sixty-one", "sixty-two", "sixty-three", "sixty-four", "sixty-five", "sixty-six", "sixty-seven", "sixty-eight", "sixty-nine", "seventy", "seventy-one", "seventy-two", "seventy-three", "seventy-four", "seventy-five", "seventy-six", "seventy-seven", "seventy-eight", "seventy-nine", "eighty", "eighty-one", "eighty-two", "eighty-three", "eighty-four", "eighty-five", "eighty-six", "eighty-seven", "eighty-eight", "eighty-nine", "ninety", "ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five", "ninety-six", "ninety-seven", "ninety-eight", "ninety-nine", "one hundred"
        };
        return words[num];
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Element:");
        int N= sc.nextInt();
        System.out.println("enter the Numbers:");
        int [] arr = new int[N];
        for (int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int D= Calculatevovels(arr);

        int pair = findpair(arr,D);

        if(pair >100)
        {
            System.out.println("Greater then 100");
        }
        else
        {
            System.out.println(convertnototext(pair));
        }
        sc.close();
    }
}
