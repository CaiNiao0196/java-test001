package test001;

import java.util.HashSet;
import java.util.Set;

/*
1.创建Star明星这个类，名字相同我们认为是同一个明星，键盘若干个名字通过名字创建明星，
将明星存储到适当的集合中,保证明星的唯一性
2.说明HashSet能够去重的原因;
3.通过Collection对一个整数类型的集合，进行排序;
4.动手实现下斗地主的案例:
5.Strings = "sdfkhew24353dsvifsougfouu;计算每个字符出现的次数通过两种方式遍历Map
 */
public class test0001 {
    public static void main(String[] args) {
    }
}
class Star{
    public static void star(String name) {
        Set<String> starName = new HashSet<String>();
        starName.add(name);
    }

}

