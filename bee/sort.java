package bee;

import java.util.Comparator;
public class sort implements Comparator<stu>{
    @Override
    public int compare(stu o1, stu o2) {
        if (o1.getMath()>o2.getMath())
            return -1;
        else
            return 0;
    }
}
