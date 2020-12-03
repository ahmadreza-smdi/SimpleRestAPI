package com.myfirstwebservice.demo;

public class Student {
    String fname;
    String lname;
    String student_id;
    String Address;
    String phone_number;
    public Student(String fname,String lname,String student_id,String Address,String phone_number){
        this.fname = fname;
        this.lname = lname;
        this.student_id = student_id;
        this.Address = Address;
        this.phone_number = phone_number;
    }
    public String getFname(){
        return this.fname;
    }
    public String getLname(){
        return this.lname;
    }
    public String getStudent_id(){
        return this.student_id;
    }
    public String Register(){
        return "Hi "+this.fname+" "+this.lname+"  your application has been submited with ID of " +this.student_id+" CONGRATULATIONS!";
    }
}
