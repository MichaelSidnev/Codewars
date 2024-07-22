//package codewars.homework;
//
//import java.util.Arrays;
//import java.util.List;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Vector {
//
//    public Vector(int i) {
//    }
//
//    public Vector(Vector vector) {
//    }
//
//    //	- создание из массива
//    public Vector[] vectorFromArray(int[] array) {
//        Vector[] vectorArray = new Vector[array.length];
//        for (int i = 0; i < array.length; i++) {
//            vectorArray[i] = new Vector(array[i]);
//        }
//        return vectorArray;
//    }
//
//    //	- создание из списка
//    public Vector[] vectorFromList(List<Integer> array) {
//        Vector[] vectorArray = new Vector[array.size()];
//        for (int i = 0; i < vectorArray.length; i++) {
//            vectorArray[i] = new Vector(array.get(i));
//        }
//        return vectorArray;
//    }
//
//    //	- создание из существующего вектора
//    public Vector[] vectorFromVector(Vector[] array) {
//        Vector[] vectorArray = new Vector[array.length];
//        for (int i = 0; i < array.length; i++) {
//            vectorArray[i] = new Vector(array[i]);
//        }
//        return vectorArray;
//    }
//
//
//    //	- создание нулевого вектора заданной размерности
//    public Vector[] vectorZero(int dimension) {
//        Vector[] vectorArray = new Vector[dimension];
//        for (int i = 0; i < dimension; i++) {
//            vectorArray[i] = new Vector(0);
//        }
//        return vectorArray;
//    }
//
//    //	- получение размерности
//    public int verctorDimension(Vector[] vector) {
//
//        return vector.length;
//    }
//
//    //	- сложение с другим вектором той же размерности
//    public Vector[] VectorsSum(Vector[] one, Vector[] two) {
//        int dimension = one.length;
//        if ()
//            Vector[] sum = new Vector[dimension];
//        for (int i = 0; i < dimension; i++) {
//            int a = Integer.valueOf(one[i].toString());
//            int b = Integer.valueOf(two[i].toString());
//            int c = a + b;
//
//        }
//    }
//
//
//    //	- умножение на число
//    public int[] vectorIncrease(int[] array, int number) {
//
//        int[] vectorArray = new int[array.length];
//        for (int i = 0; i < vectorArray.length; i++) {
//            vectorArray[i] = array[i] * number;
//        }
//        return vectorArray;
//    }
//
////	- скалярное умножение на вектор той же размерности
//
//    //	- вывод вектора в виде [1,2,3] при вызове writeLine(vector)
//    public void write(int[] array) {
//
//        try {
//            FileWriter writer = new FileWriter("vector.txt");
//            for (int a : array) {
//
//                writer.write(a);
//            }
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
//
