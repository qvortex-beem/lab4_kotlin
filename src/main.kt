fun main() {
    greetPlayer()
    showChatMessage("Здравствуй")
    showPlayerStats("Aragorn", 150)
    showPlayerStats("Legolas", 120)
    createCharacter(name = "Gendalf", 10, "vizard")
    val damage = calculateDamage(150, 2.0)
    println("Урон: $damage")
    sum(10, 15.0)
    greet("Name")
    val sum = fun(a: Int, b: Int): Int = a + b
    println(sum(10, 15))
    println(fun(a: Int, b: Int): Int {
        return a + b
    }
        (10, 15)
    )

    val hello: () -> Unit = { println("Hello") }
    hello()
    attack("goblin")

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val doubled = numbers.filter {it % 2 == 0} // map
    println(doubled)

    applyEffect { it + 40 }
}

fun applyEffect(effect: (Int) -> Int) {
    val health = 100
    println("Новое здоровье: ${effect(health)}")
}

val sum1 = fun(x: Int, y: Int): Int {
    return x + y
}
val sum2 = fun(x: Int, y: Int): Int = x + y
val sum3 = { x: Int, y: Int -> x + y }
val sum4: (Int, Int) -> Int = { x, y -> x + y }


val attack = { enemy: String -> println("Attack $enemy") }

fun greetPlayer(): Unit = println("Привет")
fun showChatMessage(text: String) {
    println(text)
}

fun showPlayerStats(name: String, health: Int) {
    println("Name: $name | health: $ health")
}

fun createCharacter(name: String, level: Int = 1, classType: String = "Noob") {
    println("Name: $name | level: $level | class: $classType")
}

fun calculateDamage(baseDamage: Int, multiplier: Double): Int = (multiplier * baseDamage).toInt()

fun sum(a: Int, b: Int): Int = a + b
fun sum(a: Int, b: Int, c: Int): Int = a + b + c
fun sum(a: Double, b: Double): Double = a + b
fun sum(a: Int, b: Double): Double = a + b
fun sum(a: Double, b: Int): Double = a + b

val greet = fun(name: String) { println(name) }
