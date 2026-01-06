    import arrays.ArrayEasyProblems;
    import dp.DynamicProgramming;
    import linkedlist.ArrayToLinkedList;
    import linkedlist.Node;
    import linkedlist.singly.SinglyLinkedList;
    import linkedlist.singly.SinglyNode;

    import java.util.Arrays;
    import java.util.LinkedList;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args){

                int n = 50;
                long[]dp = new long[n+1];
                Arrays.fill(dp, -1);

                System.out.println(DynamicProgramming.fibonacciDp(n, dp));
        }
    }