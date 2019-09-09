package lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<User> list=new ArrayList<>();
        list.add(new User("xiaowang",11));
        list.add(new User("xiaoli",20));
        list.add(new User("xiaozhang",7));
        Comparator<User> c1=new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.getAge()>o2.getAge()){
                    return 1;
                }
                else if(o1.getAge()==o2.getAge()){
                    return 0;
                }
                return -1;

            }
        };
        Collections.sort(list,c1);
    }
}
