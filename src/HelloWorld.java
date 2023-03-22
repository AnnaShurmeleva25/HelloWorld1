public class HelloWorld {

    //public - видят все, static - не нужен объект нашего класса,
    //void - ничего не возвращает, main - говорит, что это старт нашего приложения
    //psvm - чтобы не писать руками

    public static void main(String[] args) {

        //byte, char, int, float,double, boolean,short - относятся к примитивным типам данных, остальные к ссылочным

        byte byteExample = 3;
        short myShort = byteExample; //присваиваем типу byte тип short
        byte secondByte = (byte) myShort;//из большой сумки в маленькую, выдает ошибку, задаем (byte)
        // чтобы заставить придать типу byte тип short (явное приведение типов)
        char letter = 'a';
        int myLetter = 30;
        int c = 3;
        int b = 5;
        float myFloatNumber = 2.5f;
        double myDoubleNumber = 3.5;
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue); //в кавычках задается только строка
        System.out.println(myLetter);
        // +, -, *, /
        int aa = 4;
        int bb = 3;
        System.out.println(4/3);// если делим целое на целое, получим целое число, без остатка
        System.out.println((double)aa/bb);//чтобы получить дробь
        System.out.println(aa%bb);//вернет остаток от деления

        //aa=5, хотим получить 6
        aa = aa + 1;//полный вариант
        aa++;// сокращенная версия (прибавляет единицу при следующей операции)
        aa--;

        ++aa;// прибавляет единицу в текущей операции, не дожидаясь следующей
        --aa;

        //sout - not to write by hands
        System.out.println("Hello World!");
        int minValue = 3;
        int maxValue = 5;
        System.out.println(minValue == maxValue);
        System.out.println(minValue != maxValue);

        System.out.println(minValue < maxValue);
        System.out.println(minValue > maxValue);
        System.out.println(minValue <= maxValue);
        System.out.println(minValue >= maxValue);

        boolean isEqual = minValue == maxValue;
        System.out.println(minValue >0 && maxValue > 10);
        System.out.println(minValue >0 || maxValue > 10);
        System.out.println(!(minValue >0));

        System.out.println(minValue >0 & maxValue > 10);
        System.out.println(minValue >0 | maxValue > 10);

        minValue+=3;//рибавить на 3
        minValue-=3;//отнять 3
        minValue*=3;//умножить на 3
        minValue/=3;//разделить на 3
        minValue%=3;// остаток от деления на 3


    }
}
