public class Ciphertext {
    public String decrypt(String s){
        char []a=new char[s.length()];
        a=s.toCharArray();
        int b[]=new int[s.length()];
        for(int i=0;i<a.length;i++){
            b[i]=2*a[i]+3;
            a[i]=(char)b[i];
        }//每个字符进行ascii编码运算
        char c,d;
        c=a[0];
        d=a[s.length()-1];
        a[0]=d;
        a[s.length()-1]=c;//首位互换
        String e= new String(a);
        s=new StringBuffer(e).reverse().toString();//反转字符串
        System.out.println("加密后的结果是："+s);
        return s;
    }
    public String encrypt(String s){
        String e=new StringBuffer(s).reverse().toString();
        char[]a=e.toCharArray();
        char c,d;
        c=a[0];
        d=a[s.length()-1];
        a[0]=d;
        a[s.length()-1]=c;//首位互换
        int []b=new int[s.length()];
        for (int i=0;i<a.length;i++){
            b[i]=(a[i]-3)/2;
            a[i]=(char)b[i];
        }
        s=new String(a);
        System.out.println("解密后结果为:"+s);
        return s;
    }
}
