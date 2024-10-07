package com.example.myapplication;

import java.util.ArrayList;

public class DAOPlaneta {

    ArrayList <Planeta> planetas;

    public DAOPlaneta() {
        planetas = new ArrayList();
        planetas.add(new Planeta("Mercúrio", 1));
        planetas.add(new Planeta("Vênus", 2));
        planetas.add(new Planeta("Terra", 3));
        planetas.add(new Planeta("Marte", 4));
    }
}
