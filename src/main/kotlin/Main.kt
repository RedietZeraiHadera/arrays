fun main(){
    sentence()
    places()
    number()
    groupName()

}
fun sentence(){
    var names= arrayOf( "Anne","Joy","Faith","Rediet")
    println(names.contentToString())

}
fun places(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    var city= cities.map { it.capitalize()}.toTypedArray()
        println(city.contentToString())


    }
fun number(){
    var numbers= arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[2]+numbers[5]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun groupName() {
    var sentence = arrayOf("Zeray", "Silas", "Eshetu", "Sofia")
    println(sentence.contentToString())
}