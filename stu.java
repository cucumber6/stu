package bee;

public class stu {
   private String name;
   private int num;
   private float math;
   public stu(){};
   public stu(String name,int num,float math){
       this.name=name;
       this.num=num;
       this.math=math;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }
    public void show(){
       System.out.println(this.name+"    "+this.num+"    "+this.math);
    }
}
