class Main {
    public static void main(String[] args) {
      Prateleira prateleira = new Prateleira(2,5);
      Prateleira prateleira2 = new Prateleira(1, 4);
      Estante estante = new Estante(1);
      Estante estante2 = new Estante(2);
       estante.adicionarPratileira(prateleira); 
       estante2.adicionarPratileira(prateleira2); 
    
      Obras harry = new Obras("jk", "Harry-Potter", 2001, "3646732", 1.20);
      Obras carros = new Obras("disney", "carros", 2011, "234254", 0.20);
    

       prateleira.adicionar(carros);
       prateleira.adicionar(harry);   
       prateleira.listar();
       estante.moverObra(prateleira, carros, estante2, prateleira2);
       System.out.println("\n");
       prateleira2.listar();
       prateleira.listar();
       System.out.println("A somo dos pesos dos livro em gramas "+ prateleira.somarPeso());
    }
  }