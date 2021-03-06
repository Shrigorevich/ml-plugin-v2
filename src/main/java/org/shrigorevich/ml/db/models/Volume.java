package org.shrigorevich.ml.db.models;

public class Volume {
    private int id;
    private String name;
    private int sizeX;
    private int sizeY;
    private int sizeZ;

    public Volume(String name, int sizeX, int sizeY, int sizeZ) {
        this.name = name;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
    }
    public Volume(){}
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSizeX() {
        return sizeX;
    }
    public int getSizeY() {
        return sizeY;
    }
    public int getSizeZ() {
        return sizeZ;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }
    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
    public void setSizeZ(int sizeZ) {
        this.sizeZ = sizeZ;
    }
}
