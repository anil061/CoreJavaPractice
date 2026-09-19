package DesignPatterns.Builder;

public class EarthQuakeResistantBuilder implements Builder{

    private Home earthquakeResistantHome = new Home();
    @Override
    public void buildFloor() {
        this.earthquakeResistantHome.floor = "wooden  floor";
    }

    @Override
    public void buildWalls() {
        this.earthquakeResistantHome.walls = "wooden  walls";
    }

    @Override
    public void buildTerrace() {
        this.earthquakeResistantHome.terrace = "wooden  terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.earthquakeResistantHome;
    }
}
