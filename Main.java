package jk1;
import java.util.*;
class Main {
  public static void main(String[] args) {
      // 呼び出し
    jk1.Person person1 = new jk1.Person("鈴木太郎", 20, 1.7,60);
    // 使用時
    System.out.println(person1.name);
    System.out.println(person1.age);
    System.out.println(person1.height);
    System.out.println("");
    person1.bmi();
    person1.print();
    
 System.out.println("合計人数は"+Person.s+"人です。");
  }
}
