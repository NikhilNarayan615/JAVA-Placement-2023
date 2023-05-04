public class StringBuilder1{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello");
        for(int i =0; i < sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
    }
        // System.out.println(sb);

        //char At index 0
        // System.out.println(sb.charAt(0));

        // //set char at index 0

        // sb.setCharAt(0,'P');
        // System.out.println(sb);

        // sb.insert(0 , 'S');
        // System.out.println(sb);

        // sb.delete(0,0);
        // System.out.println(sb);

        // sb.append("i");
        // sb.append("k");
        // sb.append("h");
        // sb.append("i");
        // sb.append("l");
        // System.out.println(sb.length());


        


    }
