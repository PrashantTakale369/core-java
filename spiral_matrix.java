class spiral_matrix {

    public static void matrix_bg(int matrix [][]){
        int startROW=0;
        int startCOL=0;
        int endROW = matrix.length -1;
        int endCOL = matrix[0].length-1;

while (startROW <= endROW && startCOL<= endCOL) {

    // TOP 

    for(int j=startCOL;j<=endCOL;j++){
        System.out.print(matrix[startROW][j] +" ");
    }

    // RIGHT 

    for(int i=startROW+1;i<=endROW;i++){
        System.out.print(matrix[i][endCOL]+" ");
    }
    
    //BOTTOm

    for(int j=endCOL;j>=startCOL;j--){
        System.out.print(matrix[endROW][j]+" ");
    }

    //LEFT

    for(int i=endROW-1;i>=startROW+1;i--){
        System.out.print(matrix[i][startCOL]+" ");
    }

    startCOL++;
    startROW++;
    endCOL--;
    endROW--;
}
System.out.println();

    }

    public static void main(String[] args) {

        int matrix [][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
        };

        System.out.println("spiral matrix code :");
        matrix_bg(matrix);
        
        
    }
}
