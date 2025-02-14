package lesson_1

fun main() {
    val totalSeconds = 6480
    val minutes = totalSeconds / 60
    val remainingSeconds = totalSeconds % 60

    val hours = minutes / 60
    val remainingMinutes = minutes % 60

    println(String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds))
}

//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.