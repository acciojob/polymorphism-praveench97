package com.driver;

public class Main {
    public class Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
    public void main() {
        Product p = new Product();
        p.product(5, 6);
        p.product(1, 2, 3);
        p.product(2.5,2.0);
    }
}