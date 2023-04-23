package Example;

class Square extends Shape{
  public Square(Color color){
    super(color);
  }
  public String draw(){
    return "Square drawm. " + color.fill();
  }
}
