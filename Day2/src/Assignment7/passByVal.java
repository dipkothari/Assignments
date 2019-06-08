package Assignment7;

public class passByVal {

    public static void main(String args[]) {
        int sID = 25;
        passByVal val = new passByVal();
        System.out.println("1:" + sID);
        //Student deep = new Student();
        val.passTheValueMethod(sID);
        System.out.println("The sID are 2:" + sID);
    
    }
    public void passTheValueMethod(int sID){
     sID = 10;
     // deep.setGetStudentId(22);
        System.out.println("The sID are 4:" +sID);
    }
}
