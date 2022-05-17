
public class Solution {
    public int sumOfTwo(int a, int b){

        return a + b;
    }

    public String evenOdd(int c){
        if(c % 2 == 0){
            return "This number is Even\n";
        }
        else if(c % 2 != 0) {
            return "This number is Odd\n";
        }
        return "";
    }

    public String abbrevOf10(String name){

//jeremiah791@revature.net

        if(name.length() >= 10){
            String first = " ";
            //name.charAt(0) = first;


            char firstIntitial = name.charAt(0);
            char lastInitial = name.charAt((name.length() - 1));


            System.out.println("The original name was: " + name);

            System.out.print(firstIntitial);
            System.out.print(name.length());
            System.out.print(lastInitial);


        }
        else {
            return name;
        }
        return "";
    }



    public static void main(String[] args ){
        //sum of Two
        Solution problem1 = new Solution();

        System.out.println(problem1.sumOfTwo(66,7));

        //even odd
        Solution problem2 = new Solution();

        System.out.println(problem2.evenOdd(10));

        //input name
        Solution problem3 = new Solution();

        System.out.println(problem3.abbrevOf10("JeremiahBolden"));

    }


}
