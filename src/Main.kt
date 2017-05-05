import java.util.*

fun main(args: Array<String>) {
    val vectorList = ArrayList<Vector2D>()

    val rand = Random()

    for (i in 1..20) {
        val x = rand.nextInt() % 50
        val y = rand.nextInt() % 50
        vectorList.add(Vector2D(x, y))
    }

    Collections.sort(vectorList)
    println(vectorList)

    Collections.sort(vectorList) { v1, v2 -> compareValues(v1.length(), v2.length())}
    println(vectorList)
    println(vectorList.map(Vector2D::length))

    Collections.sort(vectorList) { v1, v2 -> compareValues(v1.angle(), v2.angle()) }
    println(vectorList)
    println(vectorList.map(Vector2D::angle))
}