package com.arief.entity;

/**
 * Created by Arief on 9/7/2017.
 */
public class Person {

    private int id;
    private String nama;

    public Person(){}

    public Person(int id,String nama){
        this.id=id;
        this.nama=nama;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setNama(String nama){
        this.nama=nama;
    }

    public int getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                '}';
    }
}
