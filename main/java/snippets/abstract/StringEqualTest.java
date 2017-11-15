Compiled from "StringEqualTest.java"
public class StringEqualTest {
  public StringEqualTest();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: ldc           #2                  // String Programming
       2: astore_1
       3: new           #3                  // class java/lang/String
       6: dup
       7: ldc           #2                  // String Programming
       9: invokespecial #4                  // Method java/lang/String."<init>":(Ljava/lang/String;)V
      12: astore_2
      13: ldc           #5                  // String Program
      15: astore_3
      16: ldc           #6                  // String ming
      18: astore        4
      20: ldc           #2                  // String Programming
      22: astore        5
      24: new           #7                  // class java/lang/StringBuilder
      27: dup
      28: invokespecial #8                  // Method java/lang/StringBuilder."<init>":()V
      31: aload_3
      32: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      35: aload         4
      37: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      40: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      43: astore        6
      45: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
      48: aload_1
      49: aload_2
      50: if_acmpne     57
      53: iconst_1
      54: goto          58
      57: iconst_0
      58: invokevirtual #12                 // Method java/io/PrintStream.println:(Z)V
      61: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
      64: aload_1
      65: aload         5
      67: if_acmpne     74
      70: iconst_1
      71: goto          75
      74: iconst_0
      75: invokevirtual #12                 // Method java/io/PrintStream.println:(Z)V
      78: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
      81: aload_1
      82: aload         6
      84: if_acmpne     91
      87: iconst_1
      88: goto          92
      91: iconst_0
      92: invokevirtual #12                 // Method java/io/PrintStream.println:(Z)V
      95: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
      98: aload_1
      99: aload         6
     101: invokevirtual #13                 // Method java/lang/String.intern:()Ljava/lang/String;
     104: if_acmpne     111
     107: iconst_1
     108: goto          112
     111: iconst_0
     112: invokevirtual #12                 // Method java/io/PrintStream.println:(Z)V
     115: getstatic     #11                 // Field java/lang/System.out:Ljava/io/PrintStream;
     118: aload_2
     119: aload_2
     120: invokevirtual #13                 // Method java/lang/String.intern:()Ljava/lang/String;
     123: if_acmpne     130
     126: iconst_1
     127: goto          131
     130: iconst_0
     131: invokevirtual #12                 // Method java/io/PrintStream.println:(Z)V
     134: return
}
