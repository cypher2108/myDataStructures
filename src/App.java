import myarraylist.MyArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //now wee're testing our own custom ArrayList class.

        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        for (var i = 0; i < 18; i++) {
            myArrayList.add(i);    
        }

        System.out.println(myArrayList);

        myArrayList.add(9, 21);
        myArrayList.add(10, 22);

        System.out.println(myArrayList);

        myArrayList.remove(10);
        myArrayList.remove(9);

        System.out.println(myArrayList);

    }
}
