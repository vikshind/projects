package com.vth.pattern.creational.builder;

/**
 * House Builder Interface
 *
 */
public interface IHouseBuilder {
    void buildBasement();

    void buildStructure();

    void buildRoof();

    void buildInterior();

    House getHouse();
}
