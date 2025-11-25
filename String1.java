public class String1 {
    int noofwheels;
    int noofdoors;
    int maxspeed;
    String name;
    String modelname;
    String companyname;

    String1(int noofwheels, int noofdoors, int maxspeed, String name, String modelname, String companyname) {
        this.noofwheels = noofwheels;
        this.noofdoors = noofdoors;
        this.maxspeed = maxspeed;
        this.name = name;
        this.companyname = companyname;
        this.modelname = modelname;
    }

    public static void main(String[] args) {
        String1 s = new String1(8, 4, 200, "BMW", "SC0", "TEsla");

        System.out.println(s.toString());
    }
}

// toString(): provides a string reperesentaton of an object
// bydefault returns class,@ and hashcode
// string is not declared anywhere inisde heap but a subset of heap called pool
// is where strings are declared.
// strings are immutable means values cant change once declared.
// if we create a strig with a doublee quote then it gets created inside a pool.
// but if create with a new keywoed then it gets created inside a normal heap.
// ex: string s=new string("abc");
// string str1="abc" here str1 is an reference variable means - It holds the
// memory address of the "abc" object.
