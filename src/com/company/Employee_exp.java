package com.company;

class Employee_exp {

       String name, address;
         int year;
         Employee_exp(String n, int y ,  String add){
            name = n;
            year = y;

            address = add;
        }
      String getName(){
            return name;
        }
       int getYear(){
            return year;
        }

        String getAddress(){
            return address;
        }

        class Emp{
            public void main (String[] args){
                Employee_exp e1 = new Employee_exp("Robert", 1994,"64C WallsStreet");
                Employee_exp e2 = new Employee_exp("Sam", 2000,  "68D- WallsStreet");
                Employee_exp e3 = new Employee_exp("Jhon",1989, "26B- WallsStreet" );
            System.out.println("Name\t Year of joining\t Address");
            System.out.println(e1.getName()+"\t"+e1.getYear()+"\t"+e1.getAddress());
            System.out.println(e2.getName()+"\t"+e2.getYear()+"\t"+e2.getAddress());
            System.out.println(e3.getName()+"\t"+e3.getYear()+"\t"+e3.getAddress());

            }


    }
}
