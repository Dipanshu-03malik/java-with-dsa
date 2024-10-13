/*
 Question 5: Zoo Design
Problem Description

Aman is a rich businessman who want to build a zoo. He wants to make enclosures for terrestrial and aquatic animals. Terrestrial animals will be of two types, namely herbivorous and carnivorous animals. So there will be three different enclosures.
Herbivores like Elephant, Deer are prime attractions. Similarly, Lion and Tiger are prime attractions amongst carnivores. Finally, Dolphins and Shark are prime attractions amongst aquatics for tourists.
Aman being a savvy businessman realizes that in order to minimize the cost of building the zoo without compromising on the attractions, he has to decide how much area to allocate to each animal type. Each animal type requires a certain area to thrive in. This in turn impacts the area allocation, which in turn has cost implications.


Your task is to help Aman workout the mathematics such that the zoo building cost is minimized subject to the following constraints:

                Zoo needs to have minimum of X herbivores, Y carnivores and Z aquatic animals
                Different types of animals will need different minimum area to thrive in
                For animals of a given type, the minimum area required is the same
                There is also a maximum limit for the overall area allocated for each animal type
                Cost of fencing etc. is included in cost of enclosure
                Exclude the essentials like pathways for tourists, from area and cost calculations
                Consider all areas in square meters and cost in Rupees.  

Input

First line contains three space separated integers denoting the cost per square meter of building the enclosure for each type of animals viz. herbivorous, carnivorous and aquatic respectively

Second line contains three space separated integers denoting the maximum area that can be allocated to each type of animal viz. herbivorous, carnivorous and aquatic respectively

Next three lines, each will contain two space separated integers M and N, for each type of animal viz. herbivorous, carnivorous and aquatic respectively, where M denotes minimum number of animals of that type and N denotes minimum area required for that animal type

Last line contains an integer which represents the total area of land on which the zoo needs to be built

Output

Single integer containing the minimum cost required to build the zoo.

Examples


Input : 
                        10000 1000 1500
                        250 250 300
                        5 5
                        15 5
                        10 10
                        500


Output : 837500


 */
package TCS_CODE_VITA_PYQ;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost per sq meter for herbivours:");
        int herbivoresCost =sc.nextInt();
        System.out.print("Enter cost per sq meter for carnivours:");
        int carnivorescost = sc.nextInt();
        System.out.print("Enter cost per sq meter for Aquatics:");
        int Aquaticscost =sc.nextInt();



        System.out.print("Maximum area alocated for herbivorus:");
        int maxherbivorusarea=sc.nextInt();
        System.out.print("Maximum area alocated for carniivorus:");
        int maxcarnivorusarea = sc.nextInt();
        System.out.print("Maximum area alocated for aquatic:");
        int maxaquaticare=sc.nextInt();



        System.out.println("Minimum area required for herbivorus ::::");
        System.out.print("how many herbivorus animal are there:");
        int minHerbivores = sc.nextInt();
        System.out.print("Enter area needed per animal:");
        int herbivoresAreaPerAnimal = sc.nextInt();

        System.out.println("Minimum area required for carniivorus ::::");
        System.out.print("how many carnivorus animal are there:");
        int minCarnivores = sc.nextInt();
        System.out.print("Enter area needed per animal:");
        int carnivoresAreaPerAnimal = sc.nextInt();


        System.out.println("Minimum area required for Aquatics ::::");
        System.out.print("how many carnivorus animal are there:");
        int minAquatics = sc.nextInt();
        System.out.print("Enter area needed per animal:");
        int aquaticsAreaPerAnimal = sc.nextInt();


        System.out.println("Enter total area avialble for the Zoo");
        int totalArea = sc.nextInt();

        int totalHerbivoresArea = Math.min(minHerbivores * herbivoresAreaPerAnimal, maxherbivorusarea);
        int totalCarnivoresArea = Math.min(minCarnivores * carnivoresAreaPerAnimal, maxcarnivorusarea);
        int totalAquaticsArea = Math.min(minAquatics * aquaticsAreaPerAnimal, maxaquaticare);

        int totalUsedArea = totalHerbivoresArea + totalCarnivoresArea + totalAquaticsArea;


        if (totalUsedArea > totalArea) {
            System.out.println("Not enough space to build the zoo");
            
        }

        int totalCost = (totalHerbivoresArea * herbivoresCost) + (totalCarnivoresArea * carnivorescost) + (totalAquaticsArea * Aquaticscost);

        System.out.println(totalCost);
        sc.close();



    }
}
