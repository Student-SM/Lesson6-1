public class SqrtService {

    public int calcSqrt(int x) {

        for (int i = 1; i <= x; i++) {  //код для подсчета квадратного корня из 25,методом перебора чисел
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }

}
