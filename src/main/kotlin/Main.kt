
val animalFinder = AnimalFinder()

fun main() {
    println("Please enter the number of the habitat you would like to view:")
    val input = readln()

    if (input == "exit") {
        println("See you later!")

        return
    }

    animalFinder.findByNumber(input)

    return main()
}