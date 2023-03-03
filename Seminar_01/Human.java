package Seminar_01;

import java.util.Scanner;

public class Human {
    
    static Scanner scanner = new Scanner(System.in);
    
    protected Integer id;
    protected String name;
    protected String gender;
    protected Integer age;
    protected String socialStatus;
    protected String memberFamily;
    protected String groupFamily;
   
    public Human(Integer id, String name, String gender, Integer age, String socialStatus, String groupFamily, String memberFamily){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.socialStatus = socialStatus;
        this.groupFamily = groupFamily;
        this.memberFamily = memberFamily;
    }

    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public Integer getAge(){
        return age;
    }
    public String getSocialStatus(){
        return socialStatus;
    }
    public String getGroupFamily(){
        return groupFamily;
    }
    public String getMemberFamily(){
        return memberFamily;
    }
    
    public void setId(Integer id){
        this.id = id; 
    }
    public void setName(String name){
        this.name = name; 
    }
    public void setGender(String gender){
        this.gender = gender; 
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setSocialStatus(String socialStatus){
        this.socialStatus = socialStatus; 
    }
    public void setGroupFamily(String groupFamily){
        this.groupFamily = groupFamily; 
    }
    public void setMemberFamily(String memberFamily){
        this.memberFamily = memberFamily; 
    }
  

    public String getInfo() {
        return String.format("ID: %s, Name: %s, Gender: %s,  Age: %d,  Social status: %s, Member family: %s.", 
        this.id, this.name, this.gender, this.age, this.socialStatus, this.groupFamily, this.memberFamily, this.getClass().getSimpleName());
    }

}