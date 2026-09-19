package DesignPatterns.Builder;

public class FloodResistantBuilder implements Builder{

    private Home floodResistantBuilder = new Home();
    @Override
    public void buildFloor() {
       floodResistantBuilder.floor = "10 feet above the ground level";
    }

    @Override
    public void buildWalls() {
        floodResistantBuilder.walls = "Water resistant Walls";
    }

    @Override
    public void buildTerrace() {
        floodResistantBuilder.terrace = "Water lekage resistant Terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return null;
    }
}
