public class Increment {
    public static void main(String[] args) {

        int val1 = 25;

        /////////////post increment////////

        val1++;
        System.out.println(val1);

        val1 = 25;
        System.out.println(val1++);
        System.out.println(val1);   ////////post increment can not do 2 task same time

        ////////// pre increment /////////////

        val1 = 25;

        ++val1;
        System.out.println(val1);

        val1 = 25;
        System.out.println(++val1);
        System.out.println(val1);     /// pre increment can do 2 task parellery

        //////

        int val2 = 68;
        System.out.println(val2--);

        val2 = 68;
        System.out.println(--val2);


    }
}
