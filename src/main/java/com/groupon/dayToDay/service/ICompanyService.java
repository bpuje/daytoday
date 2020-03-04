package com.groupon.dayToDay.service;

import com.groupon.dayToDay.models.Company;

import java.util.List;

public interface ICompanyService {

    abstract Boolean addCompany(Company company);
    abstract List<Company> delete(Company company);
    abstract boolean updateCompany(Company company);
    abstract List<Company> getAllCompanies();
    abstract Company findByCompanyId(String id);
}
