package StringBufferBuilder;

import java.util.StringTokenizer;

public class MethodTokenizer {
    public static void main(String[] args) {
       StringTokenizer sb = new StringTokenizer("my name is vidya dharna"," ");
       // while (sb.hasMoreElements()){
          //  System.out.println(sb.nextToken());

       // }
      //  StringTokenizer sb = new StringTokenizer("my,name,is,vidya,dharna");
      //  System.out.println("my next token is  : "    + sb.nextToken(" ,"));
        System.out.println("Total of number of Tokens :"  + sb.countTokens());
    }
}
