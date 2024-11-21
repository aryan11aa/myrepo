public class myuser {

    int id;
    String name;

    public myuser()
    {
        super();
    }

    public myuser(int id,String name)
    {
        super();
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
             myuser m1=new myuser(1, "Aryan");
             System.out.println(m1);       
    }
}