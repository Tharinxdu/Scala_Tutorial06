def encrypt(shift:Int,text:String,alphabet:String):String={
    text.map((c: Char) => { 
        val x = alphabet.indexOf(c)
        if (x == -1) {
            c
        } else {
            alphabet((x + shift) % alphabet.size)
        }
    })
}

def decrypt(shift:Int,text:String,alphabet:String):String={
    text.map((c: Char) => { 
        val x = alphabet.indexOf(c)
        if (x == -1) {
            c
        } else {
            alphabet((x - shift) % alphabet.size)
        }
    })
}


object O1 extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz" //defining alphabet

    val text = "abcd" //defining text

    val text1 = encrypt(1,text,alphabet) //encrypting text
    println(text1)

    val text2 = decrypt(1,text1,alphabet) //decrypting text
    println(text2)
}