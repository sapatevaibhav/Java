class GenericDemo<T> {

  T data;

  GenericDemo(T data) {
    this.data = data;
  }

  T display() {
    System.out.println(data.getClass().getSimpleName() + " value is: " + data);
    return data;
  }
}

class GenericExample {

  public static void main(String[] args) {
    GenericDemo<Integer> demoInt = new GenericDemo<>(18);
    demoInt.display();
    GenericDemo<String> demoStr = new GenericDemo<>("vaibhav");
    demoStr.display();
    GenericDemo<Float> demoFloat = new GenericDemo<>(1.8f);
    demoFloat.display();
    GenericDemo<Double> demoDouble = new GenericDemo<>(18.33);
    demoDouble.display();
    GenericDemo<Boolean> demoBool = new GenericDemo<>(true);
    demoBool.display();
  }
}
