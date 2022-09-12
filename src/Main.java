public class Main {

    public static void main(String[] args) {

        int x = 5;

        while (x < 10) {
            System.out.println("Hello" + x);
            x = x+1;
        }

        for (int i = 0;i < 10;i++) {
            if (i == 3) {
                continue; //это условие не будет проверяться,и не будет выводиться,джава пропустит и пойдет на круг дальше
            }
            if (i == 6) {
                break; //при данной команде останавливаются итерации и выводится все,что было до i==6
            }
            System.out.println(i);
        }

    }
}
