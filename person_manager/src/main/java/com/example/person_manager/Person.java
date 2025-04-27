package com.example.person_manager;

public class Person {
    private Long id;
    private String name;
    private String email;
    private String birthday;
    private String pet;
    private String note;

    public Person() {}

    public Person(Long id, String name, String email, String birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    // Getterid ja setterid
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    public String getPet() { return pet; }
    public void setPet(String pet) { this.pet = pet; }

    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
}
