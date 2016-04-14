package com.interview.specialist.chapter2;

/**
 * Created by Jerry on 4/14/16.
 */
/*
javap -verbose JavaSampleAppend

Classfile /Users/Jerry/Workspaces/interview/out/production/interview/com/interview/specialist/chapter2/JavaSampleAppend.class
  Last modified Apr 14, 2016; size 525 bytes
  MD5 checksum d04ce2570f62a97e04decfa968565fdc
  Compiled from "JavaSampleAppend.java"
public class com.interview.specialist.chapter2.JavaSampleAppend
  minor version: 0
  major version: 50
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #3.#21         // java/lang/Object."<init>":()V
   #2 = Class              #22            // com/interview/specialist/chapter2/JavaSampleAppend
   #3 = Class              #23            // java/lang/Object
   #4 = Utf8               <init>
   #5 = Utf8               ()V
   #6 = Utf8               Code
   #7 = Utf8               LineNumberTable    //行号表
   #8 = Utf8               LocalVariableTable //局部变量表
   #9 = Utf8               this
  #10 = Utf8               Lcom/interview/specialist/chapter2/JavaSampleAppend;
  #11 = Utf8               main                    //方法名
  #12 = Utf8               ([Ljava/lang/String;)V  //方法参数
  #13 = Utf8               args                    //方法参数名
  #14 = Utf8               [Ljava/lang/String;
  #15 = Utf8               a
  #16 = Utf8               I
  #17 = Utf8               b
  #18 = Utf8               c
  #19 = Utf8               SourceFile
  #20 = Utf8               JavaSampleAppend.java
  #21 = NameAndType        #4:#5          // "<init>":()V
  #22 = Utf8               com/interview/specialist/chapter2/JavaSampleAppend
  #23 = Utf8               java/lang/Object
{
  public com.interview.specialist.chapter2.JavaSampleAppend();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/interview/specialist/chapter2/JavaSampleAppend;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_1                 //将int类型的值1推送到栈顶
         1: istore_1                 //栈顶元素弹出,赋值给slot1的本地变量
         2: iconst_2                 //
         3: istore_2                 //栈顶元素弹出,赋值给slot2的本地变量
         4: iload_1                  //将slot1上的值放在栈顶
         5: iload_2                  //将slot2上的值放在栈顶
         6: iadd                     //执行add操作
         7: istore_3                 //栈顶元素弹出,赋值给slot3的本地变量
         8: return                   //返回
      LineNumberTable:
        line 9: 0
        line 10: 2
        line 11: 4
        line 12: 8
      LocalVariableTable:                                //本地变量表
        Start  Length  Slot  Name   Signature
            0       9     0  args   [Ljava/lang/String;  //参数位置slot0
            2       7     1     a   I                    //a的slot1
            4       5     2     b   I                    //b的slot2
            8       1     3     c   I                    //c的slot3
}
SourceFile: "JavaSampleAppend.java"
*/
public class JavaSampleAppend {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
    }
}
