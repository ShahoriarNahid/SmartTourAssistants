package com.example.smarttourassistants;

public class Districtmodel {
    private String districtName;
    Districtmodel(){

    }

   public Districtmodel(String disName){
        this.districtName= disName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }


}
