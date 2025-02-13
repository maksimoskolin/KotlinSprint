package lesson_1

fun main() {
    val totalNumberOfOrders: Int = 75
    val thankYouMessage: String = "Спасибо за ваш заказ!"

    println("Общий номер заказов: $totalNumberOfOrders")
    println("Сообщение благодарности: $thankYouMessage")

    var numberOfEmployees = 2000
//    println("Общее количество сотрудников: $numberOfEmployees")
    numberOfEmployees -= 1
    println("Общее количество сотрудников после увольнения: $numberOfEmployees")

}

