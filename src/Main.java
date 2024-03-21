//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


                int[] array = new int[10];


                Random random = new Random();
                for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(100) + 1;
                }


                int min = array[0];
                int max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                    if (array[i] > max) {
                        max = array[i];
                    }
                }


                System.out.println("Array elements:");
                for (int num : array) {
                    System.out.print(num + " ");
                }
                System.out.println("\nSmallest element: " + min);
                System.out.println("Largest element: " + max);
            }

        }

