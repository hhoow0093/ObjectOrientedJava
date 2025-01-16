
//class
class Object {
    //object 
    public static void main(String[] args) {
        Person person1 = new Person("Howard", "haha");
        Person person2 = new Person("jaja", "haha");
        
        person1.friend(person1.name, person2.name);
    }
    
}

// Object -> method, field, property(setter, getter), constructor, static member(tidak sesuai objek yang dibuat)