fun main(args: Array<String>) {

    fun dodawanie(){
        println("Podaj piewszą liczbę:")
        val liczba1 = readLine()
        println("Podaj drugą liczbę:")
        val liczba2 = readLine()
        val dod = (liczba1!!.toInt() + liczba2!!.toInt())
        print(dod)
    }
    fun mnożenie(){
        println("Podaj piewszą liczbę:")
        val liczba1 = readLine()
        println("Podaj drugą liczbę:")
        val liczba2 = readLine()
        val mno = (liczba1!!.toInt() * liczba2!!.toInt())
        print(mno)
    }

    fun odejmowanie(){
        println("Podaj piewszą liczbę:")
        val liczba1 = readLine()
        println("Podaj drugą liczbę:")
        val liczba2 = readLine()
        val ode = (liczba1!!.toInt() - liczba2!!.toInt())
        print(ode)
    }

    fun dzielenie(){
        println("Podaj piewszą liczbę:")
        val liczba1 = readLine()
        println("Podaj drugą liczbę:")
        val liczba2 = readLine()
        val dzi = (liczba1!!.toInt() / liczba2!!.toInt())
        print("wynik $dzi")
    }

    fun pytanie(){
        println("Co chcesz zrobić:\n" +
                "1 - dodawani\n" +
                "2 - odejmowanie\n" +
                "3 - mnożenie\n" +
                "4 - dzielenie")
        val wybor = readLine()
        if (wybor.toString() == "1"){
            dodawanie()}else if (wybor.toString() == "2"){
            odejmowanie()} else if (wybor.toString() == "3"){
            mnożenie()} else if (wybor.toString() == "4"){dzielenie()}
        }

    fun kalkulator() {
        pytanie()
        print("\nCzy chcesz jeszcze raz? Y/N: ")
        val zapytanie = readLine()
        if (zapytanie == "Y" || zapytanie == "y") {
            pytanie()
        } else if (zapytanie == "N" || zapytanie == "n") {
            pytanie()
        } else {
            print("Do widzenia")
        }
    }


kalkulator()
    }


