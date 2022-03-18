fun main(){
var result=(ArrayProduct(arrayOf(8,7,4,5)))
    println(result)
  var total =  sumOfArrays(arrayOf("boy",3.7,9F,2.0,4,89F,20.5,"girl"))
    println(total)
    var output=(numOfVowels(arrayOf('a','y','o','p','e','w')))
    println(output)
}
fun  ArrayProduct(numbers:Array<Int>):Int{
    var product=1
    numbers.forEach{ number->
        product*=number
    }
    return product
}
//question 2
fun sumOfArrays( num:Array<Any>):Double{
    var sum=0.00
    num.forEach{ num1->
        if (num1 is Double ){
            sum += num1
        }
    }
    return sum
}
fun numOfVowels(letters:Array<Char>):Int{
   var total=0
    letters.forEach{letter->
        if(letter=='a'|| letter=='e'|| letter=='i'|| letter=='o'||letter=='u'){
            total++
    }

}
 return  total
}