fun main() {
    print("Masukan Angka : ")
    var angka = readln().toInt()

    val jmlhAngka = angka
    var x = 0
    while (angka != 0) {
        val temp = angka % 10
        x = x * 10 + temp
        angka /= 10
    }

    if(x == jmlhAngka) {
        println("${jmlhAngka} = simteris")
    } else {
        println("${jmlhAngka} = tidak simetris")
    }
}