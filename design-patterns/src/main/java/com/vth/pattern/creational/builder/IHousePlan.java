package com.vth.pattern.creational.builder;

/**
 * House plan interface
 */
public interface IHousePlan {
    void setBasement(String basement);

    void setStructure(String structure);

    void setRoof(String roof);

    void setInterior(String interior);
}
