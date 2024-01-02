package oops.Abstraction;

class Student extends Person{
    int id;
    Student(String Name, String Gender ,int id) {
        super(Name, Gender);
        this.id = id;
    }
    @Override
    public void studying() {
        if (id == 0){
            System.out.println("NOT STUDYING");
        }
        else {
            System.out.println("studying");
        }
    }

    // @Override
    // public void tostring(){
    //     System.out.println("name : "+this.Name + " Gender : "+ this.Gender + "id :  " + this.id);
    // }
    
}

