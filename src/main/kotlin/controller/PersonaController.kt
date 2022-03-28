package controller

import model.Persona

class PersonaController {
    var persona = Persona()

    constructor(persona : Persona){
        this.persona = persona
    }


    fun calcularIMC(): Int{
        var pesoIdeal : Float = 0F
        pesoIdeal = persona.peso/(persona.altura * persona.altura)
        if (pesoIdeal < persona.peso){
            return 1
        }else if (pesoIdeal > persona.peso){
            return -1
        }
        else  {
            return 0
        }
    }

    fun esMayorDeEdad(): Boolean{
        return persona.edad >= 18
    }

    fun comprobarSexo(sexo1: Char){
        if (sexo1 == 'H'){
            persona.sexo = 'H'
        }else if (sexo1 == 'M'){
            persona.sexo = 'M'
        } else{
            persona.sexo = 'H'
        }

    }
}