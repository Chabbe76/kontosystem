package com.kontosystem.projekt.users;



public class user {
    private long id;
    private String name;
    private Integer age;
    private String mail;
    private String password;

    public user() {
    }

    public user(long id, String name, Integer age, String mail, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.password = password;

    }

    public user(String name, Integer age, String mail, String password) {
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

    //private static final AtomicInteger count = new AtomicInteger(0);