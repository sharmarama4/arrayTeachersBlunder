public class Exercise {
    public static void main(String[] args) {
        int[] studentPoints = {1, 5, 6, -9, 77, 110, -4, 3, 10, 2};
        //if number are greater than 10 then divide by 11
        for (int i = 0; i < studentPoints.length; i++) {
            if (studentPoints[i] > 10) {
                studentPoints[i] /= 11;

            }
            System.out.print(studentPoints[i] + " ");

        }
        System.out.println();
        //if the number negative is then make it positive
        for(int i=0;i<studentPoints.length;i++){
            if(studentPoints[i]<0){
            studentPoints[i]=-studentPoints[i];
            }
            System.out.print(studentPoints[i]+" ");
        }
        System.out.println();
//if you have numbers they are smaller than 3,then you have to do maal 3
        for(int i=0;i<studentPoints.length;i++){
           if(studentPoints[i]<3 && studentPoints[i]>0){
               studentPoints[i]*=3;
               }
            System.out.print(studentPoints[i]+" ");
        }
    }

}