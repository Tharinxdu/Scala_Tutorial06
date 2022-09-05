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

def ceaserCipher(f:(Int,String,String)=>String,shift:Int,text:String,alphabet:String):String={
    f(shift,text,alphabet)
}

object O2 extends App{
    val text = "Hello World"
    val shift = 3
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
    val text2 = ceaserCipher(encrypt,shift,text,alphabet)
    println(text2)
    val text3 = ceaserCipher(decrypt,shift,text2,alphabet)
    println(text3)
}