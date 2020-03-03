package com.groupon.dayToDay.models;

public class Company implements Comparable<Company>{

    private int id;

    private String name;

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Company company) {
//        return this.name.compareTo(company.name);
        return this.getName().compareTo(company.getName());
    }
}
