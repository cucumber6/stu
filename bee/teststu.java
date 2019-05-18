package bee;


import java.util.*;

public class teststu {
    public static void main(String args[]){
        List<stu> S=new ArrayList<stu>();
        int n;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("----学生管理系统----");
            System.out.println("请输入数字执行功能");
            System.out.println("1:添加学生信息");
            System.out.println("2:删除学生信息");
            System.out.println("3:修改学生信息");
            System.out.println("4:查询学生信息");
            System.out.println("5:展示学生信息");
            System.out.println("6:对学生数学成绩排序");
            System.out.println("7:退出系统");
            n=sc.nextInt();
            if(n==1)
                Add(S);
            else if(n==2)
                Dle(S);
            else if(n==3)
                Change(S);
            else if(n==4)
                Find(S);
            else if (n==5)
                Show(S);
            else if (n==6)
                Sort(S);
            else if (n==7) {
                System.out.println("退出系统");
                return;
            }
            else
                System.out.println("输入错误重新输入");

        }

    }
    public static void Add(List<stu> S){
        System.out.println("请输入存储学生姓名，学号，数学成绩");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int num=sc.nextInt();
        float math=sc.nextFloat();
        stu S1=new stu(name,num,math);
        S.add(S1);
    }
    public static void Dle(List<stu> S){
        System.out.println("请输入要删除的学号");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        stu S1=new stu();
        for(int i=0;i<S.size();i++){
            S1=S.get(i);
            if(S1.getNum()==n)
                S.remove(i);
        }
    }
    public static void Change(List<stu> S){
        System.out.println("请输入要修改的学生学号");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        stu S1=new stu();
        for (int i=0;i<S.size();i++){
            S1=S.get(i);
            if (S1.getNum()==n){
                System.out.println("请输入修改后的学生姓名,学号，数学成绩");
                S1.setName(sc.next());
                S1.setNum(sc.nextInt());
                S1.setMath(sc.nextFloat());
            }
        }
    }
    public static void Find(List<stu> S){
        System.out.println("请输入要查询学生的学号");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        stu S1=new stu();
        for (int i=0;i<S.size();i++){
            S1=S.get(i);
            if(S1.getNum()==n) {
                System.out.println("姓名    学号    数学成绩");
                S1.show();
            }
        }
    }
    public static void Show(List<stu> S){
        System.out.println("姓名    学号    数学成绩");
        for (stu s:S){
            s.show();
        }
    }
    public static void Sort(List<stu> S){
        sort s=new sort();
        Collections.sort(S,s);
        System.out.println("排序完毕：");
        Show(S);
    }
}

