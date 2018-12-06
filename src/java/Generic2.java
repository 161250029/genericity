public class Generic2<T extends Number>{              // 给泛型类设置上下界
    private T key;

    public Generic2(T key) {
        this.key = key;
    }

    public T getKey(){
        return key;
    }

    //在泛型方法中添加上下边界限制的时候，必须在权限声明与返回值之间的<T>上添加上下边界，即在泛型声明的时候添加
//public <T> T showKeyName(Generic<T extends Number> container)，编译器会报错："Unexpected bound"
    public <T extends Number> T showKeyName(Generic<T> container){
        System.out.println("container key :" + container.getKey());
        T test = container.getKey();
        return test;
    }

    public static void main(String[] args) {
        //这一行代码也会报错，因为String不是Number的子类
        //Generic2<String> stringGeneric = new Generic2<String>("12345");

    }
}
