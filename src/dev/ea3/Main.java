package dev.ea3;

//Singly Linked List review//
//Simple implementation to see what is going on under the covers.
public class Main {

    public static void main(String[] args) {

        Employee emilio = new Employee("Emilio", "Araos", 1233);
        Employee lucia = new Employee("Lucia", "Terc", 4433);
        Employee brenda = new Employee("Brenda", "Montes", 1256733);
        Employee arturo = new Employee("Arturo", "Calle", 2121);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(emilio);
        list.addToFront(lucia);
        list.addToFront(brenda);
        list.addToFront(arturo);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}


