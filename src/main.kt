fun main(){
    var person= Human("Jane",30,70)
    person.foodweight(3)
    println(person.weight)
    Speak("Hello,my name is Jane Musimbi,A student at AkiraChix")
    birthday(30)
    var mixed=user("Jane","Musimbi","sharonjmusimbi@gmail.com","0765757510","lisalab")
    println(mixed.firstName)
    println(mixed.phonenumber)
}
class Human(var name:String, var age:Int,var weight:Int){
  fun foodweight(foodeaten:Int){
      var food=2
      weight+=foodeaten
      println("I am eating 3kgs of food")
  }
  }
    fun Speak(speech:String){
        println(speech)
    }
    fun birthday(age:Int){
      var  m=2
      m+=age
        println(m)

    }

data class user(var firstName:String, var secondName:String, var email:String,var phonenumber:String,var password:String){

}




