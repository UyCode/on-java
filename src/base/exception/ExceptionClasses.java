package base.exception;


/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/6/2021 22:27
 */

public class ExceptionClasses {


    public void cacheException() throws Exception {

        int[] nums = {1, 3, 5};

        try {
            System.out.println("try block");
            for (int num : nums) {
                System.out.println(num);
                nums[nums.length + 1] = 5;
            }
        }catch (Exception e) {
            System.out.println("exception block");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally block after try and exception");
        }

        //throw new Exception();
    }

    
}
