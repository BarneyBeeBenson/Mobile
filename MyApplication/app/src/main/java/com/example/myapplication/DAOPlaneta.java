package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class DAOPlaneta {

    ArrayList <Planeta> planetas;

    public DAOPlaneta() {
        planetas = new ArrayList<>();
        planetas.add(new Planeta("Mercurio",R.drawable.mercury));
        planetas.add(new Planeta("Venus",R.drawable.venus));
        planetas.add(new Planeta("Terra",R.drawable.earth));

    }

    public List<Planeta> getPlanetas() {return planetas;}
}
