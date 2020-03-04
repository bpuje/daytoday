package com.groupon.dayToDay.service.impl;

import com.groupon.dayToDay.models.Company;
import com.groupon.dayToDay.repository.ICompanyRepository;
import com.groupon.dayToDay.repository.impl.CompanyRepositoryImpl;
import com.groupon.dayToDay.service.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements ICompanyService {

    private ICompanyRepository iCompanyRepository = CompanyRepositoryImpl.getInstance();
    List companyList = iCompanyRepository.getCompanies();

    @Override
    public Boolean addCompany(Company company) {
        if(iCompanyRepository.findByCompanyId(company.getId()) == null){
            iCompanyRepository.addCompany(company);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCompany(Company company) {
        Company tempCompany = iCompanyRepository.findByCompanyId(company.getId());
        if(iCompanyRepository.findByCompanyId(company.getId()) == null){
//            int idx = tempCompany.getId() - 1;
            return true;
        }else{
            iCompanyRepository.addCompany(tempCompany);
        }
            return false;
    }

    @Override
    public List<Company> delete(Company company) {
        iCompanyRepository.deleteCompany(company);
        return null;
    }

    @Override
    public List getAllCompanies() {
        return iCompanyRepository.getCompanies();
    }

    @Override
    public Company findByCompanyId(String id) {
        return iCompanyRepository.findByCompanyId(id);
    }


//    public List<Company> getAllCompanies(){
//        List<Company> listOfCompanies = new ArrayList<>();
//        listOfCompanies.add(new Company(123, "Health"));
//        listOfCompanies.add(new Company(124, "Beauty"));
//        listOfCompanies.add(new Company(125, "Wellness"));
//        listOfCompanies.add(new Company(126, "Massage"));
//        listOfCompanies.add(new Company(127, "Manicures"));
//        listOfCompanies.add(new Company(128, "Pedicures"));
//        listOfCompanies.add(new Company(129, "Hair Styling"));
//        listOfCompanies.add(new Company(130, "Fitness classes"));
//        listOfCompanies.add(new Company(131, "Yoga"));
//        listOfCompanies.add(new Company(133, "Cycling"));
//        listOfCompanies.add(new Company(134, "Muay Thai Kickboxing"));
//
//        return listOfCompanies;
//    }


//    public Company getProductById(int id){
//        Predicate<Company> byId = c -> c.getId()==id;
//        return filterCompanies(byId);
//    }
//    private Company filterCompanies(Predicate<Company> strategy){
//        return getAllCompanies().stream().filter(strategy).findFirst().orElse(null);
//    }



}
