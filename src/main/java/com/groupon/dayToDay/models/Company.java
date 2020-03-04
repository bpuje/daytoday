package com.groupon.dayToDay.models;

public class Company implements Comparable<Company>{

    private String id;

    private String name;

    public Company(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
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
        return this.getName().compareTo(company.getName());
    }
}
