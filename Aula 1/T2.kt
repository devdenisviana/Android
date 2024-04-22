fun main() {
    var n1:Float =1f
    var n2:Float=1f
    var n3:Float =-8f
    var n4:Float =6f

    val maxi = 10f
    if((n1>maxi) || (n2>maxi) || (n3>maxi) || (n4>maxi)){
        println("Nota inexistente - maior que 10")
    }else if((n1<0f) || (n2<0f) || (n3<0f) || (n4<0f)){
        println("Nota inexistente - menor que 0")
    }else{
        var media = (n1+n2+n3+n4)/4
        println("A média é: ${media}")
    }
}