public class FirstClass {
    public static void main(String[] args) {
       Notebook notebook = new Notebook(600,2000,2020);
       System.out.println(notebook.weight + " " + notebook.price);
       notebook.checkPrice();
       notebook.checkWeight();
       notebook.checkYearAndPrice();

       Notebook heavyNotebook = new Notebook(2000,11000,2017);
       System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
       heavyNotebook.checkPrice();
       heavyNotebook.checkWeight();
       heavyNotebook.checkYearAndPrice();

       Notebook oldNotebook = new Notebook(2100,100,2008);
       System.out.println(oldNotebook.weight + " " + oldNotebook.price);
       oldNotebook.checkPrice();
       oldNotebook.checkWeight();
       oldNotebook.checkYearAndPrice();

        }
    }



