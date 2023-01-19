package co.com.challenger.starsharp.interactions;

public class texto {

    public static void main(String[] args){
        String palabra = "sqx";
        String texto = "lenguaje sql";
        boolean resultado = texto.contains(palabra);

        if(resultado){
            System.out.println("palabra encontrada");
        }else{
            System.out.println("palabra no encontrada");
        }
    }
}
