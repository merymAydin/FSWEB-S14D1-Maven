package com.workintech.developers;

public class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void work(){
        System.out.println("Employee starts to working");
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
}

/*.



HRManager addEmployee isimli bir metoda sahip olmalı. Bu metod için gerekli Overload edilmiş hallerini tanımlamalısınız.
Bu metodun amacı JuniorDeveloper gelirse ilgili developeri juniorDevelopers dizisine eklemeli.
MidDeveloper gelirse ilgili developeri midDevelopers dizisine eklemeli.
SeniorDeveloper gelirse ilgili developeri seniorDevelopers dizisine eklemeli.
Bu eklemeler yapılırken ilgili dizide index alanı dolu mu diye bakılmalı. Doluysa içerdeki veri ezilmemeli.
Bir uyarı verilmeli. Aynı zamanda indexin hiç var olmadığı durum da göz önünde bulundurulmalı.
*/