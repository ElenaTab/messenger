import org.testng.Assert;

public class Test {

    @org.testng.annotations.Test
    public void  testSumm(){
        MyFirstTest myFirstTest =new MyFirstTest();
        Assert.assertEquals(myFirstTest.summ(2,3), 4, "Summ is wrong");
    }

}
