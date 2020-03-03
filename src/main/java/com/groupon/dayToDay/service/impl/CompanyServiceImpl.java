package com.groupon.dayToDay.service.impl;

import com.groupon.dayToDay.models.Company;
import com.groupon.dayToDay.service.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class CompanyServiceImpl implements ICompanyService {

    public List<Company> getAllCompanies(){
        List<Company> listOfCompanies = new ArrayList<>();
        listOfCompanies.add(new Company(123, "Health"));
        listOfCompanies.add(new Company(124, "Beauty"));
        listOfCompanies.add(new Company(125, "Wellness"));
        listOfCompanies.add(new Company(126, "Massage"));
        listOfCompanies.add(new Company(127, "Manicures"));
        listOfCompanies.add(new Company(128, "Pedicures"));
        listOfCompanies.add(new Company(129, "Hair Styling"));
        listOfCompanies.add(new Company(130, "Fitness classes"));
        listOfCompanies.add(new Company(131, "Yoga"));
        listOfCompanies.add(new Company(133, "Cycling"));
        listOfCompanies.add(new Company(134, "Muay Thai Kickboxing"));

        return listOfCompanies;
    }



    public Company getProductById(int id){

        Predicate<Company> byId = c -> c.getId()==id;
        return filterCompanies(byId);
    }

    private Company filterCompanies(Predicate<Company> strategy){
        return getAllCompanies().stream().filter(strategy).findFirst().orElse(null);
    }


    @Override
    public void addCompany(Company company) {

    }

    @Override
    public void delete(Company company) {

    }

    public void updateCompany(int id, Company newCompany){

    }
}
