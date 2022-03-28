
import model.Persona
import view.PersonaView

fun main(args: Array<String>) {

    // Llamar personaview aqui
    var persona = Persona()
    var pVista = PersonaView()
    pVista.inicialeze()

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}