class Estudiante(private val departamento: String, private val calificacionPromedio: Double, nombre: String, edad: Int, id: String): Persona(nombre, edad, id) {

    override fun mostrarRol(){
        println("${Rol.ESTUDIANTE} $nombre de $edad años y el id $id, del departamento de $departamento con una calificación promedio de ${mostrarCalificacion()}.")

    }


    private fun mostrarCalificacion(): Double{
        return calificacionPromedio

    }
}