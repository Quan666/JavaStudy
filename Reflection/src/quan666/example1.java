package quan666;

public class example1 {


    public static void main(String[] args) {
        String string="hello";
        
        Class cls = string.getClass();
        System.out.println(cls.toString());
        Class cls2 = String.class;
        System.out.println(cls==cls2);
        try {
            Class cls3 = Class.forName("java.lang.String");
            System.out.println(cls==cls3);
        }catch (Exception e){
            System.out.println(e);
        }
//        用instanceof不但匹配指定类型，还匹配指定类型的子类。而用==判断class实例可以精确地判断数据类型，但不能作子类型比较。
        Integer n = new Integer(123);

        boolean b1 = n instanceof Integer; // true，因为n是Integer类型
        boolean b2 = n instanceof Number; // true，因为n是Number类型的子类

        boolean b3 = n.getClass() == Integer.class; // true，因为n.getClass()返回Integer.class
        boolean b4 = n.getClass() == Number.class; // false，因为Integer.class!=Number.class
    }
}
