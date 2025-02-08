class Profesor(private val departamento: String, private val aniosExperiencia: Int, nombre: String, edad: Int, id: String): Persona(nombre, edad, id) {


    override fun mostrarRol(){
        println("${Rol.PROFESOR} $nombre de $edad años y el id $id, del departamento de $departamento con ${mostrarExperiencia()} años de experiencia.")

    }

    fun mostrarExperiencia(): Int{
        return aniosExperiencia

    }

}