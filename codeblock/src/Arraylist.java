import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("BMW");
        cars.add("Porche");
        cars.add("Toyota");
        cars.add("Mercedez");
        System.out.println("----ArrayList----");
        for (int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        cars.set(2,"Koinesegg");
        cars.remove(3);
        System.out.println("");
        for (int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        cars.clear();
        System.out.println("");
        if (cars.size()>0){
            for (int i=0;i<cars.size();i++){
                System.out.println(cars.get(i));
            }
        }
        else{
            System.out.println("Empty ArrayList");
        }       
    }
}
