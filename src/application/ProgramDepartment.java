package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class ProgramDepartment {
    public static void main(String[] args) {



        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== Teste 1: Department FindById ====");
        Department department = departmentDao.findById(3);
        System.out.println(department);
    }
    }
