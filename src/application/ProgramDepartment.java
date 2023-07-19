package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class ProgramDepartment {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== Teste 1: Department FindById ====");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n==== Teste 3: Department FindAll ====");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list){
            System.out.println(dep);
        }

        System.out.println("\n==== Teste 4: Department Insert ====");
        Department newDepartment = new Department(null, "Fashion");
        departmentDao.insert(newDepartment);
        System.out.println("Inserido! Departamento = " + newDepartment.getName() + " Id = " + newDepartment.getId());

        System.out.println("\n==== Teste 5: Department Update ====");
        department = departmentDao.findById(3);
        department.setName("Films");
        departmentDao.update(department);
        System.out.println(department);
        System.out.println("Atualizado com Sucesso.");

        System.out.println("\n==== Teste 6: Department Delete ====");
        System.out.println("Entre com o Id a ser deletado: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deletado com sucesso!");
        list = departmentDao.findAll();
        for (Department dep : list){
            System.out.println(dep);
        }

        sc.close();
    }
    }
