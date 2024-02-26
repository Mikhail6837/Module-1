package org.example;


public class Main {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(1, 3, 4, 5, 0.77);
        Shipment shipment2 = new Shipment(1, 3, 4, 0.33, 0.77);

        double vol;


        vol = shipment1.volume();
        System.out.println("Обьем shipment1 =" + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимосьть доставки shipment1 равна " + shipment1.cost);

        vol = shipment2.volume();
        System.out.println("Обьем shipment2 =" + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимосьть доставки shipment2 равна " + shipment1.cost);




    }
}