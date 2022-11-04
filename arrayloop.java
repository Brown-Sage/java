import javax.lang.model.element.Element;

public class arrayloop {
    public static void main(String[] args) {
        int[] marks = {100,98,40,69,65,91};
        System.out.println(marks.length + " this the the total arrays");        //marks.length is used to know the total entity

        // for(int i=0;i<marks.length;i++ ){
        // System.out.println(marks[i]);             //printing every marks is waste hardwork we use loops instead
        
        //lets print marks in reverse order
       //  for(int i= marks.length -1; i>=0;i--){
       //     System.out.println(marks[i]);          //printing arrays in reverse order
         
       // for-each loop
       for (int dkdc:marks){                         //its a specefic java program for loop
        System.out.println(dkdc);                    //printing by for-each loop
       }
    }
}

