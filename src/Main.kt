import java.io.File

fun main() {
    val file = File("todolist.txt")
    if (!file.exists()){
        file.createNewFile()
    }

    while (true){
        println("what do you want to do?")
        println("1. tambah")
        println("2. lihat list")
        println("3. keluar")
        print("pilihan anda: ")

        when(readLine()){
            "1" -> tambah(file)
            "2" -> lihatList(file)
            "3" -> break
            else -> println("input tidak valid")
        }
    }
}

fun lihatList(file: File){
    val file = file.readLines()
    if (file.isEmpty()){
        println("list kosong")
    }else{
        file.forEachIndexed {index, item -> println("${index+1}. $item")}
    }
}

fun tambah(file: File){
    println("masukkan list: ")
    val newList = readLine().toString()
    file.appendText("$newList\n")

    println("tugas berhasil ditambahkan")
}