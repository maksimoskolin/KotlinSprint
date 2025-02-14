package lesson_1

fun main() {
    val numberOfEmployees = 50
    val numberOfInterns = 30

    val salaryOfEmployees = numberOfEmployees * 30000
    val salaryOfEmployeesAndInterns = salaryOfEmployees + (numberOfInterns * 20000)
    val averageSalary = salaryOfEmployeesAndInterns / (numberOfEmployees + numberOfInterns)

    println("Расходы на выплату зарплаты постоянных сотрудников: $salaryOfEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $salaryOfEmployeesAndInterns")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary")


}