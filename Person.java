package jk1;
class Person{
// インスタンスフィールドを定義
public String name;
public int age;
public double height;
public double weight;
public static  int s;
     public void print() {
        //  出力
        System.out.println("名前は"+this.name+"です");
        System.out.println("年は"+this.age+"です");
        System.out.println("BMIは"+bmi()+"です");
        System.out.println("");
        //人数カウント
        Person.s++;
    }
// コンストラクタを定義しインスタンスフィールドに値をセット
public Person(String name,int age,double height,double weight){
    this.name =name;
    this.age =age;
    this.height = height;
    this.weight = weight;
   
}
//BMI計算
 public double bmi() {
return  weight /(height * height);
    }
}
