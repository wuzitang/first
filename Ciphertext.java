public class Ciphertext {
    public String decrypt(String s){
        char []a=new char[s.length()];
        a=s.toCharArray();//以字符串创建字符数组
        int b[]=new int[s.length()];
        for(int i=0;i<a.length;i++){
            b[i]=2*a[i]+3;
            a[i]=(char)b[i];
        }//每个字符进行ascii编码运算 加上其本身编码并加3 通过强制类型转换实现int 和char两种数据类型的转换计算
        char c,d;
        c=a[0];
        d=a[s.length()-1];
        a[0]=d;
        a[s.length()-1]=c;//实现首尾互换
        String e= new String(a);////通过String类的构造方法，以字符数组a创建String类型对象
        s=new StringBuffer(e).reverse().toString();//反转字符串
        System.out.println("加密后的结果是："+s);
        return s;//返回加密结果
    }
    public String encrypt(String s){
        String e=new StringBuffer(s).reverse().toString();//反转字符串
        char[]a=e.toCharArray();//以反转后的字符串创建字符数组
        char c,d;
        c=a[0];
        d=a[s.length()-1];
        a[0]=d;
        a[s.length()-1]=c;//首尾互换
        int []b=new int[s.length()];
        for (int i=0;i<a.length;i++){
            b[i]=(a[i]-3)/2;
            a[i]=(char)b[i];
        }//每个字符进行ascii编码运算 减去3并除以2 通过强制类型转换实现int 和char两种数据类型的转换计算
        s=new String(a);//通过String类的构造方法，以字符数组a创建String类型对象
        System.out.println("解密后结果为:"+s);
        return s;//返回解密结果
    }
}
