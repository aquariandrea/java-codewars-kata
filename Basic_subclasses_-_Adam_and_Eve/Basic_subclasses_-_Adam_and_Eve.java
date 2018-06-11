public class God {
  public static Human[] create(){
    Man man = new Man();
    Woman woman = new Woman();
    Human[] paradise = {man, woman};
    return paradise;
  }
}

class Human{

}

class Man extends Human{

}

class Woman extends Human{

}
