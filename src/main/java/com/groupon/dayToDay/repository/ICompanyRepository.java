package com.groupon.dayToDay.repository;

import com.groupon.dayToDay.models.Company;

public interface CompanyRepository {
    abstract void addCompany(Company company);
    abstract void updateCompany(Company company);
    abstract void deleteCompany(Company company);
}
