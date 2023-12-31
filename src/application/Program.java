package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== Teste 1: Seller FindById ====");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n==== Teste 2: Seller FindByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }
        System.out.println("\n==== Teste 3: Seller FindAll ====");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }
        System.out.println("\n==== Teste 4: Seller Insert ====");
        Seller newSeller = new Seller(null, "Tom", "tom@gmail.com", new Date(), 3500.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserido! Novo id = " + newSeller.getId());

        System.out.println("\n==== Teste 5: Seller Update ====");
        seller = sellerDao.findById(1);
        seller.setName("Antonio Mario");
        sellerDao.update(seller);
        System.out.println(seller);
        System.out.println("Atualizado com Sucesso.");

        System.out.println("\n==== Teste 6: Seller Delete ====");
        System.out.println("Entre o Id para ser deletado: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Deletado com sucesso.");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        sc.close();
    }
}
