package com.springdemo.bootstrap;

import com.springdemo.entity.Employee;
import com.springdemo.repository.DepartmentRepository;
import com.springdemo.repository.EmployeeRepository;
import com.springdemo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;


    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("------------------Region Starts-------------------------");
        System.out.println("findByCountry" + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry" + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContaining" + regionRepository.findByCountryContainingIgnoreCase("united"));
        System.out.println("findByCountryContainingOrderBy" + regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("findTopByCountry" + regionRepository.findTop2ByCountry("Canada"));
        System.out.println("------------------Region Ends-------------------------");

        System.out.println("------------------Department Starts-------------------------");
        System.out.println("findByDepartment" + departmentRepository.findByDepartment("Furniture"));
        System.out.println("findByDivisionIs" + departmentRepository.findByDivisionIs("Health"));
        System.out.println("findDistinctTop2ByDivisionContains" + departmentRepository.findDistinctTop2ByDivisionContains("Hea"));
        System.out.println("------------------Department Ends-------------------------");

        System.out.println("------------------Employee Starts-------------------------");
        System.out.println(employeeRepository.findByEmailIsNull());

        System.out.println("==============Using query to build methods==============");
        System.out.println("getEmployeeDetail:" + employeeRepository.getEmployeeDetail());
        System.out.println("getEmployeeSalary:" + employeeRepository.getEmployeeSalary());


    }
}
