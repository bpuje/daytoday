package com.groupon.dayToDay.repository.impl;

import com.groupon.dayToDay.dataStructure.MyLinkedList;
import com.groupon.dayToDay.models.Company;
import com.groupon.dayToDay.repository.ICompanyRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompanyRepositoryImpl implements ICompanyRepository {

    private List<Company> companyList;
    private static final CompanyRepositoryImpl INSTANCE = new CompanyRepositoryImpl();

    private CompanyRepositoryImpl(){
        if(this.companyList == null){
            this.companyList = new ArrayList<>(Arrays.asList(
               new Company("123", "Health"),
               new Company("124", "Beauty"),
               new Company("125", "Wellness")
            ));
        }
    }

    public static CompanyRepositoryImpl getInstance(){
        return INSTANCE;
    }


    public Company findByCompanyId(String id){
        for(Company company : companyList){
            if(company.getId() == id) return company;
        }
        return null;
    }

    @Override
    public void addCompany(Company company) {
        this.companyList.add(company);
    }

    @Override
    public void updateCompany(Company company) {

    }

    @Override
    public void deleteCompany(Company company) {
        Company tempCompany = findByCompanyId(company.getId());
        if(tempCompany == null) return;
//        tempCompany.setName();
        addCompany(tempCompany);
    }

//    @Override
//    public MyLinkedList getCompanies() {
//        return null;
//    }

    @Override
    public List<Company> getCompanies(){
        return companyList;
    }

//    @Override
//    public void updateCompany(Company company) {
//        int idx = company.getId() - 1;
//        Company tempCompany = companyList.get(idx);
//        if(companyList.contains(company)){
//            companyList.set(idx, company);
//        }else{
//            companyList.set(tempCompany.getId() - 1, tempCompany);
//        }
//    }
}
