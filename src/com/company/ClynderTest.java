package com.company;

class CylinderTest {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder volume: "+cylinder.getVolume());
        System.out.println(cylinder.toString());

        Cylinder cylinder1 = new Cylinder(3, "red", 5.5);
        System.out.println("Cylinder volume: "+cylinder1.getVolume());
        System.out.println(cylinder1.toString());
    }
}