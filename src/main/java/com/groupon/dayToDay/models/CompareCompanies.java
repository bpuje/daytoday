package com.groupon.dayToDay.models;

import java.util.Comparator;

public class CompareCompanies implements Comparator<Company> {

    @Override
    public int compare(Company company1, Company company2) {
        int result = company1.getName().compareTo(company2.getName());
        return result;
    }

    public boolean equals(Object collator){
        if(this == collator){
            return true;
        }
        if(collator == null){
            return false;
        }
        return getClass() == collator.getClass();
    }


//    public boolean compareTo(Company data, Company data2) {
//        data.getName().compareTo(data2.getName());
//        return true;
//    }

}
