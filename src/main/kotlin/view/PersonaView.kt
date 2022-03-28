package view

import controller.PersonaController
import model.Persona

class PersonaView {
    var persona = Persona()
    var pContol = PersonaController(persona)

    fun inicialeze(){
        println("¿Cual es el nombre?")
        persona.nombre= readLine().toString()
        println("¿Edad?: ")
        persona.edad=readLine()!!.toInt()
        println("¿Sexo?: 'H' o 'M': En Mayuscula por favor!: ")
        persona.sexo=readLine()!![0]
        println("¿Peso?: ")
        persona.peso=readLine()!!.toInt()
        println("¿Altura?: ")
        persona.altura=readLine()!!.toFloat()


        var persona1 = Persona(persona.nombre, persona.edad, persona.sexo, persona.peso, persona.altura)
        var persona2 = Persona(persona.nombre, persona.edad, persona.sexo)
        var persona3 = Persona()
        persona3.nombre = "Josue Perez"
        persona3.edad = 25
        persona3.cedula = 207630342
        persona3.sexo = 'H'
        persona3.peso = 59
        persona3.altura = 1.76F

        println("Salida IMC: "+pContol.calcularIMC())
        println("Salida CompruebaSexo: "+pContol.comprobarSexo(persona.sexo))
        println("Mayor se edad: "+pContol.esMayorDeEdad())


        println(persona1)
        println(persona2)
        println(persona3)
    }

}