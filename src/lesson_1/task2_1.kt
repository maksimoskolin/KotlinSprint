package lesson_1

fun main() {
    val grades = listOf(3, 4, 3, 5)

    val averageGrade = grades.sum() / grades.size.toDouble()

    println("Средний балл: %.2f".format(averageGrade))
}