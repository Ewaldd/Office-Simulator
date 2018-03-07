import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*

val current = LocalDateTime.now()
val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
val formatted = current.format(formatter)
fun main(args: Array<String>) {
    print("Wpisz swoje imie: ")
    val name = readLine()
    print("Wpisz swoje nazwisko: ")
    val surname = readLine()
    print("Wpisz swoją płeć: ")
    var sex = readLine()
    while (sex != "Mężczyzna" && sex != "Kobieta") {
        print("Niepoprawna płeć! Prawidłowe płci: Mężczyzna, Kobieta. Podaj płeć:")
        sex = readLine()
    }
    print("Wpisz swój dzień urodzenia: ")
    var day = readLine()
    if (day!!.toInt() < 10) {
        day = "0" + day
    }
    print("Wpisz swój miesiąc urodzenia: ")
    var month = readLine()
    if (month!!.toInt() < 10) {
        month = "0" + month
    }
    print("Wpisz swój rok urodzenia: ")
    val year = readLine()
    println("Data i godzina: $formatted")
    println("Twoje imie: $name Twoje nazwisko: $surname")
    println("Twoja płeć: $sex")
    println("Data urodzenia: $day.$month.$year")
}
