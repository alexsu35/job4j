package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        if ((ab+ac > bc) && (ab+bc > ac) && (bc+ac > ab)) {
          //  return true;
              return (ab+ac > bc) && (ab+bc > ac) && (bc+ac > ab);
        }
        return false;
    }

}