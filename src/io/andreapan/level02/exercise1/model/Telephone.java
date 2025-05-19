package io.andreapan.level02.exercise1.model;

public class Telephone {

    private String phoneBrand;
    private String phoneModel;

    public Telephone(String phoneBrand, String phoneModel) {
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
    }

    public String getPhoneBrand() {
        return this.phoneBrand;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String ring(String phoneNumber) {
        return "PHONE NUMBER: " + phoneNumber + " is calling...";
    }

    @Override
    public String toString() {
        return "PHONE BRAND: " + this.phoneBrand
                + "\nPHONE MODEL: " + this.phoneModel;
    }


}
