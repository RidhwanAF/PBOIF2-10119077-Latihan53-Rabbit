/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan53.rabbit;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF - 2
 * Deskripsi    : Menampilan ciri Rabbit
 */
public class PBOIF210119077Latihan53Rabbit {

    
    public static void main(String[] args) {
        Rabbit objRabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        
        System.out.println("Hello, His name is "+objRabbit.getName());
        System.out.println(objRabbit.getName()+" is Vegetarian? "+objRabbit.isVegetarian());
        System.out.println(objRabbit.getName()+" eats "+objRabbit.getEats());
        System.out.println(objRabbit.getName()+" has "+objRabbit.getNoOfLegs()+" legs");
        System.out.println(objRabbit.getName()+" color is "+objRabbit.getColor());
    }
    
}
