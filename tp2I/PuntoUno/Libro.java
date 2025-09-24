

public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private String editorial;
    private String isbn;

  
    public Libro(String titulo, String autor, int anio, String editorial, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " - Autor: " + autor + " (" + anio + ")");
    }

    public String toString() {
        return "Libro [Título=" + titulo + ", Autor=" + autor + ", Año=" + anio +", Editorial=" + editorial + ", ISBN=" + isbn + "]";
    }
}
