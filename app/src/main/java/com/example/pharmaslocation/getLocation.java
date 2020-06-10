package com.example.pharmaslocation;

public class getLocation {
    String buildingNo;
    String floorNo;
    String apartmentNo;

    public getLocation() {
    }

    public getLocation(String buildingNo, String floorNo, String apartmentNo) {
        this.buildingNo = buildingNo;
        this.floorNo = floorNo;
        this.apartmentNo = apartmentNo;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public String getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(String apartmentNo) {
        this.apartmentNo = apartmentNo;
    }
}
