fun main(args: Array<String>) {
    println("==================================================")
    println("       Selamat Datang Di Toko Jaya Abadi")
    println("==================================================")
    println("--------------------------------------------------")
    println("           Dibuat Oleh Atsal Saputra     ")
    println("--------------------------------------------------")
    //deklarasi variabel
    var ulang = ""
    println("==================================================")
    var input = ""
    var item = ""
    var jumlah = ""
    var total = 0
    val pajak = 2500
    var subtotal =0
    var harga = 0
    //input nama dan member
    print("Masukkan Nama Anda : ")
    val nama = readln()
    println("--------------------------------------------------")
    println("Masukkan Nmr Member Anda ")
    print("Jika Tidak ada isi dengan 0 :  ")
    val member = readln()
    println("--------------------------------------------------")

    do{
        //tampilan  menu awal
        println("==================================================")
        println("Selamat Datang " + nama.toUpperCase() + "\nNomor member anda " + member)
        println("==================================================")
        println("1. Belanja")
        println("2. Beli Pulsa")
        println("3. Beli Token Listrik")
        println("99. Keluar")
        println("==================================================")
        print("Masukkan Pilihan Anda : ")
        val pilih = readln()
//pilihan 1
    if (pilih.toInt()==1){
        println("==================================================")
        println("                List Belanja")
        println("==================================================")
        println("1. Mie Instan")
        println("2. Susu")
        println("3. Makanan Ringan")
        println("==================================================")

        print("Input : ")
        input = readln()
        print("Jumlah Beli : ")
        jumlah = readln()

        //if input item
        if(input=="1"){
            item = "Mie Instan"
            harga = 3000
        }else if (input=="2"){
            item ="Susu"
            harga = 10_000
        }else if(input=="3"){
            item="makanan ringan"
            harga = 7000
        }else{
            println("inputan tidak ada")
        }
        total= (harga * jumlah.toInt())

    }else if (pilih.toInt()==2){
        println("==================================================")
        println("                   List Pulsa")
        println("==================================================")
        println("1. Pulsa 5000")
        println("2. Pulsa 10.000")
        println("3. Pulsa 15.000")
        println("4. Pulsa 20.000")
        println("5. Pulsa 25.000")
        print("input : ")
        input= readln()
        if(input=="1"){
            item = "Pulsa 5000"
            harga = 5000
        }else if (input=="2"){
            item ="Pulsa 10.000"
            harga = 10_000
        }else if(input=="3"){
            item="Pulsa 15.000"
            harga = 15_000
        }else if(input=="4"){
            item="Pulsa 20.000"
            harga = 20_000
        }else if(input=="5"){
            item="Pulsa 25.000"
            harga = 25_000
        }else{
            println("inputan tidak ada")
        }
        total= harga

    }else if (pilih.toInt()==3){
        println("==================================================")
        println("               List Token Listrik")
        println("==================================================")
        println("1. Rp.20.000,00")
        println("2. Rp.50.000,00")
        println("3. Rp.100.000,00")
        println("4. Rp.150.000,00")
        print("Pilihan : ")
        input= readln()

        //filter input
        if(input=="1"){
            item = "Token Listrik Rp.20.000,000"
            harga = 20_000
        }else if (input=="2"){
            item ="Token Listrik Rp.50.000,000"
            harga = 50_000
        }else if(input=="3"){
            item="Token Listrik Rp.100.000,000"
            harga = 100_000
        }else if(input=="4"){
            item="Token Listrik Rp.150.000,000"
            harga = 150_000
        }else{
            println("inputan tidak ada")
        }
        total = harga

    }else{
        println("Keluar Aplikasi,Tanpa Belanja")
    }
        //hitung bayar
        println("--------------------------------------------------")
        println("Harga per item "+ harga)
        println("--------------------------------------------------")
        println("PPN Rp."+pajak)
        if(member == "0"){
            subtotal=pajak+total
            println("Total Belanja Anda(PPN) : "+subtotal )
        }else{
            subtotal=(pajak+total)-(total*5/100)
            println("--------------------------------------------------")
            println("Member toko mendapat diskon 5% >> "+ (total*5/100))
            println("--------------------------------------------------")
            println("Total Belanja Anda(PPN) : "+subtotal )
        }
        println("==================================================")
        println(item+" dengan harga "+subtotal)
        println("==================================================")
        print("Bayar : ")
        val bayar = readln()
        if (bayar.toInt()==subtotal){
            println("Terima Kasih Telah Berbelanja!")
        }else{
            val kembalian=bayar.toInt()-subtotal
            println("Kembalian anda : "+kembalian)

        }
        //permintaan looping
        print("Transaksi lagi?(y/t) :")
        val ulang= readln()
        println()
    }while (ulang=="y")
}
