package com.example.itravel.entity;

public class Region {
    private String regionID;
    private String regionName;

    public String getRegionID() {
        return regionID;
    }
    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }
    public String getRegionName() {
        return regionName;
    }
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    public Region(String regionID, String regionName) {
        this.regionID = regionID;
        this.regionName = regionName;
    }
    @Override
    public String toString() {
        return "Region [regionID=" + regionID + ", regionName=" + regionName + "]";
    }
    
}
