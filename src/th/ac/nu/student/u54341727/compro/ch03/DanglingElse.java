package th.ac.nu.student.u54341727.compro.ch03;
 class DanglingElse {

     public static void main(String[] args) {
         int x = 5 ;
         if (x < 5)
             if (x > 5)
                 System.out.println('b');
         else
                 System.out.println('a');
     }
 }