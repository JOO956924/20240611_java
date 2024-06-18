package p03_method;

public class Ex03Constructor {
  public static void main(String[] args) {
    Car gv70 = new Car("gv", "black", "HD");

    //gv70.setColor("white");
    System.out.println(gv70.getColor());

  }
}

//생성자 getter,setter
// 공통점 속성에대한 초기화 값에대한 온전한보전
// 다른점 시점 생성자(이전) getter,setter(인스턴스 이후)
// 생성자 = 초기화

class Car {
  // 생성자는 없어도 기본 생성자가 자동으로 생성됨
  // 생성자는 new(생성연산자)에 의해서 인스턴스가 생성됨
  // 생성자도 Overloading 이 된다
  // 사용자가 생성자를 등록하면 기본 생성자는 자동 추가 안됨.
    public Car() {
      this("GV80","WHITE", "HD");
    }
  // this = 자신이 속한클래스
  //     ()
  //      . 속성(멤버변수)
    public Car(String model, String color, String maker) {
      this.model = model;
      this.color = color;
      this.maker = maker;
    }
  private String model;
  private String color;
  private String maker;

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }
}

class Ex03ConstructorA {
  public static void main(String[] args) {
    Employee e1 = new Employee("JAMES",00000,"2024-06-18",20,"male");
    System.out.println(e1.getEname() + "\t" + e1.getEmpno() + "\t" + e1.getHiredate() + "\t" + e1.getAge() + "\t" + e1.getGender());
    Employee e2 = new Employee();
    Employee e3 = new Employee();

  }
  }




  class Employee {
  // 초기화 블럭
    {
      System.out.println("Initial Block Instance");
    }
    static {
      System.out.println("Initial Block static");
    }
    public Employee(String ename, int empno, String hiredate, int age, String gender) {
      this.ename = ename;
      this.empno = empno;
      this.hiredate = hiredate;
      this.age = age;
      this.gender = gender;
    }

    public Employee() {
    }

    private String ename;
    private int empno;
    private String hiredate;
    private int age;
    private String gender;

    public String getEname() {
      return ename;
    }

    public void setEname(String ename) {
      this.ename = ename;
    }

    public int getEmpno() {
      return empno;
    }

    public void setEmpno(int empno) {
      this.empno = empno;
    }

    public String getHiredate() {
      return hiredate;
    }

    public void setHiredate(String hiredate) {
      this.hiredate = hiredate;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getGender() {
      return gender;
    }

    public void setGender(String gender) {
      this.gender = gender;
    }
  }


