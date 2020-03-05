package com.groupon.dayToDay.controller;

import com.groupon.dayToDay.dataStructure.MyLinkedList;
import com.groupon.dayToDay.models.Company;
import com.groupon.dayToDay.service.impl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

//    MyLinkedList myLinkedList = new MyLinkedList();

    @Autowired
    private CompanyServiceImpl companyServiceImpl;

    @GetMapping("/companies")
    public List<Company> getAllCompanies(){
        return companyServiceImpl.getAllCompanies();
    }

    @PostMapping("/company/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean addCompany(@RequestBody Company newCompany){

        return companyServiceImpl.addCompany(newCompany);
//        return null;
    }

    @PostMapping("/company/update")
    public List<Company> updateCompanies(int id, Company newCompany){
        companyServiceImpl.updateCompany(newCompany);
        return null;
    }


    @GetMapping("/company/{id}")
    public Object getProductById(@PathVariable("id") String companyId){

        Company product = companyServiceImpl.findByCompanyId(companyId);
        if(product == null){
            return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Company>(product, HttpStatus.OK);
    }

    @DeleteMapping("/company/{id}")
    public List<Company> deleteCompany(@RequestBody Company newCompany){
        return companyServiceImpl.delete(newCompany);
    }

}
