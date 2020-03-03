package com.groupon.dayToDay.service;

import com.groupon.dayToDay.models.Company;

public interface ICompanyService {

    abstract void addCompany(Company company);
    abstract void delete(Company company);
}
