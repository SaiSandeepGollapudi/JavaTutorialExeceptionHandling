package org.example;

public class FinallyThrowThrowsDemo {
    static void meth1()throws Exception
    {
        try
        {
            throw new Exception();
        }
        finally
        {
            //this message will definitely execute
            System.out.println("Final Message");
        }
    }

    public static void main(String[] args) throws Exception
    {
        meth1();
    }
}
