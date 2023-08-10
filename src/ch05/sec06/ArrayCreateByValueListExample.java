package ch05.sec06;

public class ArrayCreateByValueListExample {

    public static void main(String[] args) {

        String[] fruits = {"apple", "banana"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        // 주의점
        String[] users;
        users = new String[]{"A", "B"};

        for (String user : users) {
            System.out.println(user);
        }
    }
}
