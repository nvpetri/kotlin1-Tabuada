package br.senai.sp.jandira

fun main() {
    println("Calculadora tabuada")
    print("Qual o Multiplicador?")
    var multiplicador = readln().toInt()
    print("Qual o primeiro Multiplicando?")
    var multInicial = readln().toInt()
    print("Qual o o Ultimo Multiplicando?")
    var multFinal = readln().toInt()


    if (multInicial > multFinal){
        for (i in multFinal .. multInicial){
            println("$multiplicador x $i = ${multiplicador*i}")
        }
    }else {
        for (i in multInicial..multFinal) {
            println("$multiplicador x $i = ${multiplicador * i}")
        }
    }
}