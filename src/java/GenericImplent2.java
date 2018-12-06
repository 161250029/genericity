import java.util.Random;
/**
 *
 * 传入泛型实参时：
         * 定义一个生产器实现这个接口,虽然我们只创建了一个泛型接口Generator<T>
         * 但是我们可以为T传入无数个实参，形成无数种类型的Generator接口。
         * 在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型
         * 即：Generator<T>，public T next();中的的T都要替换成传入的String类型。
        */
public class GenericImplent2 implements GenericInterface<String> {

private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

@Override
public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
           }

/**
 * 类型通配符一般是使用？代替具体的类型实参，注意了，此处’？’是类型实参，而不是类型形参 。重要说三遍！此处’？’是类型实参，而不是类型形参 ！ 此处’？’是类型实参，而不是类型形参 ！再直白点的意思就是，此处的？和Number、String、Integer一样都是一种实际的类型，可以把？看成所有类型的父类。是一种真实的类型。

 可以解决当具体类型不确定的时候，这个通配符就是 ?  ；当操作类型时，不需要使用类型的具体功能时，只使用Object类中的功能。那么可以用 ? 通配符来表未知类型。
 */
    public void showKeyValue1(Generic<?> obj){
        System.out.println("泛型测试"+"key value is " + obj.getKey());
    }
}