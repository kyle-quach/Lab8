package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cityList = new ArrayList<>();
    @Test
    public void testAddCity() {
        CustomList list = new CustomList(null, cityList);
        City city = new City("Edmonton","AB");
        list.addCity(city);
        assertEquals(1,list.getCount());

    }
    @Test
    public void testHasCity() {
        CustomList list = new CustomList(null, cityList);
        City city1 = new City("Regina", "Saskatchewan");
        City city2 = new City("Edmonton", "AB");
        list.addCity(city1);
        assertTrue(list.hasCity(city1));
        assertFalse(list.hasCity(city2));
    }
    @Test
    void testDeleteCity() {
        CustomList list = new CustomList(null, cityList);
        City city1 = new City("Regina", "Saskatchewan");
        City city2 = new City("Edmonton", "AB");
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(2, list.getCount());
        list.deleteCity(city1);
        assertEquals(1, list.getCount());
        assertFalse(list.hasCity(city1));
    }
    @Test
    void testCountCities() {
        CustomList list = new CustomList(null, cityList);
        City city1 = new City("Vancouver", "BC");
        City city2 = new City("Edmonton", "AB");
        City city3 = new City("Calgary", "AB");
        City city4 = new City("Montreal", "QB");
        list.addCity(city1);
        list.addCity(city2);
        list.addCity(city3);
        list.addCity(city4);
        assertEquals(4, list.countCities());
    }
}
