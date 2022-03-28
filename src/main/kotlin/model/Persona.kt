package model

class Persona{

    var nombre: String= ""
        get() = field
        set(nombre) {
            field = nombre
        }
    var edad: Int= 0
        get() = field
        set(edad) {
            field = edad
        }
    var cedula : Int? = null
        get() = field
        set(cedula) {
            field = cedula
        }
    var sexo: Char = '\u0000'
        get() = field
        set(sexo) {
            field = sexo
        }
    var peso: Int = 0
        get() = field
        set(peso) {
            field = peso
        }
    var altura: Float = 0F
        get() = field
        set(altura) {
            field = altura
        }

    constructor(nombre: String, edad: Int, sexo: Char, peso: Int, altura: Float) {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }

    constructor(nombre: String, edad: Int, cedula: Int?, sexo: Char, peso: Int, altura: Float) {
        this.nombre = nombre
        this.edad = edad
        this.cedula = cedula
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }

    constructor(nombre: String, edad: Int, sexo: Char){
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
    }

    constructor()

    override fun toString(): String {
        return "Persona(nombre='$nombre', edad=$edad, cedula=$cedula, sexo=$sexo, peso=$peso, altura=$altura)"
    }


}
