package com.journaldev.nested;

import com.journaldev.nested.OuterClass.InnerClass;
import com.journaldev.nested.OuterClass.StaticNestedClass;

import java.util.Arrays;

//nested classes can be used in import for easy instantiation

public class InnerClassTest {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass(1,2,3,4);

        //static nested classes example
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        StaticNestedClass staticNestedClass1 = new StaticNestedClass();
        // not allowed StaticNestedClass abc =  outer.StaticNestedClass();

        //staticNestedClass.
        System.out.println(staticNestedClass.getName());
        staticNestedClass.d=10;
        System.out.println(staticNestedClass.d);
        System.out.println(staticNestedClass1.d);

        //inner class example
        InnerClass innerClass = outer.new InnerClass();
        //innerClass. getI();
        System.out.println(innerClass.getName());
        System.out.println(innerClass);
        innerClass.setValues();
        System.out.println(innerClass);

        //calling method using local inner class
        outer.print("Outer");

        //calling method using anonymous inner class
        System.out.println(Arrays.toString(outer.getFilesInDir("src/com/journaldev/nested", ".java")));

        System.out.println(Arrays.toString(outer.getFilesInDir("bin/com/journaldev/nested", ".class")));



        NormalClass.foo();
    }

}
