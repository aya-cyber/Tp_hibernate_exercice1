/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;
import ma.projet.service.ProduitService;
import ma.projet.entity.Produit;
import java.util.Date;
import ma.projet.util.HibernateUtil;


/**
 *
 * @author Lenovo
 */
public class TestProduit {
    public static void main(String[] args) {
    
       
      
         ProduitService prod = new ProduitService();
         
         prod.create(new Produit("zara" ,"arb5267", new Date(2024/01/12),900,"robe"));
         prod.create(new Produit("bersheka" ,"aex5287", new Date(2024/11/28),300,"jupe"));
         // prod.create(new Produit("mango" ,"ke45b67", new Date(2024/08/05),250,"top"));
         prod.create(new Produit("pull&bear" ,"ht248", new Date(2024/03/01),1200,"pantalon"));
         prod.create(new Produit("adidas" ,"klm9347", new Date(2024/10/18),400,"cascette"));
         
         for(Produit prod1: prod.findAll()){
            System.out.println("la marque:" +prod1.getMarque()+",le prix:" + prod1.getPrix());
         }
          Produit ss= prod.findById(2);
          System.out.println("la marque :"+ss.getMarque()+ ",le prix:" +ss.getPrix());
          prod.delete(prod.findById(3));
           Produit pp = prod.findById(1);
           pp.setMarque("Massimo");
            pp.setReference("RTBCFR123");
            pp.setDateAchat(new Date("2024/09/18"));
            pp.setPrix(4000);
            prod.update(pp);
           for (Produit ps : prod.findAll()) {
            if (ps.getPrix() > 100) {
                System.out.println("" + pp.getMarque());}
           }}}