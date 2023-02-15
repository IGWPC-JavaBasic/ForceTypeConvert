public class Main {
    public static void main(String[] args) {
//        Create Data Types Variable
        byte myByte = -12; // 1byte = 8bits, min=-128, max=127, if exceeds min or max value, compile error occurs
        System.out.println(myByte);

        short myShort = 32767; // 2bytes = 16bits, min=32768, max=32767
        System.out.println(myShort);

        int myInt = 32767; // 4bytes = 32bits
        System.out.println(myInt);

        long myLong = 32767L; // 8bytes = 64bits
        System.out.println(myLong);

        float myFloat = 10 / 3F; // 4bytes = 32bits
        System.out.println(myFloat);

        double myDouble = 10 / 3D; // 8bytes = 64bits
        System.out.println(myDouble);

//        Data Update
        myByte = 20;
        System.out.printf("Update %d \n", myByte);
        myByte = (byte) myShort;
        System.out.printf("Update Short Value %d \n", myByte);
        myByte = (byte) myInt;
        System.out.printf("Update Int Value %d \n", myByte);
        myByte = (byte) myLong;
        System.out.printf("Update Long Value %d \n", myByte);
        myByte = (byte) myFloat;
        System.out.printf("Update Float Value %d \n", myByte);
        myByte = (byte) myDouble;
        System.out.printf("Update Double Value %d \n", myByte);

        myShort = myByte;
        System.out.printf("Update byte to short %d \n", myShort);
        myShort = (short) myInt;
        System.out.printf("Update int to short %d \n", myShort);
        myShort = (short) myLong;
        System.out.printf("Update long to short %d \n", myShort);
        myShort = (short) myFloat;
        System.out.printf("Update float to short %d \n", myShort);
        myShort = (short) myDouble;
        System.out.printf("Update double to short %d \n", myShort);

        myInt = myByte;
        System.out.printf("Update byte to int %d \n", myInt);
        myInt = myShort;
        System.out.printf("Update short to int %d \n", myInt);
        myInt = (int) myLong;
        System.out.printf("Update long to int %d \n", myInt);
        myInt = (int) myFloat;
        System.out.printf("Update float to int %d \n", myInt);
        myInt = (int) myDouble;
        System.out.printf("Update double to int %d \n", myInt);

        myLong = myByte;
        System.out.printf("Update byte to long %d \n", myLong);
        myLong = myShort;
        System.out.printf("Update short to long %d \n", myLong);
        myLong = myInt;
        System.out.printf("Update int to long %d \n", myLong);
        myLong = (long) myFloat;
        System.out.printf("Update float to long %d \n", myLong);
        myLong = (long) myDouble;
        System.out.printf("Update double to long %d \n", myLong);

        myFloat = myByte;
        System.out.printf("Update byte to float %f \n", myFloat);
        myFloat = myShort;
        System.out.printf("Update short to float %f \n", myFloat);
        myFloat = myInt;
        System.out.printf("Update int to float %f \n", myFloat);
        myFloat = myLong;
        System.out.printf("Update long to float %f \n", myFloat);
        myFloat = (float) myDouble;
        System.out.printf("Update double to float %f \n", myFloat);

        myDouble = myByte;
        System.out.printf("Update byte to double %f \n", myDouble);
        myDouble = myShort;
        System.out.printf("Update short to double %f \n", myDouble);
        myDouble = myInt;
        System.out.printf("Update int to double %f \n", myDouble);
        myDouble = myLong;
        System.out.printf("Update long to double %f \n", myDouble);
        myDouble = myFloat;
        System.out.printf("Update float to double %f \n", myDouble);

        char c = 78;
        System.out.printf("Char %c \n", c);

        myByte = (byte) c;
        System.out.printf("Update char to byte %d", myByte);
        myShort = (short) c;
        System.out.printf("Update char to short %d", myShort);
    }
}