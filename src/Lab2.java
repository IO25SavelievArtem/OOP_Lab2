public class Lab2 {
    public static void main(String[] args) {
        float A[][] = {{4, 7, 7},
                {5, 1, 8},
                {4, 8, 4},
                {4, 5, 3},
                {2, 4, 8}};
        float B[][] = {{8, 1, 4},
                {2, 7, 1},
                {4, 7, 1},
                {7, 9, 6},
                {4, 5, 6}};
        float sum = 0;
        float max = 0;
        float min = 0;

        float C[][] = new float [B[0].length][B.length];
        for (int i = 0; i < B[i].length; i++){
            for (int j = 0; j < B.length; j++){
                C[i][j] = B[j][i];	//Траснпортування матриці
                if (i % 2 == 0){	//Переріка на парність стовпчика, якщо непарний то:
                    if ((j==0)||(max < B[j][i])){max = B[j][i];}	//якщо перший рядок або значення більше попереднього максимума то: записати як максимум
                }
                else if ((j==0)||(min > B[j][i])){min = B[j][i];}	//якщо парний стовпчик то: якщо перший рядок або значення менше попереднього мінімума то: записати як мінімум
            }
            if (i % 2 == 0){sum += max;} //Додати до суми максимум непарного рядка
            else {sum += min;} //Додати до суми мінімум парного рядка
        }
        System.out.println("Матриця B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " \t");
            }
            System.out.println("");
        }
        System.out.println("Матриця С:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " \t");
            }
            System.out.println("");
        }
        System.out.println("\nСума найбільших елементів в стовпцях матриці C з непарними номерами\nта найменших елементів в стовпцях матриці C з парними номерами: " + sum);
    }
}