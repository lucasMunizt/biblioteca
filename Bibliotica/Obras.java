public class Obras {
  static int contadorCodigo;
  private String autor;
  private String titulo;
  private int ano;
  String codigo ;
  private double peso;


    Obras(int contadorCodigo,String autor,String titulo, int ano, double peso){
     this.contadorCodigo = contadorCodigo;
     this.autor = autor;
     this.titulo = titulo;
     this.ano = ano;
     this.peso = peso;
}
void setcontadorCodigo(int contadorCodigo){
    this.contadorCodigo = contadorCodigo;
  }
  int getcontadorCodigo(){
    return contadorCodigo;
  }
  
   void setautor(String autor){
    this.autor = autor;
  }
   String getautor(){
    return autor;
  }
      void titulo(String titulo){
    this.titulo = titulo;
  }
   String gettitulo(){
    return titulo;
  }
      void getano(int ano){
    this.ano = ano;
  }
   int getano(){
    return ano;
  }

     void codigo(String codigo){
      this.codigo = codigo;
  }
     String getcodigo(){
      return codigo;
  }
     
     void peso(double peso){
    this.peso = peso;
  }
   double getpeso(){
    return peso;
  }

}
