package com.groupon.dayToDay.repository;

import com.groupon.dayToDay.models.Company;

import java.util.List;

public interface ICompanyRepository {
    abstract Company findByCompanyId(String id);
    abstract void addCompany(Company company);
    abstract void updateCompany(Company company);
    abstract void deleteCompany(Company company);
    abstract List getCompanies();
    //abstract MyLinkedList<Company> getCompanies();
}
