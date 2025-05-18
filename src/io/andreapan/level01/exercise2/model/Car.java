package io.andreapan.level01.exercise2.model;

public class Car {

    private static final String carBrand = "Toyota";
    private static String carModel;
    private final int carPower = 220;
    private String carColor;


    public Car(String carColor) {
        this.carColor = carColor;
    }

    public Car(String carModel, String carColor) {

        this.carModel = carModel;
        this.carColor = carColor;

    }

    /*
        public String getCarBrand() {
            return this.carBrand;
        }
        public String getCarModel() {
            return this.cModel;
        }

        /*
        public int getCarPower() {
            return this.carPower;
        }


        public String getCarColor() {
             return  this.carColor;
        }

        public void setCarModel(String carModel) {
             this.carModel = carModel;
        }

        public void setCarColor(String carColor) {
            this.carColor = carColor;
         }
    */

    public static String slowDown() {
        return "Car slowing down...";
    }

    public String speedUp() {
        return "Car speeding up...";
    }

    @Override
    public String toString() {

        return "BRAND: " + this.carBrand
                + "\nMODEL: " + this.carModel
                + "\nPOWER: " + this.carPower
                +"\nCOLOR: " + this.carColor;
    }

}
