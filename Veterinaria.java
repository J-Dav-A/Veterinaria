package co.edu.uniquindio.poo;

public record Veterinaria(String nombre, String especie, String raza, byte edad, String genero, String color, float peso) {

    public Veterinaria{
        
        assert nombre != null && !nombre.isBlank() :"El nombre de la mascota no puede ser null y tampoco puede ser vacio";

        assert especie != null && !especie.isBlank() :"la especie de la mascota no puede ser null y tampoco puede ser vacio";

        assert raza != null && !raza.isBlank() :"la raza de la mascota no puede ser null y tampoco vacio";

        assert edad >0 :"la edad de la mascota no puede ser null y tampoco vacio";

        assert genero != null && !genero.isBlank() :"el genero de la mascota no puede ser null y tampoco vacio";

        assert color != null && !color.isBlank() :"el color de la mascota no puede ser null y tampoco vacio";

        assert peso >0 :"el peso de la mascota no puede ser null y tampoco vacio";

    }

}