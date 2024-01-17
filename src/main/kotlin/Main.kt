fun main(args: Array<String>) {
//   classWork();
   homeWork();
}

fun classWork(){
     //Интерфейсы

   abstract class Technologies(){

   }
   abstract class  Transport(){

   }

   class Car(): Movable, Chargeable{
      override val speed: Int
         get() = 100
      override val isCharge: Boolean
         get() = false
      override fun move():Unit {
         println("i'm moving");
      }
      override fun stopMove() {
         println("I have stopped moving");
      }
   };
   class AirPlane(): Movable{
      override val speed: Int
         get() = 850
      override fun move() {
         println("I'm flying");
      }
      override fun stopMove() {
         println("I have stopped flying");
      }
   };
   class Ship() : Movable, MyInterface{

      override val speed: Int
         get() = 60
      override val field: String
         get() = "Iy's field in Ship"
      override fun move() {
         println("I'm moving ")
      }

      override fun stopMove() {
         println("I have stopped moving");
      }

      override fun firstFun() {
         println("First fun");
      }

      override fun secondFun() {
         super.secondFun()
      }


   };

   Car().getSpeed();
   Car().charge();
   AirPlane().getSpeed();
   val ship = Ship()
   ship.getSpeed();
   ship.firstFun();
   ship.secondFun();

   //Вторичные конструкторы класса

   class Animal (private val name:String) {
      val movable: Movable ? = null
      fun printName(){
         println("Animals name is $name");
         movable?.move()
      }
      init {
          println("Test 1")
      }
      constructor( name:String,  age:Int) : this(name){

         fun printAnimalInformation(){
            println("Name animal: $name; age: $age")
         }
         printAnimalInformation()

      }


   }

   val dog = Animal(name="dog",);
   val tiger = Animal("tiger", 25)
   dog.printName();





}


interface  Movable{
   val speed:Int;

   fun move();
   fun stopMove();
   fun getSpeed(){

      println("My speed $speed")
   }
}

interface  MyInterface{
   val field: String;

   fun firstFun();
   fun secondFun(){
      println("Field: $field")
   };

}

interface Chargeable{

   val isCharge:Boolean;

   fun charge(){
      if(isCharge){
         println("I'm chargen");
      }else{
         println("Is not charge")
      }

   }
}

fun homeWork(){

   val appleOne = Apple(_name = "One")
   appleOne.printName()
   appleOne.printColor()
   println("_________________________________")

   val appleTwo = Apple(_name = "Two", _color = "red")
   appleTwo.printName()
   appleTwo.printColor()

}

abstract class Fruct () {
   abstract val name:String
}

class Apple( val _name:String):Fruct(), GetName, GetColor{
   override  val name = _name
   var color = ""
   constructor(_name:String, _color:String): this(_name){
      color = _color
   }

   override fun printName() {
      println("Appel name $name")
   }

   override fun printColor() {
      if(color.isEmpty()){
         super.printColor()
      }else{
         println("Appel by name $name is color: $color")
      }

   }
}

interface GetName {

   fun printName(){

   }
}

interface GetColor{

   fun printColor(){
      println("Color is undefined")
   }
}



