package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class ProgramDepartment {
    public static void main(String[] args) {



        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== Teste 1: Department FindById ====");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n==== Teste 3: Department FindAll ====");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list){
            System.out.println(dep);
        }
    }
    }
