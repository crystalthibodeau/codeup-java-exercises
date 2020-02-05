package util.inheritanceModel;

public class grandparent {
    protected String name;
    public grandparent(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        grandparent grandparent = new grandparent("Grandparent");
        grandparent parent = new parent1("Parent");
        grandparent child = new child1("Child");
        grandparent grandchild = new grGrandchild("Grandchild");

        System.out.println(grandparent.name);
        System.out.println(parent.name);
        System.out.println(child.name);
        System.out.println(grandchild.name);

//should be child class first, everyone is a child not everyone is a grandparent!

    }
}
