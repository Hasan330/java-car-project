package com.hasan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args){

        //Entity Manager Factory
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

//        Owner hasan = new Owner();

        Car seat = new com.hasan.Car();
        Car seatIbiza = new com.hasan.Car("Hasan", "Ibiza", "1.2 TSI", 2014, "Black", 4, 5, 83500L, true);
        Car porsche = new com.hasan.Car();

        seat.setModel("Ibiza");
        porsche.setModel("911");

        System.out.println("Seat initial millage is: " + seatIbiza.getMillage());


        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(seatIbiza);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();

    }
}
