`fun main() {
    var toyota = Car("Toyota","Prado","KCT 123B",0)
    toyota.start()
    println(toyota.speed)
    toyota.accelerate(30)
    println(toyota.speed)
    toyota.accelerate(35)
    println(toyota.speed)
    toyota.hoot()
    println(toyota.speed)
    toyota.deccelerate(20)
    println(toyota.speed)
    println(toyota.speed)
    toyota.stop()
    println(toyota.speed)
    var nancy = Student("nancy",20,"AnitaB")
    println(nancy.age)
    println(nancy.stream)

}
// A class has named
// The body of a class is denoted by a pair of curly braces
// Class is a template - used to create object
// An object is an instant of the class
class Car(var make:String, var model:String, var registration:String, var speed:Int){

    fun start(){
        println("Vroom ")
    }

    fun accelerate(acceleration:Int):Int{
        speed+=acceleration
        return speed

    }
    fun hoot(){
        println("voom voom")
    }

    fun deccelerate(decceleration:Int):Int {
        speed-=decceleration
        println("The deccelarated speed is $speed")
        return speed
    }
    fun stop(){
        speed = 0
//        speed-=speed
        println("The speed is $speed")

    }
}



data class Student(var name:String, var age:Int, var stream:String)
