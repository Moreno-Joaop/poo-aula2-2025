package app;

public class Hello {
    public static void main(String[] args) {
        // Genero g = new Genero(1, "Gabriel");
        // Genero g2 = new Genero(0, "");

        // System.out.println(g.getNome());
        // System.out.println(g2.getNome());

        Genero comedia = new Genero(1, "comedia");
        Genero aventura = new Genero(2, "aventura");
        Genero terror  = new Genero(3, "terror");

        Filme f1 = new Filme();
        f1.setId(1);
        f1.setTitulo("F1 The Movie");
        f1.setGenero(aventura);
        
        Filme f2 = new Filme(2, "Shreck", comedia);
        Filme f3 = new Filme(3, "Trapalhões", comedia);

        System.out.println(f1);
        System.out.println(f2.getTitulo());
        System.out.println(f3.getTitulo());
    }

}