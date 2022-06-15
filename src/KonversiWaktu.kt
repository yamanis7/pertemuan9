fun main() {
    print("Masukan detik : " )
    var waktu = readln().toInt()

    val jam = waktu / 3600
    val menit = (waktu % 3600) / 60
    val detik = (waktu % 3600) % 60

    println("${jam} : ${menit} : ${detik}")
}