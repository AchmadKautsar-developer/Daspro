public class OperatorLogika {  
         public static void main(String[] args) {  

             boolean _true = true; 
             boolean _false = false; 

                System.out.println("Relation with QR (||)");
                System.out.println("true || true = " + (_true || _true));
                System.out.println("true || false = " + (_true || _false));
                System.out.println("false || true = " + (_false || _true));
                System.out.println("false || false = " + (_false || _false));

                System.out.println("Relation with AND (&&)");
                System.out.println("true && true = " + (_true && _true));
                System.out.println("true && false = " + (_true && _false));
                System.out.println("false && true = " + (_false && _true));
                System.out.println("false && false = " + (_false && _false));

                System.out.println("Relation with NOT (!)");
                System.out.println("!true = " + (!_true));
                System.out.println("!false = " + (!_false));

         }
}
